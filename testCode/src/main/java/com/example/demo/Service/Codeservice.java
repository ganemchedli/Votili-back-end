package com.example.demo.Service;

import java.io.IOException;

import com.example.demo.entitie.Code;
import com.example.demo.entitie.CodeNum;
import com.example.demo.entitie.QRcode;
import com.google.zxing.WriterException;

public interface Codeservice {

	CodeNum saveCodenum(CodeNum c);
	QRcode saveQRcode(QRcode c);
	
	void deleteCodenum(CodeNum c );
	void deleteQRcode(QRcode c );
	
	
	void deleteCodeById(Long id);
	
	
	Code getCode(Long id);
	
	CodeNum CreeCodeNum();
	
	QRcode CreeQRcode() throws WriterException, IOException;
	
	

}
