package redesocial;

public class Instagram extends RedeSocial{
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Instagram.");
    }

    @Override
    public void postarVideo() {
        System.out.println("Vídeo postada no Instagram.");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentário postada no Instagram.");
    }
}
