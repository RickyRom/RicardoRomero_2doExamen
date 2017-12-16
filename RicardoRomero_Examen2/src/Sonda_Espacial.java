/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Sonda_Espacial extends Naves_Espaciales{
    private String material;
    private double peso;    

    public Sonda_Espacial() {
    }

    public Sonda_Espacial(String material, double peso, int numero_serie, Planetas destino, double velocidad) {
        super(numero_serie, destino, velocidad);
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Sonda_Espacial{" + "material=" + material + ", peso=" + peso + '}';
    }

    @Override
    public double[] calcularTiempo() {
        double[] arre = new double[2];
        arre[0] = this.destino.getDistancia_tierra() / super.getVelocidad();
        arre[1] = 9.8 * arre[0];
        return arre;
    }
}
