public class Calculadora {

    static float somar(float a, float b) {
        return a + b;
    }

    static float subtrair(float a, float b) {
        return a - b;
    }

    static float multiplicar(float a, float b) {
        return a * b;
    }

    static float dividir(float a, float b) {
        if (b == 0) {
            b = 1;
        }
        return a / b;
    }
}
