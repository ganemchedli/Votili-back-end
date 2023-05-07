package com.example.generationcodeservice.entity;

import java.nio.charset.Charset;
import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Codenum")
@AllArgsConstructor
@NoArgsConstructor
public class CodeNum extends Code {

    @Column(name = "code_num")
    private String codeNum;

    @Override
    public String toString() {
        return "CodeNum [getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    @Override
    public void creerCode() {
        int i = 14;
        byte[] bytearray;// bind the length
        bytearray = new byte[256];

        String mystring;
        StringBuffer thebuffer;
        String thealphanumerics;

        new Random().nextBytes(bytearray);

        mystring = new String(bytearray, Charset.forName("UTF-8"));

        thebuffer = new StringBuffer();

        //remove all spacial char
        thealphanumerics = mystring.replaceAll("[^A-Z0-9]", "");

        //random selection
        for (int m = 0; m < thealphanumerics.length(); m++) {

            if (Character.isLetter(thealphanumerics.charAt(m)) && (i > 0) || Character.isDigit(thealphanumerics.charAt(m)) && (i > 0)) {

                thebuffer.append(thealphanumerics.charAt(m));
                i--;
            }
        }
        codeNum = thebuffer.toString();
        // the resulting string
    }
}
