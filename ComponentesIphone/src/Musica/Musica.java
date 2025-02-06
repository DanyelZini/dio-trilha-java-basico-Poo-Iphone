package Musica;

public class Musica {
    
    private Integer id;
    private String nome;
    private GeneroMusical genero;

    public Musica(Integer id, String nome, GeneroMusical genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public String toString() {
        return "ID: " + id + "\nMusíca: " + nome + "\nGenero: " + genero + "\n";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }
}
