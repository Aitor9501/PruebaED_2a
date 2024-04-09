package test;

import clases.Nif;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NIFTest {
    @Test
    public void testNifConstructor() {
        Nif n = new Nif();
        char letraCalculada = Nif.calcularLetra(167894547);
        char letraEsperada = 'k';

        assertEquals(letraCalculada, letraEsperada);
    }
}
