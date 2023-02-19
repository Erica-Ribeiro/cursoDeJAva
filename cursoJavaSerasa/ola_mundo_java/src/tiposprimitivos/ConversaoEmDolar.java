
/* Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira
(em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. */
package tiposprimitivos;

import java.util.Scanner;

public class ConversaoEmDolar {
    final static double TAXA_DE_CAMBIO = 5.17;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor em R$: " );
        double reais = scan.nextDouble();
        double dolar = reais / TAXA_DE_CAMBIO;
        System.out.printf("Com R$%.2f você pode comprar US$%.2f.", reais, dolar);
        scan.close();
    }
    
}