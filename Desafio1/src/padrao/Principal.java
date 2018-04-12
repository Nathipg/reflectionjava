package padrao;

import classes.*;
import java.io.File;
import java.util.ArrayList;


/**
 *
 * @author nathipg e laionel lellis
 */

/*LEIA AQUI TUTORIAL TOP http://tutorials.jenkov.com/java-reflection/annotations.html*/
public class Principal {
    public static void main(String[] args) {
        try {
            DesenhoAnimado da = new DesenhoAnimado();
            Temporada tp1 = new Temporada();
            
            tp1.setId(1);
            tp1.setArco("Arco1");
            tp1.setNumeroEpisodios(10);
            
            da.setId(0);
            da.setNome("Gintama");
            da.setSinopse("Sakata Gintoki é um viciado em doces, um preguiçoso ex-samurai e líder do Yorozuya Gin-chan, uma organização que faz qualquer tipo de trabalho por dinheiro. Esta organização ainda possui outros dois integrantes: Shimura Shinpachi, um garoto otaku e correto que almeja ser um samurai, e Kagura, uma garota comilona que faz parte do clã Yato, o mais poderoso do universo. Os três integrantes do Yorozuya entram em grandes confusões e aceitam qualquer trabalho para fazer do mundo um lugar melhor. Gintama faz paródias de vários animes que tiveram seu mangá publicado na revista japonesa Shounen Jump, e também, faz paródias de celebridades, acontecimentos históricos, etc. Também retrata de uma forma cômica e muitas vezes emocionante os acontecimentos do turbulento fim do Tokugawa Bakufu. Além de trazer muitas paródias e comédia, Gintama também traz arcos repletos de ação e emoção.");
            da.addTemporada( tp1 );
            
       } catch (Exception e) {
            e.printStackTrace();
       }
    }
}
