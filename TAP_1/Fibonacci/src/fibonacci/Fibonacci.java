package fibonacci;

 public class Fibonacci {

    int n1 = 0, n2 = 1, sum;
    int numeroTerminos;
    String acu = "";

    public int getNumeroTerminos() {
        return numeroTerminos;
    }

    public void setNumeroTerminos(int numeroTerminos) {
        this.numeroTerminos = numeroTerminos;
    }

    public void fibonacciSerie() {
        for (int i = 1; i < numeroTerminos; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            acu = acu + n1 + " ";
        }
    }
}
