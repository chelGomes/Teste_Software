public class Selection_Sort {
    // Método de ordenação Selection Sort
    public static void selectionSort(int[] vet) {
        int n = vet.length;

        // Iteração sobre o vetor
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Índice do menor elemento

            // Encontra o menor elemento no restante do vetor
            for (int j = i + 1; j < n; j++) {
                if (vet[j] < vet[minIndex]) {
                    minIndex = j; // Atualiza o índice do menor elemento
                }
            }

            // Troca o menor elemento com o primeiro elemento não ordenado
            int temp = vet[minIndex];
            vet[minIndex] = vet[i];
            vet[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int[] vetor = {64, 25, 12, 22, 11};

        System.out.println("Vetor antes da ordenação:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        // Chamada do método de ordenação
        selectionSort(vetor);

        System.out.println("\n\nVetor após a ordenação:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
