import java.util.Scanner;

public class Decima {
  // 10 - Um caixa eletronico tipos diferentes de cédulas, sendo elas nos valores
  // de $2, $5, $10, $20, $50, $100 e $200, o caixa só tem 10 cédulas de cada
  // tipo. Escreva um programa que informa o número de cada uma das notas
  // necessárias para despachar um valor que o usuário digite como intenção de
  // saque, caso não seja possível sacar o valor informado o programa deve
  // informar que o saldo é insuficiente.
  public static void main(String[] args) {

    int dois = 10;
    int cinco = 10;
    int dez = 10;
    int vinte = 10;
    int cem = 10;
    int duzentos = 10;
    int limite = 2000;

    System.out.println("Digite o valor do saque ou 0 para sair:");
    Scanner scanner = new Scanner(System.in);
    int saque = scanner.nextInt();
    scanner.close();
    
    while (saque != 0) {
      if (saque > 0 && saque < limite && saque != 1 && saque != 3) {
        if (duzentos >= 0) {
          duzentos = saque / 200;
          saque = saque % 200;
        }
        if (cem >= 0) {
          cem = saque / 100;
          saque = saque % 100;
        }
        if (vinte >= 0) {
          vinte = saque / 20;
          saque = saque % 20;
        }
        if (dez >= 0) {
          dez = saque / 10;
          saque = saque % 10;
        }
        if (cinco >= 0) {
          cinco = saque / 5;
          saque = saque % 5;
        }
        if (dois >= 0) {
          dois = saque / 2;
          saque = saque % 2;
        }
        System.out.println("Quantidade de notas de R$200 é: " + duzentos);
        System.out.println("Quantidade de notas de R$100 é: " + cem);
        System.out.println("Quantidade de notas de R$20 é: " + vinte);
        System.out.println("Quantidade de notas de R$10 é: " + dez);
        System.out.println("Quantidade de notas de R$5 é: " + cinco);
        System.out.println("Quantidade de notas de R$2 é: " + dois);

      } else {
        System.out.println("Não é possível sacar o valor informado.");
        System.out.println("Limite de saque é R$" + limite);
        break;
      }
      break;
    }
  }
}
