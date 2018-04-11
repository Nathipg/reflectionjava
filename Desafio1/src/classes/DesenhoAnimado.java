package classes;

import anotacoes.*;
import java.util.ArrayList;
import org.simpleframework.xml.*;

/**
 *
 * @author nathipg e laionel lellis
 */

@Raiz
@Root
public class DesenhoAnimado {
    @Attribute
    private int id;
    @Element
    private String nome;
    @Element
    private String sinopse;
    @ElementList
    private ArrayList<Temporada> temporada;

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

    public void setTemporada(ArrayList<Temporada> temporada) {
        this.temporada = temporada;
    }

}
