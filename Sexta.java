public class Sexta {
  // 06 - Escreva um programa, que dada uma cadeia de caracteres(string) S diga se
  // é um palindromo. Um palindromo é uma cadeia de caracteres que é a mesma se
  // lida de trás para frente ignorando-se os espaços.
  public static void main(String[] args) {

    String palavra = "ana";
    String contrario = "";
    int tamanho = palavra.length();

    for (int i = (tamanho - 1); i >= 0; --i) {
      contrario += palavra.charAt(i);
    }

    if (palavra.equals(contrario)) {
      System.out.println(palavra + " é um palíndromo.");
    } else {
      System.out.println(palavra + " não é um palíndromo.");
    }
  }
}
