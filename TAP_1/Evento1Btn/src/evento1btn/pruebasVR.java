package evento1btn;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class pruebasVR extends JFrame {

    JLabel lbl_titl, lbl_punto, lbl_punto2, lbl_distancia;
    JTextField txt_respuesta;
    JButton btn_distancia, btn_limpiar;

    public pruebasVR() {
        super("EJEMPLO");
        this.setLayout(null);

        lbl_titl = new JLabel("RECTA");
        lbl_punto = new JLabel("PUNTO 1:  ");
        lbl_punto2 = new JLabel("PUNTO 2:  ");
        lbl_distancia = new JLabel("DISTANCIAS:");

        txt_respuesta = new JTextField(80);


        btn_distancia = new JButton("CREAR");
        btn_limpiar = new JButton("LIMPIAR");

        txt_respuesta.setBackground(Color.LIGHT_GRAY);
        txt_respuesta.setForeground(Color.black);
  

        // Label
        this.add(lbl_titl);
        this.add(lbl_punto);
        this.add(lbl_punto2);
        this.add(lbl_distancia);

        //Text
        this.add(txt_respuesta);

        // Botones
        this.add(btn_distancia);
        this.add(btn_limpiar);

        lbl_titl.setBounds(220, 0, 100, 50);

        lbl_punto.setBounds(100, 50, 100, 50);

        lbl_punto2.setBounds(100, 100, 100, 50);
        
        lbl_distancia.setBounds(100, 150, 100, 50);
        txt_respuesta.setBounds(220, 150, 200, 50);

        btn_distancia.setBounds(110, 220, 100, 50);
        btn_limpiar.setBounds(250, 220, 100, 50);

        this.setBounds(100, 100, 500, 600);
        //this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new pruebasVR();
    }
}
