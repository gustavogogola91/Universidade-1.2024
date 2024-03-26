import java.util.ArrayList;
import java.util.List;

public class Colecao {

    private String proprietario;
    private List<Jogo> listaJogos;

    public Colecao(String proprietario) {
        this.proprietario = proprietario;
        listaJogos = new ArrayList<Jogo>();
    }

    public void cadastrarJogo(Jogo jogo) {
        listaJogos.add(jogo);
    }

    public String buscarJogo(String titulo) {

        String jogos = "";
        boolean encontrou = false;

        for (Jogo temp : listaJogos) {

            if (temp.getTitulo().equals(titulo)) {
                jogos += temp.toString();
                encontrou = true;
            }
        }
        if (encontrou) {
            return jogos;
        }
        return "Jogo " + titulo + " não encontrado.";
    }

    public void listarJogos() {
        if (listaJogos.size() == 0) {
            System.out.println("Não há jogos na sua coleção.");
            return;
        }

        System.out.println("JOGOS CADASTRADOS");

        for (Jogo temp : listaJogos) {
            System.out.println(temp);
        }
    }

}
