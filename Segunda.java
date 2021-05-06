public class Segunda {
  // 02 - Escreva um programa que dada uma lista(L) de inteiros de tamanho N, a
  // ordene em ordem crescente.
  public static void main(String[] args) {
    int[] lista = { 8, 3, 6, 2, 9 };
    int tmp = 0;

    for (int a = 0; a < lista.length; a++) {
      for (int b = 0; b < lista.length; b++) {
        if (lista[a] < lista[b]) {
          tmp = lista[a];
          lista[a] = lista[b];
          lista[b] = tmp;
        }
      }
    }
    for (int i = 0; i < lista.length; i++) {
      System.out.println(lista[i]);
    }
  }
}
