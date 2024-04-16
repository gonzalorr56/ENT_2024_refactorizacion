package ejercicio1;

public class Calculadora {
    public int sumar(int a, int b) {
        return a+b;
    }

    public int restar(int a, int b) {
        return a-b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        } else {
            return a / b;
        }
    }
}
