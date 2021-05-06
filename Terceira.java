public class Terceira {
  // 03 - Escreva um programa que dada uma lista de nomes os ordene por ordem
  // alfabética.
  public static void main(String[] args) {
    String[] lista = { "Mario", "Dante", "Helmi" };
    String tmp;

    for (int a = 0; a < lista.length; a++) {
      for (int b = a + 1; b < lista.length; b++) {
        if (lista[a].compareTo(lista[b]) > 0) {
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
