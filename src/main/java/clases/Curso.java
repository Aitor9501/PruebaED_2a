package clases;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.TreeSet;

/**
 * @author ProfDiurno
 */
public class Curso {

    private final String nombre;
    private final TreeSet<Persona> listaAlumnos;

    /**
     * Constructor de la clase "Curso" que recibe nombre del curso, inicializando la lista y almacenadno ahí los alumnos
     *
     * @param nombre Recibe nombre
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    protected String getNombre() {
        return nombre;
    }

    /**
     * Método ToString de la clase Curso que devuelve de manera formateada el número de expediente, NOF,
     * nombre, edad y apellidos del objeto persona, devolviendo recorriendo el mapa
     *
     * @return S
     * @author Aitor
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\tedad\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade un alumno a la lista
     *
     * @param p Recibe objeto persona
     * @author Aitor
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
