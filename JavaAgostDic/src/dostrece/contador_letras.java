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
public class contador_letras {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] entrada = bf.readLine().replace(" ", "").toCharArray();
        String[] letras = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z".split(",");
        int contador[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if (("" + entrada[i]).equalsIgnoreCase(("" + letras[j]))) {
                    contador[j]++;
                }
            }
        }
        for (int i = 0; i < contador.length; i++) {
            if(contador[i]!=0){
                System.out.println(letras[i] + "\t" + contador[i]);
            }
        }
    }
}
