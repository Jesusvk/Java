/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author EQUIPO 01
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int parejas = 0;
        Vector arreglo = new Vector();
        System.out.println("Entrada");
        String entrada = "";
        while (!entrada.equals("0")) {
            entrada = bf.readLine();
            arreglo.addElement(entrada);
        }
        int size = arreglo.size();
        while(size != 0){
            String cadena = arreglo.elementAt(size).toString();
            int tamallo = cadena.length();
            
        }
    }

}
