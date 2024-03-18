public class Jogador {

    private String nome;
    private int nivel;
    private int pontuacao;

    public Jogador(String nome, int nivel, int pontuacao) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void levelUp(int valor) {
        System.out.printf("Personagem %s subiu %d nível(is)%n", getNome(), valor);
        nivel += valor;
    }

    public void aumentarPontuacao(int valor) {
        System.out.printf("Personagem %s recebeu %d pontos%n", getNome(), valor);
        pontuacao += valor;
    }

    public void mostrarInfo() {
        System.out.printf("%nNome: %s%nNivel: %d%nPontuação: %d%n", getNome(), getNivel(), getPontuacao());
    }

}
