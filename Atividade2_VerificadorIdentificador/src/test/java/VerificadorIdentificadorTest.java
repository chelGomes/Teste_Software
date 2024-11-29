import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VerificadorIdentificadorTest {
    @Test
    public void testIdentificadorValido() {
        assertFalse(VerificadorIdentificador.ehValido("variavel")); // Verifica se um identificador válido é reconhecido
    }

    @Test
    public void testIdentificadorInvalidoComecaComNumero() {
        assertFalse(VerificadorIdentificador.ehValido("1variavel")); // Verifica se um identificador começando com número é rejeitado
    }

    @Test
    public void testIdentificadorInvalidoComCaractereEspecial() {
        assertFalse(VerificadorIdentificador.ehValido("var@")); // Verifica se um identificador com caractere especial é rejeitado
    }

    @Test
    public void testIdentificadorComTamanhoMinimo() {
        assertTrue(VerificadorIdentificador.ehValido("a")); // Verifica se um identificador com tamanho mínimo é válido
    }

    @Test
    public void testIdentificadorComTamanhoMaximo() {
        assertTrue(VerificadorIdentificador.ehValido("abcdef")); // Verifica se um identificador com tamanho máximo é válido
    }

    @Test
    public void testIdentificadorComTamanhoExcedido() {
        assertFalse(VerificadorIdentificador.ehValido("abcdefghi")); // Verifica se um identificador com tamanho excedido é rejeitado
    }

    @Test
    public void testIdentificadorComEspacos() {
        assertFalse(VerificadorIdentificador.ehValido("nome com espaco")); // Verifica se um identificador com espaços é rejeitado
    }

    @Test
    public void testIdentificadorComUnderscoreNoInicio() {
        assertFalse(VerificadorIdentificador.ehValido("_variavel")); // Verifica se um identificador com underscore no início é válido
    }

    @Test
    public void testIdentificadorComUnderscoreNoMeio() {
        assertFalse(VerificadorIdentificador.ehValido("var_1")); // Verifica se um identificador com underscore no meio é válido
    }

    @Test
    public void testIdentificadorVazio() {
        assertFalse(VerificadorIdentificador.ehValido("")); // Verifica se um identificador vazio é rejeitado
    }
}