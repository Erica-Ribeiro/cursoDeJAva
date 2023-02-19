/*) Faça um programa que leia o nome de uma pessoa e mostre uma
mensagem de boasvindas para el */
package tiposprimitivos;

import javax.swing.JOptionPane;

public class BoasVindas {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario: "));
        JOptionPane.showMessageDialog(null, "Olá " + nome + " é um prazer te conhecer " + "\n O salário digitado foi: " + salario);
    }
    
}