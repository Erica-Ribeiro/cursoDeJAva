/* (Ex12) Crie um programa que leia o preço de um produto, calcule e mostre o
seu PREÇO PROMOCIONAL, com 5% de desconto. */
package lista_de_exercicios1;

import java.util.Scanner;

public class ProdutoComDesconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double preco = scan.nextDouble();
        double precoPromocional = preco - (preco * 0.05);
        System.out.printf("O preço promocional é: R$ %2.2f", precoPromocional );
        scan.close();


    }
    
}