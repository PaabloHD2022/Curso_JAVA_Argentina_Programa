/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Voto {
    
    private Alumnos alumno;
    private ArrayList<Alumnos> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumnos alumno, ArrayList<Alumnos> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumnos> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumnos> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnosVotados=" + alumnosVotados + '}';
    }
    
    
}
