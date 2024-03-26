public class Ex09 {
    public static void main(String[] args) {

        exemploArrayList();

    }

    private static void exemploAssociacao() {

        Carro c1 = new Carro("Ford", "Ka", 2017);

        Proprietario p1 = new Proprietario("Fulano da Silva", c1);

        System.out.println("Dados do proprietário: ");
        System.out.println(p1.toString());

        Carro c2 = new Carro("Ford", "Fiesta", 2020);

        System.out.println("Alterando carro...");
        p1.setCarro(c2);

        System.out.println(p1.toString());

        p1.getCarro().setModelo("Eco Sport");

        p1.getCarro().setAno(2023);

        System.out.println("Fabricante do carro: " + p1.getCarro().getFabricante());

        System.out.println(p1.toString());

        System.out.println("Carro c1: " + c1);
        System.out.println("Carro c2: " + c2);
        System.out.println("Carro de p1: " + p1.getCarro());

        Carro c3 = new Carro(c1.getFabricante(), c1.getModelo(), c1.getAno());

        c3.setAno(2024);

        System.out.println("Dados de c1: ");
        System.out.println(c1);

        System.out.println("Dados de c3:");
        System.out.println(c3);
    }

    private static void exemploArrayList(){

        Livro l1 = new Livro("Fundação", "Sci-fi");
        Livro l2 = new Livro("O Senhor dos Anéis", "Fantasia");
        Livro l3 = new Livro("Anjos e Demônios", "Romance");

        Autor a1 = new Autor("Tolkien");
        a1.adicionarLivro(l1);
        a1.adicionarLivro(l2);

        Autor a2 = new Autor("Beltrano Souza");
        a2.adicionarLivro(l3);

        Autor a3 = new Autor("Cicrano Oliveira");

        System.out.println("Dados do Autor 1:\n" + a1);
        System.out.println("Dados do Autor 2:\n" + a2);
        System.out.println("Dados do Autor 3:\n" + a3);

        a1.removerLivro(l1);
        System.out.println("Dados do Autor 1:\n" + a1);
    }
}