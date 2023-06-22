/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Angel
 */
public class Alumnos {
    
    private String nombreCompleto;
    private int dni;
    private int votosDados;
    private int votosRecibidos;
    
    public Alumnos() {
    }

    public Alumnos(String nombreCompleto, int dni, int votosDados, int votosRecibidos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votosDados = votosDados;
        this.votosRecibidos = votosRecibidos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int votosDados() {
        return votosDados;
    }
    
    public int votosRecibidos() {
        return votosRecibidos;
    }

    public void votosDados(int votosDados) {
        this.votosDados = votosDados;
    }
    
    public void votosRecibidos(int votosRecibidos){
        this.votosRecibidos = votosRecibidos;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", votosDados=" + votosDados + ", votosRecibidos=" + votosRecibidos + '}';
    }

   
    
    
}
