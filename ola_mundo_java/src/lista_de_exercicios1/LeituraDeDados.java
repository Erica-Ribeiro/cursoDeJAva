package lista_de_exercicios1;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Você digitou: " + idade);
    }
    
}