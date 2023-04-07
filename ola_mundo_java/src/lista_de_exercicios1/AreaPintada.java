/*(EX10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o
serviço, sabendo que cada litro de tinta pinta uma área de 2metros
quadrados. */

package lista_de_exercicios1;

import java.util.Scanner;

public class AreaPintada {
    final static double METROS_POR_LITRO = 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a largura da parede a ser pintada:");
        double largura = scan.nextDouble();
        System.out.println("Digite a altura da parede a ser pintada:");
        double altura = scan.nextDouble();
        double area = largura * altura;
        double litrosDeTinta = area / METROS_POR_LITRO;
        
        System.out.printf("A área a ser pintada é de %.2f metros quadrados.%n", area);
        System.out.printf("Serão necessários %.2f litros de tinta para cobrir a parede.", litrosDeTinta);
        scan.close();

    }
    
}