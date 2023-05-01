
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        miBoton1 = new MiBoton();
        miBoton2 = new MiBoton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Creación de un nuevo Componente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 190, 30));

        miBoton1.setForeground(new java.awt.Color(0, 0, 204));
        miBoton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miBoton1MouseClicked(evt);
            }
        });
        miBoton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                miBoton1PropertyChange(evt);
            }
        });
        getContentPane().add(miBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 110));

        miBoton2.setForeground(new java.awt.Color(255, 0, 0));
        miBoton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miBoton2MouseClicked(evt);
            }
        });
        getContentPane().add(miBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 120, 110));

        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miBoton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miBoton1MouseClicked
        miBoton1.setEstilo(1);
        miBoton1.repaint();
        cambioColor(miBoton1);

    }//GEN-LAST:event_miBoton1MouseClicked

    private void miBoton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miBoton2MouseClicked
        miBoton2.setEstilo(1);
        miBoton2.repaint();
        cambioColor(miBoton2);
    }//GEN-LAST:event_miBoton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void miBoton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_miBoton1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_miBoton1PropertyChange

    public void cambioColor(MiBoton boton) {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        
        Color aleatorio =new Color (r, g, b);
        boton.setForeground(aleatorio);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private MiBoton miBoton1;
    private MiBoton miBoton2;
    // End of variables declaration//GEN-END:variables
}