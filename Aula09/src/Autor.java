import java.util.ArrayList;
import java.util.List;

public class Autor {

    private String nome;
    private List<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro  livro) {
        livros.add(livro);
        System.out.println("\nLivro adicionado para o autor: " + nome + livro + "\n");
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
        System.out.println("Livro removido da lista de " + nome + ":\n" + livro);
    }

    @Override
    public String toString() {

        String txt = "Autor: " + nome + "\nLivros:";

        for (Livro temp: livros) {
            txt += temp + "\n";
        }

        return txt;
    }
}
