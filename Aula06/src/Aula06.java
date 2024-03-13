public class Aula06 {

    public static void main(String[] args) {
        
        exMetodosObjetos();

    }

    public static void exConstrutores() {

        Pessoa p1 = new Pessoa("Fulano", 22);
        System.out.println("Pessoa p1");
        System.out.println(p1.nome);
        System.out.println(p1.idade);

        Pessoa p2 = new Pessoa();
        p2.nome = "Beltrano";
        p2.idade = 23;
        System.out.println("\nPessoa p2");
        System.out.println("\n" + p2.nome);
        System.out.println(p2.idade);

        Pessoa p3 = new Pessoa("Cicrano");
        System.out.println("\nPessoa p3");
        System.out.println(p3.nome);
        System.out.println(p3.idade);

        Pessoa p4 = new Pessoa(32);
        System.out.println("\nPessoa p4");
        System.out.println(p4.nome);
        System.out.println(p4.idade);

    }

    public static void exGettersSetters() {

        Convidado c1 = new Convidado();
        c1.setNome("Fulano");
        c1.setEmail("fulano@gmail.com");

        System.out.println("Dados de c1");
        System.out.println(c1.getNome());
        System.out.println(c1.getEmail());

        Convidado c2 = new Convidado("Beltrano", "beltrano@gmail.com");
        System.out.println("Dados de c2");
        System.out.println(c2.getNome());
        System.out.println(c2.getEmail());

        c2.setNome("Cicrano");
        System.out.println("\nNome alterado de c2: " + c2.getNome());

        Convidado c3 = new Convidado();
        System.out.println("\nCadastro do convidado c3");
        System.out.print("Informe o nome: ");
        c3.setNome(Console.lerString());
        System.out.print("Informe o email: ");
        c3.setEmail(Console.lerString());

        System.out.println("Dados de c3");
        System.out.println(c3.getNome());
        System.out.println(c3.getEmail());

    }

    public static void exMetodosObjetos() {
    
    String nome;
    float horasTrab;
    float valorHora;

    Funcionario f1 = new Funcionario();
    System.out.println("\nCadastro do funcionario 1:");  
    System.out.print("Nome: ");
    nome = Console.lerString();
    System.out.print("Horas trabalhadas: ");
    horasTrab = Console.lerFloat();
    System.out.print("Valor hora: ");
    valorHora = Console.lerFloat();
    
    f1.setNome(nome);
    f1.setHorasTrab(horasTrab);
    f1.setValorHora(valorHora);

    f1.calcularSalario();
    f1.exibirFolhaPagamento();

    Funcionario f2 = new Funcionario("João Silva", 160f, 50f);
    f2.exibirFolhaPagamento();


    }

}