package classes;

import org.simpleframework.xml.*;

/**
 *
 * @author nathipg e laionel lellis
 */


@Root
public class DesenhoAnimado {
    @Attribute
    private int id;
    @Element
    private String nome;
    @Element
    private String genero;
    @Element
    private String faixaEtaria;
    @Element
    private int anoLancamento;
    @Element
    private int arcos;
    @Element
    private int totalEpisodios;
    @Element
    private String sinopse;

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getArcos() {
        return arcos;
    }

    public void setArcos(int arcos) {
        this.arcos = arcos;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
}
