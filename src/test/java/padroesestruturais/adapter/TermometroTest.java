package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TermometroTest {

    @Test
    void deveRetornarTemperaturaKelvin() {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(300.15f);

        assertEquals(300.15f, termometro.getTemperatura(), 0.01f);
    }

    @Test
    void deveRetornarTemperaturaCelcius() {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(300.15f);

        assertEquals(27.0f, termometro.getCelcius(), 0.01f);
    }
}