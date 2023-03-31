package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CodeserviceImpl;
import com.example.demo.entitie.Code;
import com.example.demo.entitie.CodeNum;
import com.google.zxing.WriterException;

@RestController
public class controllercode {
	@Autowired
	CodeserviceImpl cs;
	
	
	@RequestMapping("/hello")
	public String sayhello()
	{return "hello world!";
	}
	
	@GetMapping (path="/code/{id}")
	
	public Code getcodebyid (@PathVariable Long id)
	{
		return cs.getCode(id);
		
	}
	
	@GetMapping (path ="/creecodenum")
	public Code Creecodenum()
	
	{
		return cs.CreeCodeNum();
		
	}
	
	
	@GetMapping (path ="/creeqrcode")
	public Code CreeQRcode() throws WriterException, IOException
	
	{
		return cs.CreeQRcode();
		
	}
	
	
	
	

}
