package redesocial;

import redesocial.interfaces.Compartilhamento;
import redesocial.interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Facebook.");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postada no Facebook.");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postada no Facebook.");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhado no Facebook.");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no Facebook.");
    }
}
