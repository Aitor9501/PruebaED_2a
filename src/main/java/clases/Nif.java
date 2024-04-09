package clases;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author ProfDiurno
 */
public class Nif {

    //CONSTANTE: no accesible - compartido por todo - no modificable

    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
            'C', 'K', 'E'};
    private int numero;
    private char letra;

    /**
     * Constructor por defecto de la clase.
     * Crea un NIF con número 0 y letra espacio.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor que recibe un número para el NIF.
     * Calcula la letra asociada al número.
     *
     * @param numero El número del NIF.
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }


    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Devuelve una representación en forma de cadena del NIF,
     *
     * @return Representación en forma de cadena del NIF.
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Verifica si este NIF es igual a otro objeto.
     * Dos NIFs son iguales si tienen el mismo número y letra.
     *
     * @param obj El objeto a comparar con este NIF.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
