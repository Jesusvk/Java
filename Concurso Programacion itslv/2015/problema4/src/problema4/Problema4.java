/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.io.*;
import java.util.Vector;

/**
 *
 * @author EQUIPO 01
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String entrada = "";
        Vector salida = new Vector();
        int suma = 0;
        while (!entrada.equals("0")) {
            entrada = bf.readLine();
            if (Integer.parseInt(entrada) > 0) {
                if (Integer.parseInt(entrada) % 7 == 0) {
                    salida.addElement("pi");
                } else if (Integer.parseInt(entrada) == 7) {
                    salida.addElement("pi");
                } else {

                    boolean t = false;
                    char[] aux = entrada.toCharArray();
                    suma = 0;
                    for (int i = 0; i < aux.length; i++) {
                        suma = suma + Integer.parseInt("" + aux[i]);
                        
                        if (aux[i] == '7') {
                            salida.addElement("pi");
                            t = true;
                        }
                    }
                    if (suma == 7) {
                        salida.addElement("pi");
                        t = true;
                        suma = 0;

                    }
                    if (t == false) {
                        salida.addElement(entrada);
                    }
                }
            }

        }
        for (Object object : salida) {
            System.out.println(object);
        }

    }

}
