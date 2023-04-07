/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e
mostre o seu novo salário, com 15% de aumento. */

package lista_de_exercicios1;

import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salarioAtual = scan.nextDouble();

        double novoSalario = salarioAtual  * 0.15;
        double salarioComAumento = salarioAtual + (salarioAtual * 0.15);
        System.out.printf("Parabéns, você teve um aumento de R$: %.2f no seu salário " , novoSalario);

        System.out.printf("\n Seu novo salário é R$: " + salarioComAumento);
        
        scan.close();
    }
    
}