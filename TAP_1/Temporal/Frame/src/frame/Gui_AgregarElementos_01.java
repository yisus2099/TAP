package frame;
import java.awt.Container;
import javax.swing.*;

public class Gui_AgregarElementos_01  extends JFrame{
    private Container panel;
    private JButton miBoton;
    
    public Gui_AgregarElementos_01(){
        super("CON HERENCIA CON CONTAINER");
        miBoton = new JButton("Aceptar");
        panel = getContentPane();
        panel.add(miBoton);
        //this.pack();
        this.setBounds(30, 50, 200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
    public static void main (String[ ] args){
        new Gui_AgregarElementos_01();
        
    }
}
