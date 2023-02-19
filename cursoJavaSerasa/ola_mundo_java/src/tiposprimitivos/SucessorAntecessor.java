/*) Faça um programa que leia um número inteiro e mostre o seu antecessor
e seu sucesso */
package tiposprimitivos;

import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int numero = scan.nextInt();
        int antecessor = numero -1;
        int sucessor = numero + 1;
        System.out.println("O antecessor de: " + numero + " é " + antecessor);
        System.out.println("O sucessor de: " + numero +  " é "  + sucessor);
        scan.close();

    }
    
}