public class Setima {
  // 07 - Escreva um programa que dada uma lista com N strings encontre todos os
  // valores duplicados.
  public static void main(String[] args) {

    String[] lista = { "Helmi", "Dante", "Italo", "Dante", "Dayane" };

    for (int a = 0; a < lista.length; a++) {
      for (int b = a + 1; b < lista.length; b++) {
        if (lista[a].equals(lista[b])) {
          System.out.println("Valores duplicados: " + lista[a]);
        }
      }
    }
  }
}
