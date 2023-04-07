/*1. Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso,
exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida. */

package list_de_exercicios_logica_condicionais_simples;

import java.util.Scanner;

;
public class Ex1MultadoOuNao  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro em km/h: ");
        int velocidade = scan.nextInt();

        if (velocidade > 80) {
            int kmAcima = velocidade - 80;
            double valorMulta = kmAcima * 5.0;

            System.out.printf("Você foi multado! A velocidade permitida é de 80 km/h. Sua velocidade foi de %d km/h. O valor da multa é R$ %.2f.", velocidade, valorMulta);
        } else {
            System.out.printf("Sua velocidade está dentro do limite permitido.");
            scan.close();
        }
    }
}
    
