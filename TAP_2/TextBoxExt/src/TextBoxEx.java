
import java.awt.Color;



/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class TextBoxEx extends javax.swing.JTextField{
private java.awt.Color colorOriginal = Color.white;
//inicializada en blanco

    public TextBoxEx() {
        super();
        java.awt.event.FocusAdapter fl = new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt){
            jtfTextBoxExFocusGained(evt);
        }
        public void focusLost (java.awt.event.FocusEvent evt){
            jtfTextBoxExFocusLost(evt);
        }
        };
        addFocusListener(fl);
    }
    private Boolean CambiarColor = false;

    /**
     * Get the value of CambiarColor
     *
     * @return the value of CambiarColor
     */
    public Boolean getCambiarColor() {
        return CambiarColor;
    }

    /**
     * Set the value of CambiarColor
     *
     * @param CambiarColor new value of CambiarColor
     */
    public void setCambiarColor(Boolean CambiarColor) {
        this.CambiarColor = CambiarColor;
    }

    public void jtfTextBoxExFocusGained(java.awt.event.FocusEvent evt){
        if(getCambiarColor()){
            colorOriginal = getBackground();
            setBackground(Color.pink);
        }
        else
            setBackground(colorOriginal);
    }
    
    private void jtfTextBoxExFocusLost(java.awt.event.FocusEvent evt){
        setBackground(colorOriginal);
    }
    
}
