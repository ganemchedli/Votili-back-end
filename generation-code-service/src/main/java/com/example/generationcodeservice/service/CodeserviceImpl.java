package com.example.generationcodeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.generationcodeservice.repository.CodeRepository;
import com.example.generationcodeservice.entity.Code;
import com.example.generationcodeservice.entity.CodeNum;
//import com.example.generationcodeservice.entitie.QRcode;


@Service
public class CodeserviceImpl implements Codeservice {
    @Autowired
    CodeRepository pr;
    @Override
    public CodeNum saveCodenum(CodeNum c) {
        return pr.save(c);
    }
    /*public QRcode saveQRcode(QRcode c) {

        return pr.save(c);
    }*/
    @Override
    public void deleteCodenum(CodeNum c) {
        // TODO Auto-generated method stub
        pr.delete(c);
    }

    /*public void  deleteQRcode(QRcode c ){
      pr.delete(c);
    }*/
    @Override
    public void deleteCodeById(Long id) {
        // TODO Auto-generated method stub
        pr.deleteById(id);
    }
    @Override
    public Code getCode(Long id) {
        // TODO Auto-generated method stub
        return pr.findById(id).get();
    }
    @Override
    public CodeNum CreeCodeNum() {
        CodeNum c = new CodeNum();
        c.creerCode();
        pr.save(c);
        return c;
    }
	/*@Override
	public QRcode CreeQRcode() throws WriterException, IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\User\\Desktop\\test\\Quote.png";  
		//String img = "quote.png" ;
		QRcode c= new QRcode(path);
		c.creerCode();
		pr.save(c);
		return c;
		//System.out.println("code created!");
	}*/
	/*
	@Override
	public void CreeQRcode('lll' ) throws WriterException, IOException {
		
		String str= "THE HABIT OF PERSISTENCE IS THE HABIT OF VICTORY.";  
		JLabel lien= new JLabel();
		
		String charset = "UTF-8";  
		String path = "C:\\Users\\User\\Desktop\\test\\Quote.png";  
		Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>(); 
		hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);  
        QRcode code=new QRcode();
        code.creerCode(str, path, charset, hashMap, 200, 200);
	   pr.save(code);
	  System.out.println("code created!");
	}
*/
}
