/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public abstract class Naves_Espaciales {
    private int numero_serie;
    private String destino;
    private double velocidad;

    public Naves_Espaciales() {
    }

    public Naves_Espaciales(int numero_serie, String destino, double velocidad) {
        this.numero_serie = numero_serie;
        this.destino = destino;
        this.velocidad = velocidad;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Naves_Espaciales{" + "numero_serie=" + numero_serie + ", destino=" + destino + ", velocidad=" + velocidad + '}';
    }
    
    public abstract void calcularTiempo(int ida, int regreso);
}
