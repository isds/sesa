public class Quarta {
  // 04 - Escreva um programa que reverta uma lista de tamanho N.
  public static void main(String[] args) {
    int[] lista = { 1, 3, 6, 8, 9 };
    int tmp = 0;

    for (int a = 0; a < lista.length; a++) {
      for (int b = 0; b < lista.length; b++) {
        if (lista[a] > lista[b]) {
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
