import java.util.Scanner;

public class DecimaPrimeira {
  // 11 - Uma certa escola tem a seguinte politica de notas:
  // - Cada estudante recebe uma nota de 0 a 100.
  // - Qualquer um com menos de 40 pontos é reprovado
  // João é um professor nesta escola que gosta de arredondar as notas de seus
  // estudantes de acordo com as seguintes regras:
  // - Se a diferença entre a nota do estudante e o próximo multiplo de 5 for
  // menor do que 3, a nota é arredondata para o próximo multiplo de 5.
  // - Se o valor da nota é menor do que 38, nenhum erredontamento acontece.
  // Exemplo:
  // -- nota = 84, é arredondata para 85(85-84 é menos que 3)
  // -- nota = 29, nenhum arredondamento(resultado é menor que 40)
  // -- nota = 57, nenhum arredondamento(60-57 é 3 ou maior)
  public static void main(String[] args) {

    int nota = 0;
    int multiploDeCinco = 0;

    System.out.println("Digite o nome do aluno: ");
    Scanner scanner = new Scanner(System.in);
    String nomeAluno = scanner.nextLine();

    System.out.println("Digite a nota do aluno: " + nomeAluno);
    nota = scanner.nextInt();
    scanner.close();

    if (nota <= 40) {
      System.out.println(nomeAluno + " foi reprovado.");
    }
    if (nota > 40) {
      if (nota % 5 > 3) {
        multiploDeCinco = nota + 1;
        System.out.println("A nota final do aluno: " + nomeAluno + " é " + multiploDeCinco);
      } else {
        System.out.println("A nota final do aluno " + nomeAluno + " é: " + nota);
      }
    }
  }
}
