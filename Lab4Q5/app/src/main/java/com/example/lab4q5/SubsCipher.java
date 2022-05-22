package com.example.lab4q5;

import java.util.Locale;

public class SubsCipher {
    public static String encrypt(String plain)
    {
        String temp="";
        for(int i=0;i<plain.length();i++)
        {
            if(plain.toLowerCase().charAt(i)== 'a') temp += "e";
            else if(plain.toLowerCase().charAt(i)== 'e') temp += "o";
            else if(plain.toLowerCase().charAt(i)== 'i') temp += "u";
            else if(plain.toLowerCase().charAt(i)== 'o') temp += "i";
            else if(plain.toLowerCase().charAt(i)== 'u') temp += "a";
            else temp += plain.charAt(i);
        }
        return temp;
    }
    public static String decrypt(String cipher)
    {
        String temp="";
        for(int i=0;i<cipher.length();i++)
        {
            if(cipher.toLowerCase().charAt(i)== 'e') temp += "a";
            else if(cipher.toLowerCase().charAt(i)== 'o') temp += "e";
            else if(cipher.toLowerCase().charAt(i)== 'u') temp += "i";
            else if(cipher.toLowerCase().charAt(i)== 'i') temp += "o";
            else if(cipher.toLowerCase().charAt(i)== 'a') temp += "u";
            else temp += cipher.charAt(i);
        }
        return temp;
    }
}
