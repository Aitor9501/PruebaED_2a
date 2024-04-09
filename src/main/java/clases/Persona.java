package clases;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor vacío de la clase Persona
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor dela clase "Persona" que recibe un objeto NIF
     *
     * @param nif
     */

    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor de la clase persona que recibe el nombre, NIF, género,
     * día, mes y año de nacimiento de la persona
     *
     * @param nif    Recibe NIF
     * @param nombre Recibe nombre
     * @param genero Recibe género
     * @param dia    Recibe día de nacimiento
     * @param mes    Recibe mes de nacimiento
     * @param ano    Recibe año de nacimiento
     */
    public Persona(int nif, String nombre, char genero,
                   int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    /**
     * Método que recibe NIF
     *
     * @return Nif
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * @param nif clave primaria de la persona
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    @Override
    /**
     * Método To String que da formato al objeto persona, mostrando de manera tabulada
     * el nombre, el NIF y la edad de la persona
     * @author Aitor
     */
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Método que recibe un objeto persona y comprueba si es igual a null o no
     *
     * @param a Recibe un objeto de tipo persona
     * @return False si el objeto es igual o null o una cadena si es True
     * @author Aitor
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    @Override
    /**
     * Método que compara si dos elementos NIF son iguales o no, necesario para
     * comprobar si un objeto alumno es igual a otro
     * @author Aitor
     * @param obj Recibe un objeto NIF
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Compara dos objetos persona
     *
     * @param o the object to be compared.
     * @return Devuelve todos los objetos "Persona" de manera ordenada
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
