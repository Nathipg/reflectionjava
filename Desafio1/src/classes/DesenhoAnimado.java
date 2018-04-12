package classes;

import anotacoes.*;
import java.util.ArrayList;

/**
 *
 * @author nathipg e laionel lellis
 */

@Raiz
public class DesenhoAnimado {
    //@Attribute
    private int id;
    //@Element
    private String nome;
    //@Element
    private String sinopse;
    //@ElementList
    private ArrayList<Temporada> temporada;

    public DesenhoAnimado() {
        this.temporada = new ArrayList<>();
    }

    //Getters 'n' Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public ArrayList<Temporada> getTemporada() {
        return temporada;
    }

    public void addTemporada(Temporada temporada) {
        this.temporada.add( temporada );
    }

}
