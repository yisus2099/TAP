package frame;
import javax.swing.*;
public class Gui00_2 extends JFrame {
    
    public  Gui00_2(){
        super("EXTENDS JFrame");
        
        //this.pack();
        this.setBounds(100, 100, 300, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[ ] args){
        new Gui00_2();
    }
}
