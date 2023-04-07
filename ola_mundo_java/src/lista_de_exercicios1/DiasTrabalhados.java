/* 15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário,
sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada */

package lista_de_exercicios1;

import javax.swing.JOptionPane;

public class DiasTrabalhados {
    public static void main(String[] args) {
        String diasTrabalhadosStr = JOptionPane.showInputDialog("digite o numero de dias trabalhados:");
        int diasTrabalhados = Integer.parseInt(diasTrabalhadosStr);
        
        int horasTrabalhadas = diasTrabalhados * 8;
        double salario = horasTrabalhadas * 25.0;
        
        JOptionPane.showMessageDialog(null, String.format("Salário do funcionário: R$ %.2f", salario));

    }
    
}