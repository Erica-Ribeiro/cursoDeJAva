/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte
a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado */
package lista_de_exercicios1;

import java.util.Scanner;

public class LocadoraDeCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de km percorrido: ");
        double km = scan.nextDouble();

        System.out.println("Digite a quantidade de dias que o carro ficou alugado: ");
        int dias = scan.nextInt();

        double valorTotal = (dias *90) + (km * 0.20);
        System.out.printf("O valor total é: %.2f " , valorTotal);
        scan.close();
    }
    
}