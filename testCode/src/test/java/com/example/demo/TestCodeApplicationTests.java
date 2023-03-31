package com.example.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repos.CodeRepository;
import com.example.demo.Service.Codeservice;
import com.example.demo.Service.CodeserviceImpl;
import com.example.demo.entitie.Code;
import com.example.demo.entitie.CodeNum;
import com.example.demo.entitie.QRcode;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;



@SpringBootTest
class TestCodeApplicationTests {

	@Autowired
	
	private CodeRepository cr;
	//private codeRepositoryQR qr;
	
	
	/*
	@Test
	public void CreateCodeNum() {
		CodeNum c = new CodeNum();
		c.creerCode();
		cr.save(c);
	}
	
*/
		
	

	/*
	
	@Test
	public void getCodeNum() {
	
		Code c =cr.findById(1L).get();
		System.out.println(c);
		
		}
	*/
	
	/*
	
	@Test
	public void getCodeQR() {
	
		Code c =qr.findById(2L).get();
		System.out.println(c);
		
		}
	
	
	*/
		

	@Test
	public void CreateQRcode() throws WriterException, IOException
	{
		String path="C:\\Users\\User\\Desktop\\test\\Quote.png";
		QRcode code= new QRcode(path);
		code.creerCode();
		cr.save(code);
	}
		

	
	
	/*   @Test
	public void deleatecodenum()
	{
		
		cr.deleteById(1L);
		System.out.println("code deleated ");
		
	}
	*/
	
	/*
	public Long idd = (long) 302;
	@Test
	public void deleatecodenum()
	{
		
		cr.deleteById(302L);
		System.out.println("code deleated");
		
	}
	*/
}
