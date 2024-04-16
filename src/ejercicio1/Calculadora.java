package ejercicio1;

public class Calculadora {
    public int sumar(int uno, int dos) {
        return uno+dos;
    }

    public int restar(int uno, int dos) {
        return uno-dos;
    }

    public int multiplicar(int uno, int dos) {
        return uno * dos;
    }

    public int dividir(int uno, int dos) {
        if (dos == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        } else {
            return uno / dos;
        }
    }
}
