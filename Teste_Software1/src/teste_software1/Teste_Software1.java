/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste_software1;



/**
 *
 * @author Michel
 */
public class Teste_Software1 {
    
    
    
    public void selectionSort(int[] vet) {
        int min, x, flag = 0;
            for (int i = 1; i <= vet.length - 1; i++) {
                min = i;
            for (int j = i + 1; j < vet.length; j++) {
 		if (vet[j] < vet[min]) {
                    min = j;
                    flag = 1;
 	       }
 	     }
 	     if(flag == 1) {
 		x = vet[min];
 		vet[min] = vet[i];
		vet[i] = x;
 	    }
        }
    }
    
    public void testSelectionSort() {
    // Caso 1: Vetor já ordenado
    int[] vetorOrdenado = {2, 10, 12, 15, 20};
    selectionSort(vetorOrdenado.clone()); // Criar uma cópia para não alterar o original
    assertArrayEquals(vetorOrdenado, vetorOrdenado);

    // Caso 2: Vetor desordenado
    int[] vetorDesordenado = {20, 12, 10, 15, 2};
    int[] esperado = {2, 10, 12, 15, 20};
    selectionSort(vetorDesordenado);
    assertArrayEquals(esperado, vetorDesordenado);

    // Caso 3: Vetor com elementos repetidos
    int[] vetorRepetidos = {2, 10, 10, 15, 2};
    int[] esperadoRepetidos = {2, 2, 10, 10, 15};
    selectionSort(vetorRepetidos);
    assertArrayEquals(esperadoRepetidos, vetorRepetidos);

    // Caso 4: Vetor vazio
    int[] vetorVazio = {};
    selectionSort(vetorVazio);
    assertArrayEquals(vetorVazio, vetorVazio);

    // Caso 5: Vetor com um único elemento
    int[] vetorUmElemento = {5};
    selectionSort(vetorUmElemento);
    assertArrayEquals(vetorUmElemento, vetorUmElemento);

    // Caso 6: Vetor ordenado inversamente
    int[] vetorInverso = {20, 15, 12, 10, 2};
    int[] esperadoInverso = {2, 10, 12, 15, 20};
    selectionSort(vetorInverso);
    assertArrayEquals(esperadoInverso, vetorInverso);

    // Caso 7: Vetor com números negativos
    int[] vetorNegativos = {-5, 2, -3, 0, 1};
    int[] esperadoNegativos = {-5, -3, 0, 1, 2};
    selectionSort(vetorNegativos);
    assertArrayEquals(esperadoNegativos, vetorNegativos);

    // Caso 8: Vetor com todos os elementos iguais
    int[] vetorTodosIguais = {5, 5, 5, 5, 5};
    selectionSort(vetorTodosIguais);
    assertArrayEquals(vetorTodosIguais, vetorTodosIguais);

    // Caso 9: Vetor com um elemento fora da ordem
    int[] vetorUmForaDeOrdem = {2, 10, 12, 15, 20, 1};
    int[] esperadoForaDeOrdem = {1, 2, 10, 12, 15, 20};
    selectionSort(vetorUmForaDeOrdem);
    assertArrayEquals(esperadoForaDeOrdem, vetorUmForaDeOrdem);
}

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SelectionSort test = new SelectionSort();
        test.testSelectionSort();   
    }

    private void assertArrayEquals(int[] vetorOrdenado0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertArrayEquals(int[] esperadoForaDeOrdem, int[] vetorUmForaDeOrdem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
