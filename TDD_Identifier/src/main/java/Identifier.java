import java.util.HashSet;
import java.util.Set;

public class Identifier {
        // Conjunto de palavras reservadas em Java (pode ser expandido)
        private static final Set<String> reservedWords = new HashSet<>();
        static {
            reservedWords.add("abstract");
            reservedWords.add("assert");
            // ... adicionar mais palavras reservadas
        }

        /**
         * Verifica se o tamanho do identificador está entre 1 e 6 caracteres.
         *
         * @param id O identificador a ser verificado.
         * @return true se o tamanho for válido, false caso contrário.
         */
        public boolean isTamanhoValido(String id) {
            return id.length() >= 1 && id.length() <= 6;
        }

        /**
         * Verifica se o primeiro caractere do identificador é uma letra.
         *
         * @param id O identificador a ser verificado.
         * @return true se o primeiro caractere for uma letra, false caso contrário.
         */
        public boolean isInicioValido(String id) {
            return id.matches("[a-zA-Z].*"); // Expressão regular para verificar se começa com letra
        }

        /**
         * Verifica se todos os caracteres do identificador são letras ou dígitos, e se o primeiro caractere é uma letra.
         *
         * @param id O identificador a ser verificado.
         * @return true se todos os caracteres forem válidos, false caso contrário.
         */
        public boolean isCaracteresValido(String id) {
            return id.matches("[a-zA-Z][a-zA-Z0-9]*"); // Expressão regular para verificar todos os caracteres
        }

        /**
         * Verifica se o identificador é uma palavra reservada em Java.
         *
         * @param id O identificador a ser verificado.
         * @return true se for uma palavra reservada, false caso contrário.
         */
        public boolean isPalavraReservada(String id) {
            return reservedWords.contains(id);
        }

        /**
         * Verifica se o identificador é válido.
         *
         * @param id O identificador a ser verificado.
         * @return Uma mensagem indicando o resultado da validação.
         */
        public String isValido(String id) {
            if (!isTamanhoValido(id)) {
                return "Tamanho é inválido";
            } else if (!isInicioValido(id)) {
                return "Primeiro caractere é inválido";
            } else if (!isCaracteresValido(id)) {
                return "Caractere inválido encontrado";
            } else if (isPalavraReservada(id)) {
                return "Identificador é uma palavra reservada";
            } else {
                return "Identificador é válido";
            }
        }

        public static void main(String[] args) {
            Identifier identifier = new Identifier();
            String id = "minhaVariavel";
            System.out.println(identifier.isValido(id));
        }
    }

