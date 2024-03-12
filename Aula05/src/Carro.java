public class Carro {

    String modelo;
    int ano;
    String cor;

    // COnstrutor sem parametros
    public Carro() {
        modelo = "Ford Fiesta";
        ano = 2020;
        cor = "Vermelha";
    }

    // Construtor sem parametros
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    @Override
    public String toString() {
        String txt = "Carro: " + modelo + "\nAno: " + ano + "\nCor: " + cor;

        return txt;
    }

    public void ligar() {
        System.out.printf("O carro %s está ligado%n", modelo);
    }

    public void desligar() {
        System.out.printf("O carro %s está desligado%n", modelo);
    }

}
