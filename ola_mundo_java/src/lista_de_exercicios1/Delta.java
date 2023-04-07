/* (Ex 11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação
do segundo grau e mostre o valor de Delta. */

package lista_de_exercicios1;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        double a = scan.nextDouble();
        System.out.println("Digite o valor de B:");
        double b = scan.nextDouble();
        System.out.println("Digite o valor de C:");
        double c = scan.nextDouble();
        double delta = Math.pow(b, a) - 4 * c;
        System.out.println("O valor de Delta é: " + delta); 
        
        scan.close();
    }
    
}