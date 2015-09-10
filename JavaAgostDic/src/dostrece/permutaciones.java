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
public class permutaciones {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entrada");
        String entrada = bf.readLine();
        char [] cadena = entrada.toCharArray();
        int repetido = 0;
        for(int i = 0;i<entrada.length();i++){
            for (int j = 0; j < entrada.length(); j++) {
                if(cadena[i] == cadena[j]){
                    repetido++;
                    if (repetido>entrada.length()) {
                        System.out.println("Caracter Repetido");
                        System.exit(1);
                    }
                }
            }
        }
        int n = entrada.length()*entrada.length();
        String [] permutaciones = new String[n];
        for (int i = 0; i < entrada.length(); i++) {
            permutaciones[i] = ""+ cadena[i];
        }
        permutaciones(permutaciones,"",entrada.length(),entrada.length());
        
    }
    private static void permutaciones(String[] elem, String act, int n, int r) {
        if (n == 0) {
            System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) { // Controla que no haya repeticiones
                    permutaciones(elem, act + elem[i] + "", n - 1, r);
                }
            }
        }
    }
}
