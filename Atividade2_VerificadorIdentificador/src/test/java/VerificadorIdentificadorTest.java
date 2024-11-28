import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VerificadorIdentificadorTest {
    @Test
    public void testIdentificadorValido() {
        assertFalse(VerificadorIdentificador.ehValido("variavel"));
    }

    @Test
    public void testIdentificadorInvalidoComecaComNumero() {
        assertFalse(VerificadorIdentificador.ehValido("1variavel"));
    }

    @Test
    public void testIdentificadorInvalidoComCaractereEspecial() {
        assertFalse(VerificadorIdentificador.ehValido("var@"));
    }

    @Test
    public void testIdentificadorComTamanhoMinimo() {
        assertTrue(VerificadorIdentificador.ehValido("a"));
    }

    @Test
    public void testIdentificadorComTamanhoMaximo() {
        assertTrue(VerificadorIdentificador.ehValido("abcdef"));
    }

    @Test
    public void testIdentificadorComTamanhoExcedido() {
        assertFalse(VerificadorIdentificador.ehValido("abcdefghi"));
    }

    @Test
    public void testIdentificadorComEspacos() {
        assertFalse(VerificadorIdentificador.ehValido("nome com espaco"));
    }

    @Test
    public void testIdentificadorComUnderscoreNoInicio() {
        assertFalse(VerificadorIdentificador.ehValido("_variavel"));
    }

    @Test
    public void testIdentificadorComUnderscoreNoMeio() {
        assertFalse(VerificadorIdentificador.ehValido("var_1"));
    }

    @Test
    public void testIdentificadorVazio() {
        assertFalse(VerificadorIdentificador.ehValido(""));
    }
}