package numeros_quebrados;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Ventana_Inicial extends JPanel{
      JLabel lbl_tiutlo;

    public Ventana_Inicial() {

        lbl_tiutlo = new JLabel("Aplicación que calcula numeros quebrados ");

        lbl_tiutlo.setFont(new Font("Arial", Font.BOLD, 22));
        lbl_tiutlo.setForeground(Color.BLACK);
        
        this.add(lbl_tiutlo, BorderLayout.CENTER);

        this.setBackground(new Color(255,107, 107));
    }

}
