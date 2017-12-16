
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Expedicion_hilo extends Thread{
    Naves_Espaciales nave;
    Planetas destino;
    JLabel exp;
    public Expedicion_hilo(JLabel aviso) {
        this.exp = aviso;
    }

    public Naves_Espaciales getNave() {
        return nave;
    }

    public void setNave(Naves_Espaciales nave) {
        this.nave = nave;
    }

    public Planetas getDestino() {
        return destino;
    }

    public void setDestino(Planetas destino) {
        this.destino = destino;
    }

    @Override
    public void run() {
        exp.setText("Llegando al planeta");
        try {
            Thread.sleep(((int)nave.calcularTiempo()[0])*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Expedicion_hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        exp.setText("Regresando");
        try {
            Thread.sleep(((int)nave.calcularTiempo()[1])*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Expedicion_hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
