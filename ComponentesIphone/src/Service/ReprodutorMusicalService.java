package Service;

import Interface.ReprodutorMusical;
import Musica.Musica;
import Repository.MusicaRepository;

public class ReprodutorMusicalService implements ReprodutorMusical{

    private boolean tocando;
    private Integer numeroMusica;
    private MusicaRepository musicaRepository = new MusicaRepository();

    public ReprodutorMusicalService() {
        tocando = false;
        numeroMusica = 0;
    }

    @Override
    public void tocar() {
        if (tocando == true) {
            System.out.println("Playlist já está tocando!");
            musicaTocadaMomento();
        }
        else {
            tocando = true;
            System.out.println("Playlist tocando!\n");
            musicaTocadaMomento();
        }
    }

    @Override
    public void pausar() {
        if (tocando == false) {
            System.out.println("Playlist já está pausada!\n");
        }
        else {    
            tocando = false;
            System.out.println("Playlist pausada!\n");
        }
    }    

    @Override
    public void proximo() {
        if(tocando == false){
            tocar();
        } else if ((musicaRepository.numeroMusicas() - 1) == numeroMusica) {
            numeroMusica = 0;
            musicaTocadaMomento();
        } else {
            numeroMusica++;
            musicaTocadaMomento();
        }
    }

    @Override
    public void anterior() {
        if(tocando == false){
            tocar();
        } else if (numeroMusica == 0) {
            numeroMusica = musicaRepository.numeroMusicas() - 1;
            musicaTocadaMomento();
        } else {
            numeroMusica--;
            musicaTocadaMomento();
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        Musica m = musicaRepository.encontrarMusica(musica);
        if(m == null) {
            System.out.println("Não encontrada!");
        } else {
            numeroMusica = m.getId();
            tocar();
        }
    }

    public void musicaTocadaMomento() {
        System.out.println("Musica tocada no momento:");
        System.out.println(musicaRepository.qualMusica(numeroMusica));
    }
    
}
