/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets_prueba;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Jesus
 */
public class Conex {

    ServerSocket server;
    Socket socket;
    int puerto = 9000;
    DataOutputStream salida;
    BufferedReader entrada;

    public void iniciar() {
        try {
            server = new ServerSocket(puerto);
            socket = new Socket();
            socket = server.accept();
            salida = new DataOutputStream(socket.getOutputStream());
            int cad = 0;
            do {
                salida.writeUTF("\t\t1-Texto \t2-Numero \t3-Salir\t");
                entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                cad = Numeric(entrada.readLine());
                switch (cad) {
                    case 1:
                        texto();
                        break;
                    case 2:
                        numeros();
                        break;
                }
            } while (cad != 3);
            salida.writeUTF("\nAdios paisa\n");
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void texto() throws IOException {
        String mensaje = "";
        do {
            System.out.println();
            mensaje = entrada.readLine();
            System.out.println(mensaje);
            salida.writeUTF("\n" + mensaje + "\n");
        } while (!mensaje.equalsIgnoreCase(""));
    }

    public void numeros() throws IOException {
        int a, b, c;
        String mensaje = "", cadena = "";
        do {
            salida.writeUTF("\n Ingrese primer numero \n");
            a = Numeric(String.valueOf(entrada.readLine()));
            salida.writeUTF("\n Ingrese segundo numero \n");
            b = Numeric(String.valueOf(entrada.readLine()));
            salida.writeUTF("\n Ingrese numero de opcion \n");
            salida.writeUTF("\n 1-Suma \n");
            salida.writeUTF("\n 2-Resta \n");
            salida.writeUTF("\n 3-Multiplicacion \n");
            salida.writeUTF("\n 4-Division \n");
            c = Numeric(String.valueOf(entrada.readLine()));
            switch (c) {
                case 1:
                    mensaje = String.valueOf(a + b);
                    cadena = FormatoCadena(a, "+", b, mensaje);
                    break;
                case 2:
                    mensaje = String.valueOf(a - b);
                    cadena = FormatoCadena(a, "-", b, mensaje);
                    break;
                case 3:
                    mensaje = String.valueOf(a * b);
                    cadena = FormatoCadena(a, "*", b, mensaje);
                    break;
                case 4:
                    mensaje = String.valueOf(a / b);
                    cadena = FormatoCadena(a, "/", b, mensaje);
                    break;
                default:
                    salida.writeBytes("\nNo ingreso opcion valida\n");
                    mensaje = "";
            }
            System.out.println(cadena);
            salida.writeBytes("\n\n");
            salida.writeBytes(mensaje);
        } while (!mensaje.equalsIgnoreCase(""));
    }

    int Numeric(String cadena) throws IOException {
        try {
            int nu = Integer.parseInt(cadena);
            return nu;
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }

    boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    String FormatoCadena(int a, String signo, int b, String c) {
        return String.valueOf(a) + String.valueOf(" " + signo + " ") + String.valueOf(b) + String.valueOf(" = ") + String.valueOf(c);
    }
}
