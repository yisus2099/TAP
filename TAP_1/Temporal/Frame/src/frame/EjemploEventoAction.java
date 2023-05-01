package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class EjemploEventoAction extends JFrame {
    JButton btn_uno;
    public EjemploEventoAction() {
        super("EVENTOS");
        this.setLayout(null);
        btn_uno = new JButton ("ACCION");
        btn_uno.setBounds(100, 100, 100, 50);
        this.add(btn_uno);
        btn_uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btn_uno.getRootPane(), "DETECTE EL EVENTO ACTION");
            }
        });
        this.setBounds(100, 100, 500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
        public static void main (String[ ] args){
        new EjemploEventoAction();
    }
}
