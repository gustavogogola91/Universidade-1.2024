public class Calculadora {

    static int somar(int a, int b) {
        return a + b;
    }

    static int subtrair(int a, int b) {
        return a - b;
    }

    static float multiplicar(int a, int b) {
        return a * b;
    }

    static float dividir(int a, int b) {
        if (b == 0) {
            b = 1;
        }
        return a / b;
    }
}
