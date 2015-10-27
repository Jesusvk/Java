/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dostrece;

/**
 *
 * @author jesus
 */
import java.io.*;
import java.util.Vector;
public class encriptacion{
    public static void main(String[] args) throws IOException{
        System.out.println("Entrada");
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        String entrada = bf.readLine();
        entrada = entrada.toLowerCase();
        if(entrada.length()<=1000){
            String salida = entrada.replaceAll("a", "hola");
            System.out.println(salida);
        }
    }
}
