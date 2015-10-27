/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanssenger;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.*;
import javax.swing.JPanel;

/**
 *
 * @author Jesus
 */
public class Conector {

    private Socket s;
    private ServerSocket ss;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int puerto = 4314;
    private JPanel panel;

    public Conector() {
        try {
            ss = new ServerSocket(puerto);
            s = ss.accept();

            // Creaccion de entrada de datos para lectura de mensajes
            entradaSocket = new InputStreamReader(s.getInputStream());
            entrada = new BufferedReader(entradaSocket);

            //Creacion de saldia de datos para el envio de mensajes
            salida = new DataOutputStream(s.getOutputStream());

        } catch (Exception ex) {
            panel = new JPanel();
        }
    }

    public Conector(String ip) {
        try {
            s = new Socket(ip, this.puerto);

            // Creaccion de entrada de datos para lectura de mensajes
            entradaSocket = new InputStreamReader(s.getInputStream());
            entrada = new BufferedReader(entradaSocket);

            //Creacion de saldia de datos para el envio de mensajes
            salida = new DataOutputStream(s.getOutputStream());

        } catch (Exception e) {
        }
    }

    public void enviarMSG(String msg) {
        try {
            salida.writeUTF(msg);
        } catch (Exception e) {
        }
    }

    public String leerMSG() {
        try {
            return entrada.readLine();
        } catch (Exception e) {
            return null;
        }
    }

    public void desconectar() {
        try {
            ss.close();
        } catch (Exception e) {
            
        }
        try {
                s.close();
            } catch (Exception e) {

            }
    }
}
