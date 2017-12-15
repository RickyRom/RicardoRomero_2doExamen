/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Astronautas {
    private String nombre;
    private String nacionalidad;
    private double sueldo;
    private String experiencia;
    private String sexo;
    private double peso;

    public Astronautas() {
    }

    public Astronautas(String nombre, String nacionalidad, double sueldo, String experiencia, String sexo, double peso) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.experiencia = experiencia;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Astronautas{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", sueldo=" + sueldo + ", experiencia=" + experiencia + ", sexo=" + sexo + ", peso=" + peso + '}';
    }
}
