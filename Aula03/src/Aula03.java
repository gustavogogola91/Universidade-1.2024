import java.util.Scanner;

public class Aula03 {
    
    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int op;
        do {
            System.out.println("Aula 03 - Menu\n1) Exemplo For\n2) Exemplo While\n3) Exemplo Do/While\n4) Exemplo Vetor\n0) Sair");
            System.out.print("Informe uma opção: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    exemploFor();
                    break;
                case 2:
                    exemploWhile();
                    break;
                case 3:
                    exemploDoWhile();
                    break;     
                case 4:
                    exemploVetor();
                    break;   
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção invalida, digite novamente!");
                    break;
            }
            
            System.out.println();

        } while(op != 0);

        

    }

    public static void exemploFor() {

        /*
         * Ler um valor inteiro e mostrar na tela 
         * a tabuada deste valor, do x1 ao x10 
        */

        System.out.println("\nExemplo for:\n");
        System.out.print("Informe um valor inteiro: ");
        int valor = leitor.nextInt();

        System.out.printf("Tabuada do %d%n", valor);
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", valor, i, valor * i);
        }

    }

    public static void exemploWhile() {

        /*Ler um valor inteir e mostrar todos os valores 
         * entre o numero digitado e cem
         */
        System.out.println("Exemplo While: ");
        System.out.print("Informe um valor inteiro: ");
        int valor = leitor.nextInt();

        if(valor > 100) {
            System.out.println("Valor informado é maior que 100");
        }

        while(valor <= 100) {
            System.out.printf("Valor atual: %d%n", valor);
            valor++;
            
        }

    }

    public static void exemploDoWhile() {

        /*
         * Solicitar a entrada de um valor inteiro que esteja entre 100 e 200.
         * Mostrar todos os valores dentro deste intervalo. Se for informado um
         * valor fora do intervalo, pedir para o usuario digitar novamente e não prosseguir enquanto
         * essa condição não for atendida.
         */

        System.out.println("Exemplo DoWhile: ");
        int valor;

        do {
            System.out.print("Informe um valor inteiro entre 100 e 200: ");
            valor = leitor.nextInt();
        } while(valor < 100 || valor > 200);

        while (valor <= 200) {
            System.out.printf("Valor atual: %d%n", valor);
            valor++;            
        }
         

    }

    public static void exemploVetor() {

        /*
         * Ler 5 valores do teclado e armazenar esses valores
         * em um vetor de inteiros. Em seguida, armazenar em um
         * segundo vetor, o dobro dos valores do primeiro.
         * Mostrar os dois vetores na tela.
         */

        int[] arr = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Exemplo leitor:");

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            arr[i] = leitor.nextInt();
            arr2[i] = arr[i] * 2;
        }

        System.out.println("Vetor 1");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Número %dº: %d%n", i, arr[i]);            
        }
        
        System.out.println("Vetor 2");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Número %dº: %d%n", i, arr2[i]);            
        }
 
    };

}
