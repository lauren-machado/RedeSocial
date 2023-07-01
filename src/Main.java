import redesocial.*;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Facebook facebook = new Facebook("senhaFace", 10);
        Twitter twitter = new Twitter("senhaTwitter", 40);
        List<RedeSocial> redeSocials = new ArrayList<>();
        redeSocials.add(facebook);
        redeSocials.add(twitter);

        Usuario usuario = new Usuario("Lauren", "lauren@gmail.com", redeSocials);

        usuario.getRedes().forEach(redeSocial -> {
            if (redeSocial.getClass().equals(Facebook.class)) {
                redeSocial.postarVideo();
                facebook.compartilhar();
                facebook.fazStreaming();
            } else {
                redeSocial.postarComentario();
                redeSocial.postarFoto();
                redeSocial.curtirPublicacao();
            }
        });
    }
}