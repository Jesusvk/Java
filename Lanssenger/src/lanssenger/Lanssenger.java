 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanssenger;

/**
 *
 * @author Jesus
 */
public class Lanssenger {

    /**
     * @param args the command line arguments
     */
    public static Conector servidor, cliente;

    public static void main(String[] args) {
        LServidor server = new LServidor();
        server.show();
        server.setVisible(true);

    }

    public static void initServer() {
        servidor = new Conector();
    }

    public static void initCliente(String ip) {
        cliente = new Conector(ip);
    }
}
