/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EQUIPO 01
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int entrada = 0;
        int multiplo = 0;
        int i = 1;
        int operacion = 0;
        int diez = 10;
        boolean numeros = false;
        while (multiplo == 0) {
            operacion = entrada * i;
            if (operacion == 10 || operacion == 100 || operacion == 110 || operacion == 100) {
                numeros = true;
                System.out.println(multiplo);
            }else{
                diez = diez + 10;
            }
            entrada = Integer.parseInt(bf.readLine());
        }
        // TODO code application logic here
    }

}
