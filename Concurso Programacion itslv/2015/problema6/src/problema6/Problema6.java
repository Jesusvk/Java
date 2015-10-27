/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Types;
import java.*;

/**
 *
 * @author EQUIPO 01
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int entrada = Integer.parseInt(bf.readLine());
        String a = Integer.toBinaryString((entrada));
        StringBuilder aux = new StringBuilder(a);
        String reverso = aux.reverse().toString();
        String complemento = "";
        char[] cadena = a.toCharArray();
        for (int i = 0; i < cadena.length; i++) {
            String tempo = cadena[i] + "";
            if (tempo.equals("1")) {
                cadena[i] = '0';
            } else if (tempo.equals("0")) {
                cadena[i] = '1';
            }
            complemento += cadena[i];
        }
        aux = new StringBuilder(complemento);
        cadena = (aux.reverse() + "").toCharArray();
        int binario = 0, doble = 1;
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == '1') {
                binario = binario + doble;
            }
            doble = doble + doble;
        }
        System.out.print(binario + " ");
        binario = 0;
        doble = 1;
        aux = new StringBuilder(reverso);
        cadena = (aux.reverse() + "").toCharArray();
        for (int i = 0; i < cadena.length; i++) {

            if (cadena[i] == '1') {
                binario = binario + doble;
            }
            doble = doble + doble;
        }
        System.out.print(binario);
        
    }

}
