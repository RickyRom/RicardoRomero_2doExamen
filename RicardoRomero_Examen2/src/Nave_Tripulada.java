
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
public class Nave_Tripulada extends Naves_Espaciales{
    private String lugar_despeje;
    private ArrayList<Astronautas> listaA = new ArrayList();

    public Nave_Tripulada() {
    }

    public Nave_Tripulada(String lugar_despeje, int numero_serie, String destino, double velocidad) {
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
    public void calcularTiempo(int ida, int regreso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
