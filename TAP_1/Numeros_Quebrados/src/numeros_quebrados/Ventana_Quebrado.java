package numeros_quebrados;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Ventana_Quebrado extends JPanel {
    
    JLabel lbl_tit1, lbl_quebrado, lbl_num, lbl_dem, lbl_quebrado2, lbl_num2, lbl_dem2;
    JTextField txt_num, txt_dem, txt_num2, txt_dem2;
    JButton btn_crear, btn_limpiar;
    
    
    public Ventana_Quebrado() {
        this.setLayout(null);

        lbl_tit1 = new JLabel("INSERTAR NUMEROS QUEBRADOS");
        lbl_quebrado = new JLabel("NUMERO 1:  ");
        lbl_num = new JLabel("NUMERADOR: ");
        lbl_dem = new JLabel("DENOMINADOR: ");
        lbl_quebrado2 = new JLabel("NUMERO 2:  ");
        lbl_num2 = new JLabel("NUMERADOR: ");
        lbl_dem2= new JLabel("DENOMINADOR: ");

        txt_num = new JTextField(80);
        txt_dem= new JTextField(80);
        txt_num2 = new JTextField(80);
        txt_dem2 = new JTextField(80);

        btn_crear = new JButton("CREAR");
        btn_limpiar = new JButton("LIMPIAR");

        txt_num.setBackground(Color.LIGHT_GRAY);
        txt_num.setForeground(Color.black);
        txt_dem.setBackground(Color.LIGHT_GRAY);
        txt_dem.setForeground(Color.black);
        txt_num2.setBackground(Color.LIGHT_GRAY);
        txt_num2.setForeground(Color.black);
        txt_dem2.setBackground(Color.LIGHT_GRAY);
        txt_dem2.setForeground(Color.black);

        // Label
        this.add(lbl_tit1);
        this.add(lbl_quebrado);
        this.add(lbl_num);
        this.add(lbl_dem);
        this.add(lbl_quebrado2);
        this.add(lbl_num2);
        this.add(lbl_dem2);

        //Text
        this.add(txt_num);
        this.add(txt_dem);
        this.add(txt_num2);
        this.add(txt_dem2);

        // Botones
        this.add(btn_crear);
        this.add(btn_limpiar);

        lbl_tit1.setBounds(220, 0, 250, 50);

        lbl_quebrado.setBounds(100, 50, 100, 50);

        lbl_num.setBounds(100, 100, 100, 50);
        txt_num.setBounds(220, 100, 200, 50);

        lbl_dem.setBounds(100, 160, 100, 50);
        txt_dem.setBounds(220, 160, 200, 50);

        lbl_quebrado2.setBounds(100, 220, 100, 50);

        lbl_num2.setBounds(100, 270, 100, 50);
        txt_num2.setBounds(220, 270, 200, 50);

        lbl_dem2.setBounds(100, 330, 100, 50);
        txt_dem2.setBounds(220, 330, 200, 50);

        btn_crear.setBounds(110, 400, 100, 50);
        btn_limpiar.setBounds(250, 400, 100, 50);

        btn_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btn_limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_num.setText("");
                txt_dem.setText("");
                txt_num2.setText("");
                txt_dem2.setText("");
            }
        });
        
        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(186,194, 232));
    }
}
