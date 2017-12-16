
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricky
 */
public class Nave_Tripulada extends Naves_Espaciales {

    private String lugar_despeje;
    private ArrayList<Astronautas> listaA = new ArrayList();

    public Nave_Tripulada() {
    }

    public Nave_Tripulada(String lugar_despeje, int numero_serie, Planetas destino, double velocidad) {
        super(numero_serie, destino, velocidad);
        this.lugar_despeje = lugar_despeje;
    }

    public String getLugar_despeje() {
        return lugar_despeje;
    }

    public void setLugar_despeje(String lugar_despeje) {
        this.lugar_despeje = lugar_despeje;
    }

    public ArrayList<Astronautas> getListaA() {
        return listaA;
    }

    public void setListaA(ArrayList<Astronautas> listaA) {
        this.listaA = listaA;
    }

    @Override
    public String toString() {
        return "Nave_Tripulada{" + "lugar_despeje=" + lugar_despeje + ", listaA=" + listaA + '}';
    }

    @Override
    public double[] calcularTiempo() {
        double[] arre = new double[2];
        arre[0] = this.destino.getDistancia_tierra() / (super.getVelocidad() *(Math.pow(listaA.get(0).getPeso(), 2)) / 100);
        arre[1] = this.destino.getDistancia_tierra() / super.getVelocidad() / 100;
        return arre;
    }

}
