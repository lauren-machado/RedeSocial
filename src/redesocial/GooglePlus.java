package redesocial;

import redesocial.interfaces.Compartilhamento;
import redesocial.interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada no GooglePlus.");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postada no GooglePlus.");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postada no GooglePlus.");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhado no GooglePlus.");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo Streaming no GooglePlus.");
    }


}
