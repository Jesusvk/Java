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
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("ingrese palabra");
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        String word = bf.readLine().replace(" ", "").toLowerCase();
        StringBuffer pali = new StringBuffer(word);
        pali = pali.reverse();
        String new_word = new String(pali);
        if(new_word.equalsIgnoreCase(word)){
            System.out.println("Es palindrome");
        }else{
            System.out.println("No es palindrome");
        }
    }
}
