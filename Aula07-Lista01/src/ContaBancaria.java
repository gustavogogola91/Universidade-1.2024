public class ContaBancaria {

    private String numConta;
    private String nomeTitular;
    private float saldo;

    public ContaBancaria(String numConta, String nomeTitular, float saldo) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public ContaBancaria(String numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }


    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.printf("Depositando R$ %.2f, saldo total R$ %.2f %n", valor, getSaldo());

    }
    public void sacar(float valor) {
        if(valor < saldo) {
            saldo -= valor;
            System.out.printf("Sacando R$ %.2f, saldo total R$ %.2f %n", valor, getSaldo());

        } else {
            System.out.println("Conta não possui saldo suficiente para retirada.");
        }
    }
    public void mostrarSaldo() {
        System.out.printf("Conta %s%n", getNumConta());
        System.out.printf("Saldo disponivel: R$ %.2f%n", getSaldo());
    }

}
