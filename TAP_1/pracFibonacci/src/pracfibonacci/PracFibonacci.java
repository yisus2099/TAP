package pracfibonacci;

import java.util.Scanner;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PracFibonacci extends JFrame {

    JLabel lbl_terminos, lbl_resultado;
    JTextField txt_terminos, txt_resultado;
    JButton btn_salir, btn_proceder;

    public PracFibonacci() {
        super("FIBONACCI");
        this.setLayout(null);

        lbl_terminos = new JLabel("TERMINOS: ");
        lbl_resultado = new JLabel("RESULTADO: ");

        txt_terminos = new JTextField(80);
        txt_resultado = new JTextField(80);

        btn_proceder = new JButton("PROCEDER");
        btn_salir = new JButton("SALIR");

        txt_terminos.setBackground(Color.LIGHT_GRAY);
        txt_terminos.setForeground(Color.black);
        txt_resultado.setBackground(Color.LIGHT_GRAY);
        txt_resultado.setForeground(Color.black);

        this.add(lbl_terminos);
        this.add(lbl_resultado);
        this.add(txt_terminos);
        this.add(txt_resultado);
        this.add(btn_proceder);
        this.add(btn_salir);

        lbl_terminos.setBounds(100, 100, 100, 50);
        txt_terminos.setBounds(220, 100, 200, 50);

        lbl_resultado.setBounds(100, 160, 100, 50);
        txt_resultado.setBounds(220, 160, 200, 50);

        btn_salir.setBounds(300, 280, 150, 50);
        btn_proceder.setBounds(80, 280, 150, 50);

        btn_proceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = 0, n2 = 1, sum;
                int num = Integer.parseInt(txt_terminos.getText());
                for (int i = 1; i < num; i++) {
                        sum = n1 + n2;
                        n1 = n2;
                        n2 = sum;
                    
                }
                txt_resultado.setText(" " + n1);
            }});
        
        btn_salir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(WIDTH);
            }
        });

        this.setBounds(200, 200, 500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new PracFibonacci();

    }
}
