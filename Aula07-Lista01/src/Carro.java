public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Carro(String marca, String modelo, int ano, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void acelerar(float vel) {
        System.out.printf("Carro %s acelerou %.0f Km/h", getModelo(), vel);
        velocidade += vel;
    }
    public void frear(float vel) {
        System.out.printf("Carro %s freou %.0f Km/h", getModelo(), vel);
        if(vel > velocidade) {
            velocidade = 0;
        } else {
        velocidade -= vel;
        }
    }

    public void exibir() {
        System.out.printf("%nMarca: %s%nModelo: %s%nAno: %d%nVelocidade: %.1f Km/h%n", getMarca(), getModelo(), getAno(), getVelocidade());
    }

}
