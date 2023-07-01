package usuario;

import redesocial.RedeSocial;

import java.util.List;

public class Usuario {

    private String nome;
    private String email;
    List<RedeSocial> redes;

    public Usuario(String nome, String email, List<RedeSocial> redes) {
        this.nome = nome;
        this.email = email;
        this.redes = redes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RedeSocial> getRedes() {
        return redes;
    }

    public void setRedes(List<RedeSocial> redes) {
        this.redes = redes;
    }
}
