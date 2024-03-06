public class Aluno {
   
    String nome;
    String curso;
    String campus;

    @Override
    public String toString() {
        String txt = "Aluno: " + nome + "\nCurso: " + curso + "\nCampus: " + campus + "\n";
        return txt;
    }
}
