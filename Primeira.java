public class Primeira {
  // 01 - Escreva um programa que some todos os valores de uma lista de inteiros.
  public static void main(String[] args) {
    int[] lista = { 1, 3, 6, 8, 9 };
    int soma = 0;

    for (int i = 0; i < lista.length; i++) {
      soma += lista[i];
    }
    System.out.println(soma);
  }
}