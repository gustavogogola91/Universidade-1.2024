public class Convidado {
    
    private String nome;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    
    public Convidado() {}

    public Convidado(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
