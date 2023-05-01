
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Liga extends JLabel implements MouseListener{
    private boolean subraya=false;
    private Color colorAnte;
    
    public Liga(){
        addMouseListener(this);
    }

    private Color colorSubrayado = Color.magenta;

    /**
     * Get the value of colorSubrayado
     *
     * @return the value of colorSubrayado
     */
    public Color getColorSubrayado() {
        return colorSubrayado;
    }

    /**
     * Set the value of colorSubrayado
     *
     * @param colorSubrayado new value of colorSubrayado
     */
    public void setColorSubrayado(Color colorSubrayado) {
        this.colorSubrayado = colorSubrayado;
    }

    private String comando = "calc.exe";

    /**
     * Get the value of comando
     *
     * @return the value of comando
     */
    public String getComando() {
        return comando;
    }

    /**
     * Set the value of comando
     *
     * @param comando new value of comando
     */
    public void setComando(String comando) {
        this.comando = comando;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        if(subraya)
            g.drawLine(2, getHeight()-2, getWidth()-2, getHeight()-2);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        try{
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(getComando());     
        } catch (IOException ex) {
            Logger.getLogger(Liga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        colorAnte = getForeground();
        setForeground(getColorSubrayado());
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(colorAnte);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        subraya = false;
        repaint();
    }
    }
    

