import java.util.Scanner;

public class Exercicios {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ex04();
    }

    public static void ex01() {

        System.out.println("EXERCICIO 1");

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

    public static void ex02() {

        System.out.println("EXERCICIO 2");
        
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o numero para a posição %d: ", i);
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Posição %d: %d - ", i, arr[i]);

            if(arr[i] > 0) {
                System.out.println("POSITIVO");
            } else if(arr[i] < 0) {
                System.out.println("NEGATIVO");
            } else {
                System.out.println("ZERO");
            }
        }
    }

    public static void ex03() {

        System.out.println("EXERCICIO 3");

        int[] arr = new int[5];
        int[] dobro = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o numero para a posição %d: ", i);
            arr[i] = input.nextInt();
            dobro[i] = arr[i] * 2;
        }

        System.out.println("Array original");
        for (int i = 0; i < dobro.length; i++) {
            System.out.printf("Posição %d: %d%n",i, arr[i]);
        }
        
        System.out.println("Array dobro");
        for (int i = 0; i < dobro.length; i++) {
            System.out.printf("Posição %d: %d%n",i, dobro[i]);
        }
    }

    public static void ex04() {
        
        System.out.println("EXERCICIO 4");

        int[] arr = new int[5];
        int n;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o numero para a posição %d: ", i);
            arr[i] = input.nextInt();
        }

        System.out.print("Informe um valor qualquer: ");
        n = input.nextInt();

        System.out.printf("Indice dos numeros menores que %d:%n", n);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < n) {
                System.out.println(i);
            }
        }
    }

    public static void ex05() {


        System.out.println("EXERCICIO 05");

        int[] arr = new int[5];
        int n;
        int cont;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o numero para a posição %d: ", i);
            arr[i] = input.nextInt();
        }

        System.out.print("Digite um numero qualquer: ");
        input.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                cont++;
            }
        }

        System.out.printf("O número %d apareceu %d vez(es) no array", n, cont);
    }

    
}
