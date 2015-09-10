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
import java.util.StringTokenizer;

public class contador_palabras {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entrada\t");
        String entrada = bf.readLine();
        String[] cadena = entrada.split(" ");
        String[] contador_cadenas = new String[cadena.length];
        String temporal = "0";
        int[] numero_coincidencias = new int[cadena.length];
        for (int i = 0; i < cadena.length; i++) {
            numero_coincidencias[i] = 0;
        }
        for (int j = 0; j < contador_cadenas.length; j++) {
            for (int i = 0; i < cadena.length; i++) {
                if (contador_cadenas[j] == null) {
                    contador_cadenas[j] = cadena[i];
                    numero_coincidencias[j]++;
                } else if (cadena[i] == contador_cadenas[j]) {
                    numero_coincidencias[j]++;
                }
            }
        }
        for (int i = 0; i < contador_cadenas.length; i++) {
            System.out.println(contador_cadenas[i] + " " + ("" + numero_coincidencias[i]));
        }
    }
}
