package com.example.generationcodeservice.Service;

import java.io.IOException;

import com.example.generationcodeservice.entitie.Code;
import com.example.generationcodeservice.entitie.CodeNum;
import com.example.generationcodeservice.entitie.QRcode;
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
