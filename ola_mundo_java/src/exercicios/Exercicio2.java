/*2 - Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores 
inteiros. O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro 
de futebol. O segundo valor corresponde à quantidade de pontos do time lanterna. 
Considerando que cada vitória vale 3 pontos, elabore uma classe que calcule o número de 
vitórias necessárias para que o time lanterna alcance (ou ultrapasse) o líder. Por exemplo, 
supondo que as quantidades de ponto fornecidas sejam 40 e 22, então o número de vitórias 
apresentada na saída deverá ser 6, pois (40-22) / 3 = 6 */
package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pontos do lider do campeonato: ");
        int pontosDoLider = scan.nextInt();

        System.out.println("Pontos do lanterna do campeonato: ");
        int pontosDoLanterna = scan.nextInt();

        int vitoriasNecessarias = (pontosDoLider - pontosDoLanterna)/3;

        System.out.println("Você precisa de: " + vitoriasNecessarias + " vitórias para alcalçar ou ultrapassar o líder");
        
        scan.close();
    }
    
}