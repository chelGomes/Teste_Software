package teste;

public class selectionSort {
    public static void selectionSort(int[] vet) {
        int min, temp, flag;
        for (int i = 0; i < vet.length - 1; i++) {
            min = i;
            flag = 0; // Reset da flag em cada iteração do laço externo
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                    flag = 1;
                }
            }
            if (flag == 1) {
                temp = vet[min];
                vet[min] = vet[i];
                vet[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] vet = {20, 12, 10, 15, 2}; // Caso de teste fornecido

        System.out.println("Vetor original:");// Imprimindo o vetor original
        for (int num : vet) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(vet); // Chamando o método de ordenação

        System.out.println("Vetor ordenado:"); // Imprimindo o vetor ordenado
        for (int num : vet) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


