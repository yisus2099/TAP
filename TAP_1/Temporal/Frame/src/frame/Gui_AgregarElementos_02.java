package frame;

import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Gui_AgregarElementos_02  extends JFrame{
        JButton miBoton;
    public Gui_AgregarElementos_02(){
        super("CON HERENCIA SIN CONTAINER");
        miBoton = new JButton("ACCION");
        
        this.add(miBoton);
        
        //this.pack();
        this.setBounds(30, 30, 200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
    public static void main (String[ ] args){
        new Gui_AgregarElementos_02();
        
    }
}
