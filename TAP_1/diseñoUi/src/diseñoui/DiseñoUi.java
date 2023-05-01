
package diseñoui;
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
public class DiseñoUi {
 JLabel lbl_titl, lbl_punto, lbl_punto2, lbl_distancia;
    JTextField txt_respuesta;
    JButton btn_distancia, btn_limpiar;
    
     public Ventana_Resultado() {
        this.setLayout(null);

        lbl_titl = new JLabel("RESULTADO");
        lbl_punto = new JLabel("PUNTO 1: ( "  + ", "  + " )");
        lbl_punto2 = new JLabel("PUNTO 2:  ( "  + ", "  + " )");
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

        btn_distancia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_respuesta.setEnabled(false);
             //   int res = rec.distancia(point.getX(), point.getY(), point.getX1(), point.getY1());
           //     txt_respuesta.setText("La distancia es de: " + res);

            }
        });

        btn_limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             /*   point.setX(0);
                point.setY(0);
                point.setX1(0);
                point.setY1(0);

                txt_respuesta.setText("");
                lbl_punto.setText("Punto 1: (" + point.getX() + ", " + point.getY() + ")");
                lbl_punto.setText("Punto 2: (" + point.getX1() + ", " + point.getY1() + ")");
*/
            }
        });

        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(160, 100, 110));
     }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
