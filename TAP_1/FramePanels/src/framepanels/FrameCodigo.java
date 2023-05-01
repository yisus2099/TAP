package framepanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FrameCodigo extends JFrame{
    JPanel contenedorAPP;
    JPanel contenedroBotones;
    JPanel contenedorVentanas;
    JButton btn_pagina1, btn_pagina2;
    
    public FrameCodigo(){
        btn_pagina1 = new JButton("PAGINA UNO");
        btn_pagina1.setSize(200, 40);
        btn_pagina1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanas(new PaginaUno());
            }
        });
        
        btn_pagina2 = new JButton("PAGINA DOS");
        btn_pagina2.setSize(200, 40);
        btn_pagina2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               mostrarVentanas(new PaginaDos());
            }
        });
        
        contenedroBotones = new JPanel();
        contenedroBotones.setBackground(new Color(74, 171, 44));
        contenedroBotones.add(btn_pagina1);
        contenedroBotones.add(btn_pagina2);
        
        contenedorVentanas = new JPanel();
        contenedorVentanas.setBackground(new Color(200, 200, 200));
        contenedorVentanas.setLayout(new BorderLayout());
        
        mostrarVentanas( new VentanaInicial());
        
        /*
        VentanaInicial vInicial = new VentanaInicial();
        vInicial.setSize(720, 480);
        vInicial.setLocation(0, 0);
        
        contenedorVentanas.removeAll();
        contenedorVentanas.add(vInicial, BorderLayout.CENTER);
        contenedorVentanas.revalidate();
        contenedorVentanas.repaint();
        
        */
        
        contenedorAPP = new JPanel();
        contenedorAPP.setBackground(new Color(255, 255, 255));
        contenedorAPP.setLayout(new BorderLayout());
        contenedorAPP.add(contenedroBotones, BorderLayout.NORTH);
        contenedorAPP.add(contenedorVentanas, BorderLayout.CENTER);
        
        this.setLayout(new BorderLayout());
        this.add(contenedorAPP, BorderLayout.CENTER);
        
        this.setBounds(100, 100, 720, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    private void mostrarVentanas(JPanel ventana){
        ventana.setSize(720, 480);
        ventana.setLocation(0, 0);
        
        contenedorVentanas.removeAll();
        contenedorVentanas.add(ventana, BorderLayout.CENTER);
        contenedorVentanas.revalidate();
        contenedorVentanas.repaint();
    }
    public static void main(String args[]){
        new FrameCodigo().setVisible(true);
    }
}
