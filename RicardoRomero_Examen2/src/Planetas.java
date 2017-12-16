/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Planetas {
    private String nombre;
    private String temperatura;
    private String anillos;
    private String tipo_suerficie;
    double distancia_tierra;

    public Planetas() {
    }

    public Planetas(String nombre, String temperatura, String anillos, String tipo_suerficie, double distancia_tierra) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.anillos = anillos;
        this.tipo_suerficie = tipo_suerficie;
        this.distancia_tierra = distancia_tierra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getAnillos() {
        return anillos;
    }

    public void setAnillos(String anillos) {
        this.anillos = anillos;
    }

    public String getTipo_suerficie() {
        return tipo_suerficie;
    }

    public void setTipo_suerficie(String tipo_suerficie) {
        this.tipo_suerficie = tipo_suerficie;
    }

    public double getDistancia_tierra() {
        return distancia_tierra;
    }

    public void setDistancia_tierra(double distancia_tierra) {
        this.distancia_tierra = distancia_tierra;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
