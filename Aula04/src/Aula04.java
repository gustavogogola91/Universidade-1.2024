public class Aula04 {
    
    public static void main(String[] args) {

        exVetorObjeto();
        
    }

    public static void ex00() {

        /*
        * ex00
        * Ler um valor inteiro entre 2 e 10.
        * Criar um vetor deste tamanho e ler todos os valores
        * deste vertor. Apresentar o vetor na tela.
        */

        int size;

        System.out.println("Ex00");
        do {
            System.out.print("Informe um valor entre 2 e 10: ");
            size = Console.lerInt();
        } while(size < 2 || size > 10);

        int[] arr = new int[size];

        System.out.println("Iniciando leitura do vetor:");
        for(int i = 0; i < size; i++) {
            System.out.printf("%nDigite o %dº valor: ", i + 1);
            arr[i] = Console.lerInt();
        }
        
        System.out.println("Valor Gerado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void exMatriz() {
        
        System.out.println("\nExMatriz");

        int[][] m1 = new int[3][3];
         

        for(int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.printf("Insira o valor [%d, %d]: ", i, j);
                m1[i][j] = Console.lerInt();
            }
        }

        System.out.println("Matriz gerada:");

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.printf("%d\t",m1[i][j]);
            }
            System.out.println();
        }

    }

    public static void exObjetoAluno() {

        Aluno aluno1 = new Aluno();

        System.out.println("CADASTRO DE ALUNO");
        System.out.print("Nome: ");
        aluno1.nome = Console.lerString();

        System.out.print("Curso: ");
        aluno1.curso = Console.lerString();

        System.out.print("Campus: ");
        aluno1.campus = Console.lerString();

        System.out.printf("%nAluno cadastrado%nAluno: %s%nCurso: %s%nCampus: %s%n%n", aluno1.nome, aluno1.curso, aluno1.campus);

        System.out.println(aluno1.toString());


    }

    public static void exVetorObjeto() {
        
        System.out.println("\nExemplo de vetor de objeto");

        Aluno[] vetorAlunos = new Aluno[3];

        System.out.println("\nCadastro aluno");
        for(int i = 0; i < vetorAlunos.length; i++) {
            vetorAlunos[i] = new Aluno();

            System.out.printf("Aluno %d%n", i + 1);
            System.out.print("Nome: ");
            vetorAlunos[i].nome = Console.lerString();
            System.out.print("Curso: ");
            vetorAlunos[i].curso = Console.lerString();
            System.out.print("Campus: ");
            vetorAlunos[i].campus = Console.lerString();
        }

        System.out.println("Mostrar alunos cadastrados");
        for(int i = 0; i < vetorAlunos.length; i++) {
            System.out.println(vetorAlunos[i].toString() + "\n");
        }
    }

}
