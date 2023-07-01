package redesocial;

import redesocial.interfaces.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Twitter.");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postada no Twitter.");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postada no Twitter.");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhado no Twitter.");
    }

    public void curtirPublicacao (){
        System.out.println("Publicacao curtida no Twitter.");
    }
}
