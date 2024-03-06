import java.util.Scanner;

public class Console {

    static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {

        return leitor.nextInt();
    
    }

    public static String lerString() {
        
        return leitor.nextLine();
    }

    public static float lerFloat() {
    
        return leitor.nextFloat();
    }

}
