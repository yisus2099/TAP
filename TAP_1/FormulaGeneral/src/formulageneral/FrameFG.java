package formulageneral;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.*;

public class FrameFG extends JFrame {
    
    JLabel lbl_c1, lbl_c2, lbl_c3;
    JTextField txt_c1, txt_c2, txt_c3;
    JButton btn_procesar, btn_limpiar, btn_salir;
    //RESULTADOS
    JLabel lbl_r1, lbl_r2;
    JTextField txt_r1, txt_r2;
    
    public FrameFG() {
        super("FORMULA GNERAL");
        this.setLayout(null);
        
        lbl_c1 = new JLabel("A: ");
        lbl_c2 = new JLabel("B: ");
        lbl_c3 = new JLabel("C: ");
        
        txt_c1 = new JTextField(80);
        txt_c2 = new JTextField(80);
        txt_c3 = new JTextField(80);
        
        btn_procesar = new JButton("PROCESAR");
        btn_limpiar = new JButton("LIMPIAR");
        btn_salir = new JButton("SALIR");

        //RESULTADOS
        lbl_r1 = new JLabel("RESULTADO 1: ");
        lbl_r2 = new JLabel("RESULTADO 2: ");
        
        txt_r1 = new JTextField(80);
        txt_r2 = new JTextField(80);
        
        txt_c1.setBackground(Color.LIGHT_GRAY);
        txt_c1.setForeground(Color.black);
        txt_c2.setBackground(Color.LIGHT_GRAY);
        txt_c2.setForeground(Color.black);
        txt_c3.setBackground(Color.LIGHT_GRAY);
        txt_c3.setForeground(Color.black);
        txt_r1.setBackground(Color.LIGHT_GRAY);
        txt_r1.setForeground(Color.black);
        txt_r2.setBackground(Color.LIGHT_GRAY);
        txt_r2.setForeground(Color.black);
        
        this.add(lbl_c1);
        this.add(lbl_c2);
        this.add(lbl_c3);
        this.add(lbl_r1);
        this.add(lbl_r2);
        this.add(txt_c1);
        this.add(txt_c2);
        this.add(txt_c3);
        this.add(txt_r1);
        this.add(txt_r2);
        this.add(btn_procesar);
        this.add(btn_limpiar);
        this.add(btn_salir);
        
        lbl_c1.setBounds(50, 100, 50, 25);
        txt_c1.setBounds(100, 100, 200, 50);
        
        lbl_c2.setBounds(50, 160, 100, 50);
        txt_c2.setBounds(100, 160, 200, 50);
        
        lbl_c3.setBounds(50, 220, 100, 50);
        txt_c3.setBounds(100, 220, 200, 50);
        
        lbl_r1.setBounds(350, 100, 100, 50);
        txt_r1.setBounds(450, 100, 200, 50);
        
        lbl_r2.setBounds(350, 220, 100, 50);
        txt_r2.setBounds(450, 220, 200, 50);
        
        btn_procesar.setBounds(50, 310, 150, 50);
        btn_limpiar.setBounds(210, 310, 150, 50);
        btn_salir.setBounds(370, 310, 150, 50);

        //BOTONES
        btn_procesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormulaGeneral form = new FormulaGeneral();
                form.setcTC(Integer.parseInt(txt_c1.getText()));
                form.setcTI(Integer.parseInt(txt_c2.getText()));
                form.setcTL(Integer.parseInt(txt_c3.getText()));
                form.formulaGeneral();
                txt_r1.setText(" " + form.x1);
                txt_r2.setText(" " + form.x2);
            }
        });
        
        btn_limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_c1.setText("");
                txt_c2.setText("");
                txt_c3.setText("");
                txt_r1.setText("");
                txt_r2.setText("");
            }
        });
        
        btn_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(WIDTH);
            }
        });

        //TEXT
        txt_c1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txt_c1.setBackground(Color.red);
                txt_c1.setForeground(Color.white);
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                txt_c1.setBackground(Color.LIGHT_GRAY);
                txt_c1.setForeground(Color.black);
            }
        }
        );
        
        txt_c2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                 txt_c2.setBackground(Color.red);
                txt_c2.setForeground(Color.white);
            }

            @Override
            public void focusLost(FocusEvent e) {
                 txt_c2.setBackground(Color.LIGHT_GRAY);
                txt_c2.setForeground(Color.black);
            }
        });
        
        txt_c3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txt_c3.setBackground(Color.red);
                txt_c3.setForeground(Color.white);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txt_c3.setBackground(Color.LIGHT_GRAY);
                txt_c3.setForeground(Color.black);
            }
        });

        this.setBounds(200, 200, 700, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new FrameFG();
        
    }
}
