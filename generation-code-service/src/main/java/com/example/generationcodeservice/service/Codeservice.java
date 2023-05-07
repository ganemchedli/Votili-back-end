package com.example.generationcodeservice.service;

import com.example.generationcodeservice.entity.Code;
import com.example.generationcodeservice.entity.CodeNum;
//import com.example.generationcodeservice.entitie.QRcode;


public interface Codeservice {

    CodeNum saveCodenum(CodeNum c);

    /*QRcode saveQRcode(QRcode c);*/
    void deleteCodenum(CodeNum c);

    /*	void deleteQRcode(QRcode c );*/
    void deleteCodeById(Long id);

    Code getCode(Long id);

    CodeNum CreeCodeNum();
    /*QRcode CreeQRcode() throws WriterException, IOException;*/
}
