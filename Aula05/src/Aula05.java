public class Aula05 {

    public static void main(String[] args) {
        exemploCarro();
    }

    public static void exemploPessoa() {
        // Instanciando objeto do tipo Pessoa

        Pessoa p1 = new Pessoa();
        p1.nome = "Gustavo";
        p1.idade = 18;

        System.out.println("Aula05");
        System.out.println("Dados da pessoa p1");
        System.out.printf("Nome: %s%nIdade: %d%n", p1.nome, p1.idade);

        // Instanciando objeto p2
        Pessoa p2 = new Pessoa();
        System.out.print("Informe os dados de p2\nNome: ");
        p2.nome = Console.lerString();
        System.out.print("Idade: ");
        p2.idade = Console.lerInt();

        System.out.println("Dados da pessoa p2");
        System.out.printf("Nome: %s%nIdade: %n", p2.nome, p2.idade);

        Pessoa p3 = new Pessoa();
        p3 = p2; // p3 aponta para mesmo local de p2, na pratica são o mesmo objeto;

        p3.idade = 25;

        System.out.println(p2.toString());

        // jeito certo de se copiar um objeto
        Pessoa p4 = new Pessoa();
        p4.nome = p1.nome;
        p4.idade = p1.idade;

        System.out.println("Dados de p4:");
        System.out.println(p4.toString());

        p4.nome = "Beltrano";
        System.out.println("Nome de p1: " + p1.nome);
        System.out.println("Nome de p4: " + p4.nome);

    }

    public static void exemploCarro() {

        Carro c1 = new Carro();

        System.out.println("Cadastro do c1: ");
        System.out.print("Modelo: ");
        c1.modelo = Console.lerString();
        System.out.print("Ano: ");
        c1.ano = Console.lerInt();
        System.out.print("Cor: ");
        c1.cor = Console.lerString();

        System.out.println("Dados do c1");
        System.out.println(c1.toString());

        Carro c2 = new Carro();
        System.out.println("Dados do c2: ");
        System.out.println(c2.toString());

        System.out.println();

        c1.ligar();
        c2.ligar();

        System.out.println();

        c1.desligar();
        c2.desligar();

        Carro c3 = new Carro("Sandero", 2019, "Cinza");
        System.out.println("\nDados do c3:");
        System.out.println(c3.toString());

        c3.modelo = "Nissan Versa";
        System.out.println("Modelo de c3 alterado: " + c3.modelo);

        System.out.println("\nCadastro c4");
        String modelo = Console.lerString();
        int ano = Console.lerInt();
        String cor = Console.lerString();

        Carro c4 = new Carro(modelo, ano, cor);

        System.out.println("\nDados do c4");
        System.out.println(c4.toString());
    }

}