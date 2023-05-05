package com.example.generationcodeservice.entitie;

import java.nio.charset.Charset;
import java.util.Random;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@DiscriminatorValue("Codenum")
public  class CodeNum  extends Code {

	public CodeNum() {super();}
	
	@Column(name="code_num")
	private String codenum;
	
	public CodeNum(String n)
	{
		this.codenum=n;
	}
	
	public String getCodenum() {
		return codenum;
	}



	public void setCodenum(String codenum) {
		this.codenum = codenum;
	}



	@Override
	public String toString() {
		return "CodeNum [getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}



	


       @Override
	public void creerCode() {
		// TODO Auto-generated method stub
	int i=14;
		 byte[] bytearray;
	        // bind the length 
	        bytearray = new byte[256];      
	       
	        String mystring;
	        StringBuffer thebuffer;
	        String theAlphaNumericS;

	        new Random().nextBytes(bytearray); 

	        mystring 
	            = new String(bytearray, Charset.forName("UTF-8")); 
	            
	        thebuffer = new StringBuffer();
	        
	        //remove all spacial char 
	        theAlphaNumericS 
	            = mystring 
	                .replaceAll("[^A-Z0-9]", ""); 

	        //random selection
	        for (int m = 0; m < theAlphaNumericS.length(); m++) {

	            if (Character.isLetter(theAlphaNumericS.charAt(m)) 
	                    && (i > 0) 
	                || Character.isDigit(theAlphaNumericS.charAt(m)) 
	                    && (i > 0)) {

	                thebuffer.append(theAlphaNumericS.charAt(m)); 
	                i--; 
	            } 
	        } 
	    
	          codenum = thebuffer.toString();
	        // the resulting string 
	        
		
	}

	
	
	

}
