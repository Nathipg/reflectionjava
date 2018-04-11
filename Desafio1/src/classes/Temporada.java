/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.simpleframework.xml.*;

/**
 *
 * @author Laionel
 */
@Root
public class Temporada {
    @Attribute
    private int id;
    @Element
    private String arco;
    @Element
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
