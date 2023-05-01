package evento1btn;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class pruebasVP extends JFrame {

    JLabel lbl_tit1, lbl_punto, lbl_corX, lbl_corY, lbl_punto2, lbl_corX2, lbl_corY2;
    JTextField txt_corX, txt_corY, txt_corX2, txt_corY2;
    JButton btn_crear, btn_limpiar;

    public pruebasVP() {
        super("EJEMPLO");
        this.setLayout(null);

        lbl_tit1 = new JLabel("CREAR PUNTOS");
        lbl_punto = new JLabel("PUNTO 1:  ");
        lbl_corX = new JLabel("Coordenada X: ");
        lbl_corY = new JLabel("Coordenada Y: ");
        lbl_punto2 = new JLabel("PUNTO 2:  ");
        lbl_corX2 = new JLabel("Coordenada X: ");
        lbl_corY2 = new JLabel("Coordenada Y: ");

        txt_corX = new JTextField(80);
        txt_corY = new JTextField(80);
        txt_corX2 = new JTextField(80);
        txt_corY2 = new JTextField(80);

        btn_crear = new JButton("CREAR");
        btn_limpiar = new JButton("LIMPIAR");

        txt_corX.setBackground(Color.LIGHT_GRAY);
        txt_corX.setForeground(Color.black);
        txt_corY.setBackground(Color.LIGHT_GRAY);
        txt_corY.setForeground(Color.black);
        txt_corX2.setBackground(Color.LIGHT_GRAY);
        txt_corX2.setForeground(Color.black);
        txt_corY2.setBackground(Color.LIGHT_GRAY);
        txt_corY2.setForeground(Color.black);

        // Label
        this.add(lbl_tit1);
        this.add(lbl_punto);
        this.add(lbl_corX);
        this.add(lbl_corY);
        this.add(lbl_punto2);
        this.add(lbl_corX2);
        this.add(lbl_corY2);

        //Text
        this.add(txt_corX);
        this.add(txt_corY);
        this.add(txt_corX2);
        this.add(txt_corY2);

        // Botones
        this.add(btn_crear);
        this.add(btn_limpiar);

        lbl_tit1.setBounds(220, 0, 100, 50);

        lbl_punto.setBounds(100, 50, 100, 50);

        lbl_corX.setBounds(100, 100, 100, 50);
        txt_corX.setBounds(220, 100, 200, 50);

        lbl_corY.setBounds(100, 160, 100, 50);
        txt_corY.setBounds(220, 160, 200, 50);

        lbl_punto2.setBounds(100, 220, 100, 50);

        lbl_corX2.setBounds(100, 270, 100, 50);
        txt_corX2.setBounds(220, 270, 200, 50);

        lbl_corY2.setBounds(100, 330, 100, 50);
        txt_corY2.setBounds(220, 330, 200, 50);

        btn_crear.setBounds(110, 400, 100, 50);
        btn_limpiar.setBounds(250, 400, 100, 50);

        this.setBounds(100, 100, 500, 600);
        //this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new pruebasVP();
    }
}
