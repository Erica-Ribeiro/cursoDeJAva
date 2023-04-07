/* 16) [DESAFIO] Escreva um programa para calcular a redução do tempo de
vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e
quantos anos ele já fumou. Considere que um fumante perde 10 min de
vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e
exiba o total em dias.
 */
package lista_de_exercicios1;

import javax.swing.JOptionPane;

public class DesafioAnosDeVidaDeUmFumante {
    public static void main(String[] args) {
        
    
    int CigarrosPorDia = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cigarros fumados diariamente: "));
    int anosFumando = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de anos fumando: "));
    
    
    int totalCigarros = CigarrosPorDia * 365 * anosFumando;
    int tempoPerdidoEmMin = totalCigarros * 10;
    int diasPerdidos = tempoPerdidoEmMin / (60 * 24);

    JOptionPane.showMessageDialog(null, "você perdeu " + diasPerdidos + " dias de vida." );
    

    } 
}
