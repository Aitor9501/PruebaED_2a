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
    //todo: implementar test para cuando metes un alumno vacio
    //todo: implementar test para cuando metes un alumno solo con nif

}