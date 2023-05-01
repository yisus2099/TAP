package framepanels;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class VentanaInicial extends JPanel{
    JLabel lbl_titulo;

    public VentanaInicial() {
        lbl_titulo = new JLabel ("BIENVENIDO A . . . . . .");
        lbl_titulo.setFont(new Font("Algerian", Font.BOLD, 36));
        lbl_titulo.setForeground(new Color(155, 255, 255));
        
        this.add(lbl_titulo, BorderLayout.CENTER);
        this.setBackground(new Color(0, 0, 255));
    }
    
}
