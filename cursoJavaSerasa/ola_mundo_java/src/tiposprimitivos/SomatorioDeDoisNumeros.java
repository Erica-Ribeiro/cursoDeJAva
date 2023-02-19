/*) Desenvolva um algoritmo que leia dois números inteiros e mostre o
somatório entre eles */

package tiposprimitivos;

import java.util.Scanner;

public class SomatorioDeDoisNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos numeros é: " + soma);
        scan.close();
    }
    
}