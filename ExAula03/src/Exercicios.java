import java.util.Scanner;

public class Exercicios {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ex01();
    }

    public static void ex01() {

        int[] arr = new int[5];
        int med = 0;

        System.out.println("Informe 5 numeros: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%nNumero %d: ", i + 1);
            arr[i] = input.nextInt();
            med += arr[i];
        }

        med = med / 5;

        System.out.printf("A média destes valores é: %d%n", med);

        System.out.print("Números maiores que a média: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > med) {
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.println();
        System.out.print("Números menores que a média: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < med) {
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.println();
        System.out.print("Números iguais que a média: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == med) {
                System.out.printf("%d ", arr[i]);
            }
        }


    }

    
}
