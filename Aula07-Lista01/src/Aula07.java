import java.util.Scanner;

public class Aula07 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ex05();
    }

    public static void ex01() {

        int op;
        int num1;
        int num2;

        while(true){
            System.out.println("\nCalculadora");
            System.out.println("Qual operação quer realizar:\n1) Soma\n2) Subtração\n3) Multiplicação\n4) Divisão\n5) Sair");
            System.out.print(">>");
            op = input.nextInt();

            System.out.print("Digite o 1º numero: ");
            num1 = input.nextFloat();

            System.out.print("Digite o 2º numero: ");
            num2 = input.nextFloat();

            switch (op) {
                case 1:
                    System.out.printf("Soma de %f + %f = %f", num1, num2, Calculadora.somar(num1, num2));
                    break;
                case 2:
                    System.out.printf("Subtração de %f + %f = %f", num1, num2, Calculadora.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.printf("Multiplicação de %f + %f = %.0f", num1, num2, Calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.printf("Divisão de %f + %f = %.2f", num1, num2, Calculadora.dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
            }
        }
    }

    public static void ex02() {

        Livro l1 = new Livro("Vagabond", "Takehiko Inoue", 1999);

        l1.exibirInfo();

        Livro l2 = new Livro("Nanatsu no taizai", "Nakaba Suzuki", 2012);

        l2.exibirInfo();
    }

    public static void ex03() {

        ContaBancaria c1 = new ContaBancaria("023651", "Ciclano");
        c1.mostrarSaldo();
        c1.depositar(200);
        c1.mostrarSaldo();
        c1.sacar(300);

        ContaBancaria c2 = new ContaBancaria("125983", "Beltrano", 1000.2f);
        c2.mostrarSaldo();
        c2.sacar(500);
        c2.depositar(200);
        c2.mostrarSaldo();
    }

    public static void ex04() {

        Jogador j1 = new Jogador("Aidden", 10, 500);
        j1.levelUp(5);
        j1.mostrarInfo();
        j1.aumentarPontuacao(505);
        j1.mostrarInfo();
    }

    public static void ex05() {
        Carro c1 = new Carro("Ford", "Fiesta", 2009);
        c1.exibir();
        c1.acelerar(500);
        c1.exibir();
        c1.frear(350);
        c1.exibir();

        Carro c2 = new Carro("Renault", "Sandero", 2019, 50.5f);
        c2.exibir();
        c2.frear(100);
        c2.exibir();
        c2.acelerar(100);
        c2.exibir();
    }
}
