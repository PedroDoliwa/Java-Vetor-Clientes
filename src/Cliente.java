import java.sql.ClientInfoStatus;

public class Cliente {

    private String nome;
    private int numero;
    private String email;

    public Cliente(String nome, int numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                ", numero: " + numero +
                ", email: " + email;
    }
}
