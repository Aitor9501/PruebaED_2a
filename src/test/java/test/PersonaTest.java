package test;

import clases.Persona;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {
    @Test
    public void testGetEdad() {
        LocalDate fechaNacimiento = LocalDate.of(2005, 1, 7);
        Persona p = new Persona();
        p.setNacimiento(fechaNacimiento);

        int edadSupuesta = LocalDate.now().getYear() - fechaNacimiento.getYear();
        int edadGetEdad = p.getEdad();

        assertEquals(edadSupuesta, edadGetEdad);
    }
}
