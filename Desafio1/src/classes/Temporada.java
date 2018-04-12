package classes;

import anotacoes.*;

/**
 *
 * @author nathipg e laionel lellis
 */
@TagSecundaria
public class Temporada {

    @Atributo
    private int id;
    @Tag
    private String arco;
    @Tag
    private int numeroEpisodios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

}
