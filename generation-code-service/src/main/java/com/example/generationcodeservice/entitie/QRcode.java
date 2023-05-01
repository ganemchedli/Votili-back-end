package com.example.generationcodeservice.entitie;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@DiscriminatorValue("QRcode")
public class QRcode extends Code {
	
	public QRcode()
	{super();}
	
	
	
	@Column(name="img_url")
	private String img;
	
	
	public QRcode(String p)
	{
		this.img=p;
	}
	
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
     
	
	
	
	
	@Override
	public String toString() {
		return "QRcode [img=" + img + "]";
	}


	@Override
	public  void creerCode() throws IOException, WriterException  
	{ 
	
		String charset = "UTF-8"; 
		Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>(); 
		hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);  
        int w=200;
        int h=200;
	String data="he4a QRcode mtee ichrak :)";
	BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, w, h);  
	MatrixToImageWriter.writeToFile(matrix, img.substring(img.lastIndexOf('.') + 1), new File(img));  
	
	
	}

	

}
