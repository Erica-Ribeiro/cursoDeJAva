/*2. Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar. */

package list_de_exercicios_logica_condicionais_simples;

import javax.swing.JOptionPane;

public class Ex2IdadeParaVotar {
    public static void main(String[] args) {
        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");

        int anoNascimento = Integer.parseInt(anoNascimentoStr);
        int idade = 2023 - anoNascimento;

        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Você não pode votar.");
        } else if (idade >= 18 && idade < 70) {
            JOptionPane.showMessageDialog(null, "Você pode votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Seu voto é opcional.");
        }
    }
}
