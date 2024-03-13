public class Funcionario {
    // Atributos
    private String nome;
    private float horasTrab;
    private float valorHora;
    private float salario;
    // Getters
    public String getNome() {
        return nome;
    }
    public float getHorasTrab() {
        return horasTrab;
    }
    public float getValorHora() {
        return valorHora;
    }
    public float getSalario() {
        return salario;
    }
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    // Construtores
    public Funcionario() {}
    public Funcionario(String nome, float horasTrab, float valorHora) {
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
        calcularSalario();
    }

    //Metodos proprios
    public void calcularSalario() {
        salario = horasTrab * valorHora;
    }
    public void exibirFolhaPagamento() {

        System.out.printf("Funcionario: %s%n", nome);
        System.out.printf("Horas trabalhadas: %.1f%n", horasTrab);
        System.out.printf("Valor hora: R$ %.2f%n", valorHora);
        System.out.printf("Salario: R$ %.2f%n", salario);
    }
}
