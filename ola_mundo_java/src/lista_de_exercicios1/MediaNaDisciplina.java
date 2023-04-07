/*Faça um programa que leia as duas notas de um aluno em uma matéria
e mostre na tela a sua méd */
package lista_de_exercicios1;

import java.util.Scanner;

public class MediaNaDisciplina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2)/2;     
        System.out.println("A media entre as notas é: " + media);
}    
}