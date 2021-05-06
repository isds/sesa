import java.util.ArrayList;

public class Quinta {
  // 05 - Escreva um programa que data uma lista de numeros de 0 a 20, com um
  // deles faltando encontre o número faltando.
  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();
    int a[] = { 1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20};
    int b = a[0];
    for (int i = 0; i < a.length; i++) {
      if (b == a[i]) {
        b++;
      } else {
        lista.add(b);
        i--;
        b++;
      }
    }
    for (int i : lista) {
      System.out.println("Está faltando: " + i);
    }
  }
}