package Repository;

import Musica.GeneroMusical;

import java.util.ArrayList;
import java.util.List;

import Musica.Musica;

public class MusicaRepository {
    private List<Musica> musicas = new ArrayList<>();

    public MusicaRepository() {
        musicas.add(new Musica(0, "Imagine", GeneroMusical.ROCK));
        musicas.add(new Musica(1, "Perfect", GeneroMusical.POP));
        musicas.add(new Musica(2, "FEIN", GeneroMusical.HIPHOP));
    }

    public Musica qualMusica(Integer n) {
        return musicas.get(n);
    }

    public Integer numeroMusicas() {
        return musicas.size();
    }

    public Musica encontrarMusica(String musica) {
        for(Musica m : musicas) {
            if (m.getNome() == musica) {
                return m;
            }
        }
        return null;
    }

}
