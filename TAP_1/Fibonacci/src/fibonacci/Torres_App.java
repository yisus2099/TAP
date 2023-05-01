package fibonacci;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.*;

public class Torres_App extends JFrame {

    JLabel lbl_terminos, lbl_resultado;
    JTextField txt_terminos, txt_resultado;
    JButton btn_salir, btn_proceder;

    public Torres_App() {
        super("FIBONACCI");
        this.setLayout(null);
        

         lbl_terminos = new JLabel("TERMINOS: ");
        lbl_resultado = new JLabel("RESULTADO: ");

        txt_terminos = new JTextField(80);
        txt_resultado = new JTextField(80);

        btn_proceder = new JButton("PROCEDER");
        btn_salir = new JButton("SALIR");

        txt_terminos.setBackground(Color.LIGHT_GRAY);
        txt_terminos.setForeground(Color.black);
        txt_resultado.setBackground(Color.LIGHT_GRAY);
        txt_resultado.setForeground(Color.black);

        this.add(lbl_terminos);
        this.add(lbl_resultado);
        this.add(txt_terminos);
        this.add(txt_resultado);
        this.add(btn_proceder);
        this.add(btn_salir);

        lbl_terminos.setBounds(100, 100, 100, 50);
        txt_terminos.setBounds(220, 100, 200, 50);

        lbl_resultado.setBounds(100, 160, 100, 50);
        txt_resultado.setBounds(220, 160, 200, 50);

        btn_salir.setBounds(300, 280, 150, 50);
        btn_proceder.setBounds(80, 280, 150, 50);

        btn_proceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fibonacci fibonacci = new Fibonacci();
                fibonacci.setNumeroTerminos( Integer.parseInt(txt_terminos.getText()));
                fibonacci.fibonacciSerie();
                 txt_resultado.setText(" " + Integer.toString(fibonacci.n1));
                 JOptionPane.showMessageDialog(btn_salir, 0 + " " + fibonacci.acu);
            }                       
});
        
        btn_salir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(WIDTH);
            }
        });

        this.setBounds(200, 200, 500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Torres_App();

    }
}

