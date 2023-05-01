package framepanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class PaginaDos extends JPanel{
    private final JLabel titulo;
    public PaginaDos(){
        titulo = new JLabel("BIENVENIDO A LA PAGINA 2");
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setFont(new Font("Algerian", Font.BOLD, 36));
        
        this.setSize(680, 420);
        this.setBackground(new Color(255,0, 0));
        this.add(titulo, BorderLayout.CENTER);
        
    }
}
