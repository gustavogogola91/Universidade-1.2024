public class Pessoa {

    String nome;
    int idade;

    @Override
    public String toString() {

        String txt = "Nome: " + nome + "\nIdade: " + idade;
        return txt;
    }

}
