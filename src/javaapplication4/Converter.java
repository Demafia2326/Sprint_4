/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


/**
 *
 * @author danie
 */
public class Converter {
    
    private static final String patronPunto = "([0-9A-F]+\\.)+[0-9A-F]+";
   
    public String intToHex(int n){
        return Integer.toHexString(n).toUpperCase();
    }
    
    public String intToBin(int n){
        return Integer.toBinaryString(n);
    }
    
    //onChange
    //codeOrigin=decimal
    
    public String binToDec(int n){
        int decimal = 0;
        int binary = n;
        int power = 0;
 
        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary = binary / 10;
        }
        
    
        String decimalreal = Integer.toString(decimal);
        return decimalreal;
    }
    
    public String binToHex(int n){         
        String reprHex = Integer.toString( n, 16 );
        return reprHex;
    }
    
    
    
    
    public String hexToDec(String n){
        n = n.toUpperCase();  
        int val = 0;  
        for (int i = 0; i < n.length(); i++)  
        {  
            char c = n.charAt(i);  
            String digits="";
            int d = digits.indexOf(c);  
            val = 16*val + d;  
        }  
        return Integer.toString(val);  

                
    }
    
    public String hexToBin(String n){
        int numHex = Integer.parseInt(n, 16);
        String binary = Integer.toBinaryString(numHex);
        return binary;
                
    }
    
    public String decToBin(String n){
        String ip=n;
        System.out.println("Entra 1");
        String[] ips= ip.split("\\.");
        String[] ipr= new String[ips.length];
        System.out.println("Entra2");
        
        for (int i = 0; i < ips.length; i++) {
             ipr[i]=Integer.toBinaryString(Integer.valueOf(ips[i]));
         System.out.println(ipr);
        }
        StringBuilder resuelto=new StringBuilder();
        System.out.println("Holla");
        for (String x : ipr) {
            resuelto.append(x);
            resuelto.append(".");
        }
        return "Hola";//resuelto.toString();
    }
    
    public static boolean buscaPunto(String n){
        boolean busca=false;
        
        for (int i = 0; i < n.length() && !busca; i++) {
            if(n.charAt(i)=='.')
                busca=true;            
        }
        System.out.println(busca);
        return busca;
    }
      
    
    
    
    
    
    
    
}
