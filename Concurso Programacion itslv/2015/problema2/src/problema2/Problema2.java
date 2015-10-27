/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.io.*;

/**
 *
 * @author EQUIPO Gerarquia
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entrada");
        String entrada = bf.readLine();
        char[] cadena = entrada.toCharArray();
        int valor = 0;
        for (int i = 0; i < cadena.length; i++) {
            String temporal = cadena[i] + "";
            if (temporal.equalsIgnoreCase("q") || temporal.equalsIgnoreCase("a") || temporal.equalsIgnoreCase("z")) {
                valor = valor + 1;
            }else if (temporal.equalsIgnoreCase("w") || temporal.equalsIgnoreCase("s") || temporal.equalsIgnoreCase("x")) {
                valor = valor + 2;
            }else if (temporal.equalsIgnoreCase("e") || temporal.equalsIgnoreCase("d") || temporal.equalsIgnoreCase("c")) {
                valor = valor + 3;
            }else if (temporal.equalsIgnoreCase("r") || temporal.equalsIgnoreCase("f") || temporal.equalsIgnoreCase("v")) {
                valor = valor + 4;
            }else if (temporal.equalsIgnoreCase("t") || temporal.equalsIgnoreCase("g") || temporal.equalsIgnoreCase("b")) {
                valor = valor + 5;
            }else if (temporal.equalsIgnoreCase("y") || temporal.equalsIgnoreCase("h") || temporal.equalsIgnoreCase("n")) {
                valor = valor + 6;
            }else if (temporal.equalsIgnoreCase("u") || temporal.equalsIgnoreCase("j") || temporal.equalsIgnoreCase("m")) {
                valor = valor + 7;
            }else if (temporal.equalsIgnoreCase("i") || temporal.equalsIgnoreCase("k")) {
                valor = valor + 8;
            }else if (temporal.equalsIgnoreCase("o") || temporal.equalsIgnoreCase("l")) {
                valor = valor + 9;
            }else if (temporal.equalsIgnoreCase("p")) {
                valor = valor + 10;
            }
        }
        System.out.println(valor);
    }

}
