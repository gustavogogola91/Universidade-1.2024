import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        
        // Criar leitor para entrada de dados:
        Scanner input = new Scanner(System.in);
        //Variavel "nome" do tipo String:
        String nome;
        //Varaiavel "txt" do tipo String com valor atribuido:
        String txt = "Aula 01";
        // Saída de dados: mostra o valor de txt
        System.out.println(txt);
        // Saída de dados: solicitação de entrada:
        System.out.print("Informe o nome do aluno: ");
        //Entrada de dados
        nome = input.next();
        // Mostra o valor da variavel nome
        System.out.printf("Aluno cadastrado: %s", nome);

    }

}
