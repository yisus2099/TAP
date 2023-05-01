package numeros_quebrados;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Ventana_Resultado extends JPanel {

    JLabel lbl_titl, lbl_opera;
    JTextField txt_respuesta;
    JButton btn_suma, btn_resta, btn_multiplicacion, btn_division, btn_limpiar;

    public Ventana_Resultado() {
        this.setLayout(null);

        lbl_titl = new JLabel("RESULTADO");
        lbl_opera = new JLabel("RESULTADO FINAL:");

        txt_respuesta = new JTextField(80);

        btn_suma = new JButton("SUMA");
        btn_resta = new JButton("RESTA");
        btn_multiplicacion = new JButton("MULTIPLICAR");
        btn_division = new JButton("DIVISION");
        btn_limpiar = new JButton("LIMPIAR");

        txt_respuesta.setBackground(Color.LIGHT_GRAY);
        txt_respuesta.setForeground(Color.black);

        // Label
        this.add(lbl_titl);
        this.add(lbl_opera);

        //Text
        this.add(txt_respuesta);

        // Botones
        this.add(btn_suma);
        this.add(btn_resta);
        this.add(btn_multiplicacion);
        this.add(btn_division);
        this.add(btn_limpiar);

        lbl_titl.setBounds(260, 0, 100, 50);

        lbl_opera.setBounds(100, 100, 200, 50);
        txt_respuesta.setBounds(250, 100, 200, 50);

        btn_suma.setBounds(10, 200, 100, 50);
        btn_resta.setBounds(130, 200, 100, 50);
        btn_multiplicacion.setBounds(250, 200, 120, 50);
        btn_division.setBounds(390, 200, 100, 50);
        btn_limpiar.setBounds(510, 200, 100, 50);

        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_respuesta.setEnabled(false);
 
            }
        });

        btn_limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
  
            }
        });

        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(186,194, 232));
    }
}
