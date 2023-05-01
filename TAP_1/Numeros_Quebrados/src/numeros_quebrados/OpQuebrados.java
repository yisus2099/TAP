package numeros_quebrados;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class OpQuebrados {

    private Quebrado queb1, queb2;

    public OpQuebrados(Quebrado queb1, Quebrado queb2) {
        this.queb1 = queb1;
        this.queb2 = queb2;
    }

    public Quebrado getQueb1() {
        return queb1;
    }

    public void setQueb1(Quebrado queb1) {
        this.queb1 = queb1;
    }

    public Quebrado getQueb2() {
        return queb2;
    }

    public void setQueb2(Quebrado queb2) {
        this.queb2 = queb2;
    }

    //SUMA
    public Quebrado suma() {
        if (queb1.getDenominador() == queb2.getDenominador()) {
            int numerador, denominador;
            numerador = queb1.getNumerador() + queb2.getNumerador();
            denominador = queb1.getDenominador();
            return new Quebrado(numerador, denominador);
            
        } else {
            int numerador, denominador;
            numerador = (queb1.getNumerador() * queb2.getDenominador()) + (queb1.getDenominador() * queb2.getNumerador());
            denominador = queb1.getDenominador() * queb2.getDenominador();
            return new Quebrado(numerador, denominador);
        }
    }

    //RESTA
    public Quebrado resta() {
        if (queb1.getDenominador() == queb2.getDenominador()) {
            int numerador = queb1.getNumerador() - queb2.getNumerador();
            int denominador = queb1.getDenominador();
            return new Quebrado(numerador, denominador);
        } else {
            int numerador = (queb1.getNumerador() * queb2.getDenominador()) - (queb1.getDenominador() * queb2.getNumerador());
            int denominador = queb1.getDenominador() * queb2.getDenominador();
            return new Quebrado(numerador, denominador);
        }
    }

    //MULTIPLICACION
    public Quebrado multiplicacion() {

        int numerador = queb1.getNumerador() * queb2.getNumerador();
        int denominador = queb1.getDenominador() * queb2.getDenominador();

        return new Quebrado(numerador, denominador);
    }

    //DIVISION
    public Quebrado division() {
        int numerador = queb1.getNumerador() * queb2.getDenominador();
        int denominador = queb2.getNumerador() * queb1.getDenominador();
        return new Quebrado(numerador, denominador);
    }
}
