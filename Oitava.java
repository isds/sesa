public class Oitava {
  // 08 - Escreva um programa que dada uma lista L de tamanho N,retorna o maior
  // elemento, o menor elemento, a média e a mediana de uma lista de tamanho N.
  public static void main(String[] args) {

    int[] lista = { 6, 3, 10, 8, 9, 5, 7, 4 };
    int soma = 0;
    int media = 0;
    int tmp = 0;
    int tamanho = lista.length;
    int resto = 0;

    // Média da lista
    for (int i = 0; i < lista.length; i++) {
      soma += lista[i];
      media = soma / lista.length;
    }
    System.out.println("A média: " + (float) media);

    // Menor elemento da lista
    for (int a = 0; a < lista.length; a++) {
      for (int b = 0; b < lista.length; b++) {
        if (lista[a] < lista[b]) {
          tmp = lista[a];
          lista[a] = lista[b];
          lista[b] = tmp;
        }
      }
    }
    System.out.println("O menor: " + lista[0]);

    // Maior elemento da lista
    for (int a = 0; a < lista.length; a++) {
      for (int b = 0; b < lista.length; b++) {
        if (lista[a] > lista[b]) {
          tmp = lista[a];
          lista[a] = lista[b];
          lista[b] = tmp;
        }
      }
    }
    System.out.println("O maior: " + lista[0]);

    // Mediana da lista
    if (tamanho % 2 == 1) {
      System.out.println("A mediana: " + lista[tamanho / 2]);
    } else {
      resto = lista[tamanho / 2 - 1] + lista[tamanho / 2];
      System.out.println("A mediana: " + (float) resto / 2);
    }
  }
}
