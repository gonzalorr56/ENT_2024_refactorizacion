package ejercicio3;

public class Calculadora {

    public static final int SUMA = 1;
    public static final int RESTA = 2;

    public int operacion(int operador1, int operador2, int operacion) throws Exception {
          switch(operacion) {
          case SUMA: return operador1+operador2;
          case RESTA: return operador1-operador2;

          default:throw new Exception("operación erronea");
          }
    }
}