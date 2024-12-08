public class Bissexto {
    public static boolean isBissexto(int ano) {
        if (ano < 0) {
            throw new IllegalArgumentException("Ano negativo inserido. Por favor, insira um ano positivo entre 1 e 9999.");
        }
         if (ano <= 1 || ano >= 9999) {
        throw new IllegalArgumentException("O ano deve estar entre 1 e 9999.");
    }
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
}

    public static void main(String[] args) {
        // Testando o método com diferentes entradas
        try {
            int[] testAno = {1900, 2000, 2024, 2023, -400, 0, -2025};

            for (int ano : testAno) {
                try {
                    System.out.println("Ano: " + ano + " é bissexto ? " + isBissexto(ano));
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro para o ano " + ano + ": " + e.getMessage());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

