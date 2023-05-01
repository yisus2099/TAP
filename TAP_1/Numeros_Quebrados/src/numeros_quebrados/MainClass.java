package numeros_quebrados;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainClass extends JFrame{
    JPanel panel_Principal, panel_Btn, panel_vent;
    JButton btn_Inicio, btn_Quebrados, btn_Resultados;

    public MainClass() {
        //Boton Inicio
        btn_Inicio = new JButton("INICIO");
        btn_Inicio.setSize(180, 30);
        btn_Inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               mostrarVentanas(new Ventana_Inicial());
            }
        });
        //Quebrados
        btn_Quebrados = new JButton("QUEBRADOS");
        btn_Quebrados.setSize(180, 30);
        btn_Quebrados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanas(new Ventana_Quebrado());
            }
        });
        
        //Boton Resultados
        btn_Resultados = new JButton("RESULTADOS");
        btn_Resultados.setSize(180, 30);
        btn_Resultados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               mostrarVentanas(new Ventana_Resultado());
            }
        });

        panel_Btn = new JPanel();
        panel_Btn.setBackground(new Color(78, 7,7));
        panel_Btn.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel_Btn.add(btn_Inicio);
        panel_Btn.add(btn_Quebrados);
        panel_Btn.add(btn_Resultados);
        panel_vent = new JPanel();
        panel_vent.setBackground(new Color(245, 116, 104));
        panel_vent.setLayout(new BorderLayout());

       mostrarVentanas(new Ventana_Inicial());

        panel_Principal = new JPanel();
        panel_Principal.setBackground(new Color(101, 10, 2));
        panel_Principal.setLayout(new BorderLayout());
        panel_Principal.add(panel_Btn, BorderLayout.NORTH);
        panel_Principal.add(panel_vent, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(panel_Principal, BorderLayout.CENTER);

        this.setBounds(150, 15, 650, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void mostrarVentanas(JPanel window) {
        window.setSize(800, 700);
        window.setLocation(0, 0);

        panel_vent.removeAll();
        panel_vent.add(window, BorderLayout.CENTER);
        panel_vent.revalidate();
        panel_vent.repaint();
    }
    public static void main(String[] args) {
        new MainClass().setVisible(true);
    }
    
}
