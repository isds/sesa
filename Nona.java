import java.util.Arrays;

public class Nona {
  // 09 - Escreva um programa que concatene duas listas L1 e L2
  public static void main(String[] args) {
    int[] primeira = { 1, 3, 5 };
    int[] segunda = { 2, 4, 6 };
    int tamPrimera = primeira.length;
    int tamSegunda = segunda.length;
    int[] resultado = new int[tamPrimera + tamSegunda];

    System.arraycopy(primeira, 0, resultado, 0, tamPrimera);
    System.arraycopy(segunda, 0, resultado, tamPrimera, tamSegunda);

    System.out.println(Arrays.toString(resultado));
  }
}
