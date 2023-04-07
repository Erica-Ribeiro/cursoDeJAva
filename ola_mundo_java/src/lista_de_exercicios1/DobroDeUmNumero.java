/*Crie um algoritmo que leia um número real e mostre na tela o seu dobro
e a sua terça parte */

package lista_de_exercicios1;

import java.util.Scanner;

public class DobroDeUmNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = scan.nextDouble();
        double dobro = numero * 2;
        double tercaParte = numero /3;

        System.out.println("O dobro de: " + numero + " é " +  dobro + " e a terça parte de " + numero + " é: " + tercaParte);
        scan.close();
    }
    
}