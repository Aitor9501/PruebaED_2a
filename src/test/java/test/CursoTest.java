package test;

import clases.Curso;
import clases.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CursoTest {
    @Test
    void aniadirAlumnoTest() {
        Persona p = new Persona(1234, "ejemplo", 'm', 10, 10, 2002);
        Curso c = new Curso("prueba");
        c.aniadirAlumno(p);
        String resultado = c.toString();
        resultado = resultado.replace("--------------------prueba-----------------\n" + "NumExp\tNIF\t\tNombre\tedad\tApellidos\n"
                + "-------------------------------------------------\n", "");
        String[] partes = resultado.split("\t");
        for (String parte : partes) {
            System.out.println(parte);
        }
        assertEquals(p.getNif().toString().trim(), partes[0].trim());
        assertEquals(p.getNombre().trim(), partes[1].trim());
        assertEquals(p.getEdad() + "", partes[4].trim());
    }

    @Test
    void aniadirAlumnoTest2() {
        Persona p2 = new Persona();
        Curso c2 = new Curso("Prueba2");
        c2.aniadirAlumno(p2);
        String resultado = c2.toString();
        resultado = resultado.replace("--------------------Prueba2-----------------\n" +
                "NumExp\tNIF\t\tNombre\tedad\tApellidos\n"
                + "-------------------------------------------------\n", "");
        String[] partes = resultado.split("\t");
        for (String parte : partes) {
            System.out.println(parte);
        }
        assertEquals(p2.getNif().toString().trim(), partes[0].trim());
        assertEquals(p2.getNombre().trim(), partes[1].trim());

    }

    @Test
    void aniadirAlumnoTest3() {
        Persona p3 = new Persona(1234);
        Curso c3 = new Curso("Prueba3");
        c3.aniadirAlumno(p3);
        String resultado = c3.toString();
        resultado = resultado.replace("--------------------Prueba3-----------------\n" +
                "NumExp\tNIF\t\tNombre\tedad\tApellidos\n"
                + "-------------------------------------------------\n", "");
        String[] partes = resultado.split("\t");
        for (String parte : partes) {
            System.out.println(parte);
        }
        assertEquals(p3.getNif().toString().trim(), partes[0].trim());
        assertEquals(p3.getNombre().trim(), partes[1].trim());
    }
}