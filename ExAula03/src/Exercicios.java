import java.util.Scanner;

public class Exercicios {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ex08();
    }

    public static void ex01() {

        System.out.println("EXERCICIO 1");

        int[] arr = new int[5];
        int med = 0;

        System.out.println("Informe 5 numeros: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%nNumero %d: ", i + 1);
            arr[i] = input.nextInt();
            med += arr[i];
        }

        med = med / 5;

        System.out.printf("A média destes valores é: %d%n", med);

        System.out.print("Números maiores que a média: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > med) {
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.println();
        System.out.print("Números menores que a média: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < med) {
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.println();
        System.out.print("Números iguais que a média: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == med) {
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

            if (arr[i] > 0) {
                System.out.println("POSITIVO");
            } else if (arr[i] < 0) {
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
            System.out.printf("Posição %d: %d%n", i, arr[i]);
        }

        System.out.println("Array dobro");
        for (int i = 0; i < dobro.length; i++) {
            System.out.printf("Posição %d: %d%n", i, dobro[i]);
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
            if (arr[i] < n) {
                System.out.println(i);
            }
        }
    }

    public static void ex05() {

        System.out.println("EXERCICIO 05");

        int[] arr = new int[5];
        int n;
        int cont = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o numero para a posição %d: ", i);
            arr[i] = input.nextInt();
        }

        System.out.print("Digite um numero qualquer: ");
        n = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                cont++;
            }
        }

        System.out.printf("O número %d apareceu %d vez(es) no array", n, cont);
    }

    public static void ex06() {

        float[] notas = new float[5];
        float[] pesos = new float[5];
        float med = 0;
        float div = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite o numero para a nota %d: ", i);
            notas[i] = input.nextFloat();
        }

        for (int i = 0; i < pesos.length; i++) {
            System.out.printf("Digite o numero para o peso %d: ", i);
            pesos[i] = input.nextFloat();
        }

        for (int i = 0; i < notas.length; i++) {
            med += (notas[i] * pesos[i]);
            div += pesos[i];
        }

        med = med / div;

        System.out.printf("A média é %.2f%n", med);
    }

    public static void ex07() {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        boolean equals = true;

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Digite o numero para a posição %d do array 1: ", i);
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Digite o numero para a posição %d do array 2: ", i);
            arr2[i] = input.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i] != arr2[i]) {
                equals = false;
                 break;
            }
        }

        if(equals) {
            System.out.println("Os dois arrays são iguais.");
        } else {
            System.out.println("Os dois arrays são diferentes.");
        }
    }

    public static void ex08() {
        
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o numero para a posição %d do array A: ", i);
            A[i] = input.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.printf("Digite o numero para a posição %d do array B: ", i);
            B[i] = input.nextInt();
        }

        for (int i = 0; i < C.length; i++) {

            if(i < 5) {
                C[i] = A[i];
            } else {
                C[i] = B[i - 5];
            }
            
        }
        System.out.print("A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%d ", A[i]);
        }
        
        System.out.print("\nB: ");
        for (int i = 0; i < B.length; i++) {
            System.out.printf("%d ", B[i]);
        }

        System.out.print("\nC: ");
        for (int i = 0; i < C.length; i++) {
            System.out.printf("%d ", C[i]);
        }
        
    }

    public static void ex09() {
        
    }

}