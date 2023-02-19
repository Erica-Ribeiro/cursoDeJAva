/*1 - Crie uma classe que receba o valor de um produto e a porcentagem de desconto, calcule e 
mostre o valor do desconto e o valor do produto com o desconto. Observação: o valor do 
desconto é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de 
desconto / 100. */
package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = scan.nextDouble();
        System.out.println("Digite o a porcentagem do desconto: ");
        double porcentagem = scan.nextDouble();
        double desconto = valor*(porcentagem/100);
        double valorComDesconto = valor - desconto;
        System.out.println("O valor com desconto é: " + valorComDesconto);
        scan.close();

        
    }
}