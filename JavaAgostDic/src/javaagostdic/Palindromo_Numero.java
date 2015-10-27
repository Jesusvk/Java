/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaagostdic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jesus
 */
public class Palindromo_Numero {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        String numero = bf.readLine().replace("", " ");
        System.out.println("Numero: " + numero);
        StringBuffer temporal = new StringBuffer(numero);
        String new_numero = new String(temporal.reverse());
        if(new_numero.equalsIgnoreCase(numero)){
            System.out.println("Palindromo\n"+numero+" == "+new_numero);
        }else{
            System.out.println("No es Palindromo\n"+numero+" != "+new_numero);
        }
        
    }
}
