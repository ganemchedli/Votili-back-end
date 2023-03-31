package com.example.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.entitie.*;
import com.google.zxing.EncodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

@SpringBootApplication
public class TestCodeApplication {

	public static void main(String[] args)throws WriterException, IOException, NotFoundException   {
		SpringApplication.run(TestCodeApplication.class, args);
		
		/*CodeNum code=new CodeNum();
		int i =(int) Math.random();
		System.out.println();
		code.creerCode();
		System.out.println(code.getCodenum());
		System.out.println("hello world!");
		
		
		String path = "C:\\Users\\User\\Desktop\\test\\testQR.png";  
		QRcode code=new QRcode(path);
        code.creerCode();
        System.out.println("code created");
        */
	}

}
