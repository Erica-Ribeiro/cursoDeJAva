/* Desenvolva um programa que leia uma distância em metros e mostre os
valores relativos em outras medidas. */
package tiposprimitivos;

import java.util.Scanner;

public class DistanciaEmMetros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma distancia em metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;
        double decimetros = metros * 10;
        double quilometros = metros / 1000;
        System.out.println("A distância de " + metros + " metros corresponde a:");
        System.out.println(centimetros + " centímetros");
        System.out.println(decimetros + " decimetros");
        System.out.println(quilometros + " km");
        
        scan.close();
    }
    
}