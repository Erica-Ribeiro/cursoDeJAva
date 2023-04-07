package tiposprimitivos;

import javax.swing.JOptionPane;

public class LeituraComGUI {
    public static void main(String[] args) {
        int idade = 0;

            idade = Integer.parseInt(JOptionPane.showInputDialog("Insira uma idade"));
            System.out.println("A idade digitada foi: " + idade);
    }

    }
