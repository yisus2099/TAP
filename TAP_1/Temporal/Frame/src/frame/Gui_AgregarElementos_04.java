package frame;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui_AgregarElementos_04 {
    JButton btn_uno;
    public Gui_AgregarElementos_04(){
        JFrame jf = new JFrame("SIN HERENCIA SIN COTAINER");
        
        btn_uno = new JButton("ACCION");
        jf.add(btn_uno);
        
        jf.setBounds(100, 100, 500, 300);
       jf.setVisible(true);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public static void main (String[ ] args){
        new Gui_AgregarElementos_04();
        
    }
}
