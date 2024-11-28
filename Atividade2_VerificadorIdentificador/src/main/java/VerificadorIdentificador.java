public class VerificadorIdentificador {
    public static boolean ehValido(String identificador) {
        // Um identificador válido deve ter pelo menos 1 e no máximo 6 caracteres
        if (identificador.length() < 1 || identificador.length() > 6) {
            return false;
        }

        // O primeiro caractere deve ser uma letra
        char primeiroCaractere = identificador.charAt(0);
        if (!Character.isLetter(primeiroCaractere)) {
            return false;
        }

        // Os demais caracteres devem ser letras ou dígitos
        for (int i = 1; i < identificador.length(); i++) {
            char caractere = identificador.charAt(i);
            if (!Character.isLetterOrDigit(caractere)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] identificadores = {"abc123", "1abc", "_abc", "abcdefghi", "a", "a1b2c3d4e5f"};

        for (String identificador : identificadores) {
            if (ehValido(identificador)) {
                System.out.println(identificador + " é um identificador válido.");
            } else {
                System.out.println(identificador + " não é um identificador válido.");
            }
        }
    }
}
