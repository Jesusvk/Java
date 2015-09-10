/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dostrece;

import java.io.*;

/**
 *
 * @author jesus
 */
public class palindromos {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entrada");
        String temporal = bf.readLine();
        String word = temporal.replace(" ", "");
        StringBuilder aux = new StringBuilder(word);
        String new_word = aux.reverse().toString();
        if (new_word.equalsIgnoreCase(word)) {
            System.out.println(temporal + " PALINDROMA");
        } else {
            System.out.println(temporal + " NO PALINDROMA");
        }

    }
}
