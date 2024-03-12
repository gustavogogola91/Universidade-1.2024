import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        // limpeza de buffer
        leitor.nextLine();
        return valor;
    }

    public static String lerString() {
        var string = leitor.nextLine();
        return string;
    }

    public static float lerFloat() {
        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;

    }
}