package numeros_quebrados;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Quebrado {

   private  int numerador, denominador;

    public Quebrado(int numerador, int denominador) {
       setNumerador(numerador);
        setDenominador(denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Quebrado{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }

}
