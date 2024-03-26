public class App {
    public static void main(String[] args) throws Exception {

        int op;
        Jogo jogoTemp;
        String titulo;
        String genero;
        String estudio;
        int ano;
        String nomeProprietario;

        System.out.println("\nCOLEÇÃO DE JOGOS");
        System.out.print("Informe o nome do propietario da coleção: ");
        nomeProprietario = Console.lerString();
        Colecao minhaColecao = new Colecao(nomeProprietario);

        do {
            System.out.println("Coleção de jogos de " + nomeProprietario);
            System.out.println("1) Cadastrar jogo");
            System.out.println("2) Buscar jogo");
            System.out.println("3) Mostrar jogos");
            System.out.println("0) Finalizar programa");

            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    System.out.println("\nCadastro de jogo");
                    System.out.print("Qual é o título: ");
                    titulo = Console.lerString();

                    System.out.print("Qual é o gênero: ");
                    genero = Console.lerString();

                    System.out.print("Qual é o estúdio: ");
                    estudio = Console.lerString();

                    System.out.print("Qual é o ano de lançamento: ");
                    ano = Console.lerInt();

                    jogoTemp = new Jogo(titulo, genero, estudio, ano);

                    minhaColecao.cadastrarJogo(jogoTemp);

                    System.out.println("\nJogo cadastrado com sucesso!");
                    break;
                case 2:

                    System.out.println("\nBuscar jogo");
                    System.out.print("Qual título deseja buscar: ");
                    String busca = Console.lerString();

                    System.out.println(minhaColecao.buscarJogo(busca));

                    break;
                case 3:
                    minhaColecao.listarJogos();
                    break;
                case 0:
                    System.out.println("Programa foi finalizado");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente\n\n");
                    break;
            }
            System.out.println();
        } while (op != 0);
    }
}
