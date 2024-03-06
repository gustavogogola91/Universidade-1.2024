import java.util.Scanner;
public class Exercicios {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

       ex08();
        
    }

    public static void ex01() {
        System.out.println("EXERCICIO 1");
        
        int num;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        System.out.println();

        if (num > 10) {
            System.out.println("Número maior que 10!");
        } else {
            System.out.println("Menor ou igual a 10!");
        }
    }

    public static void ex02() {

        System.out.println("EXERCICIO 2");

        int num1;
        int num2;
        int sum;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.println();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();
        System.out.println();
        
        sum = num1 + num2;

        System.out.printf("%d + %d = %d", num1, num2, sum);

    }

    public static void ex03() {

        System.out.println("EXERCICIO 3");

        int a;
        int b;

        System.out.println("Escolha dois valores distintos.");
        System.out.print("Digite o valor A: ");
        a = input.nextInt();
        System.out.println();
        System.out.print("Digite o valor B: ");
        b = input.nextInt();
        System.out.println();

        if(a > b) {
            System.out.printf("O maior valor é %d%n", a);
        } else if (b > a) {
            System.err.printf("O maior valor é %d%n", b);
        } else {
            System.out.println("Erro, os dois valores não podem ser iguais.");
        }

    }

    public static void ex04() {

        System.out.println("EXERCICIO 4");

        int num1;
        int num2;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Digite outro número: ");
        num2 = input.nextInt();

        System.out.printf("Soma: %d + %d = %d%n",num1, num2, num1 + num2);
        System.out.printf("Subtração: %d - %d = %d%n",num1, num2, num1 - num2);
        System.out.printf("Multiplicação: %d * %d = %d%n",num1, num2, num1 * num2);
        System.out.printf("Divisão: %d / %d = %d%n",num1, num2, num1 / num2);
    }

    public static void ex05() {

        System.out.println("EXERCICIO 5");

        int a;
        int b;
        int aux;

        System.out.print("Digite o valor A: ");
        a = input.nextInt();
        System.out.print("Digite o valor B: ");
        b = input.nextInt();

        System.out.printf("A = %d | B = %d%n", a, b);
        
        aux = a;
        a = b;
        b = aux;
        System.out.printf("A = %d | B = %d%n", a, b);

    }

    public static void ex06() {

        System.out.println("EXERCICIO 6");

        float c;
        float f;

        System.out.println("Informe uma temperatura em Celsius: ");
        c = input.nextFloat();
        f = (9 * c + 160) / 5;

        System.out.printf("%.2f graus celsius equivalem a %.2f graus fahrenheit.", c, f);

    }

    public static void ex07() {
        
        System.out.println("EXERCICIO 7");

        int num;

       do {
            System.out.println("Por favor digite um número: ");
            num = input.nextInt();

            if (num < 100 || num > 200) {
                System.out.println("O valor está fora do intervalo, digite novamente.");
            } else {
                System.out.println("O valor está dentre do intervalo.");
                break;
            }
       } while (true);

        
    }

    public static void ex08() {

        System.out.println("EXERCICIO 8");

        int num;

        System.out.println("Digite um número:");
        num = input.nextInt();

        if (num >= 50) {
            System.out.println("O valor é maior ou igual a 50.");
        } else {
            System.out.println("O valor é menor que 50.");
        }
    }

    public static void ex09() {

        System.out.println("EXERCICIO 9");

        int  a;
        int b;

        System.out.print("Digite o valor A: ");
        a = input.nextInt();
        System.out.print("Digite o valor B: ");
        b = input.nextInt();

        if (a == b) {
            System.out.println("Os valores são iguais.");
        } else {
            System.out.println("Os valores são diferentes.");
            if(a > b) {
                System.out.printf("O maior é %d%n", a);
            }
            if(b > a) {
                System.out.printf("O maior é %d%n", b);
            }
        }

    }

    public static void ex10() {

        int num;

        do {
            System.out.println("Digite um número de 1 a 50:");
            num = input.nextInt();

            if (num > 0 && num < 51) {
                break;
            } else {
                System.out.println("Número inválido, digite novamente.")
            }

        } while (true);

        for (int i = 1; i <= num; i++) {
            System.out.printf("%d%n", i);
        }
    }

    public static void ex11() {
        
    }


}
