/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EQUIPO 01
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int entrada = Integer.parseInt(bf.readLine());
        int fibonacci = 0;
        int[] numero = new int[entrada];
        int aux = 0;
        for (int i = 1; i <= entrada; i++) {
            if (i >= 2) {
                System.out.print(fibonacci + " ");
                fibonacci = fibonacci + aux;
                aux = fibonacci - aux;
            } else {
                System.out.print(fibonacci + " ");
                fibonacci = fibonacci + i;
                aux = 1;
            }
        }
    }

}
