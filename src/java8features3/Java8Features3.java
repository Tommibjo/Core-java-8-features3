/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features3;

import java.util.ArrayList;


/**
 *
 * @author tommib
 */
public class Java8Features3 {

    /**
     * @param args the command line arguments
     * 
     * Java 8 ominaisuuksien läpikäyntia.
     * 
     * Tässä kkäydään läpi:
     * - Rajapintojen static, default & metodeja
     * - Functionaalista rajapintaa & lambda lausekkeen käyttöä.
     * - Virran (Stream()) käyttöä.
     */
    public static void main(String[] args) {
       
        
        // Laskin rajapinnan toteuttava Anonymous class. (Default metodi "jaaLuvut" on Java 8 -tavaraa.)
        // Default metodit käy hyvin legaci softien rajapintojen päivittämiseen. Rajapinnan valmiiksi toteuttavat luokat eivät kärsi, sillä Default metodeja ei ole pakko overridaa.
        Laskin laskin = new Laskin() {
            @Override
            public int plussaa(int eka, int toka) {
                return eka + toka + 2;
            }
        };
        System.out.println(laskin.plussaa(3, 3));
        System.out.println(laskin.miinusta(3, 3));
        System.out.println(laskin.jaaLuvut(3, 2));
        
        
        
        // MerkkijonojenKasittelija rajapinta (Java 8 rajapintaa)
        String tekstiRivi = MerkkijonojenKasittelija.yhdistaStringit("Moi", "Tommi");
        System.out.println(tekstiRivi);
        ArrayList<String> lista = MerkkijonojenKasittelija.erotaStringit(tekstiRivi);
        lista.stream().forEach(s -> System.out.println(s));
     
     
     
        // Alustetaan Functionaalinen rajapinta lambda lausekkeella. (Java 8 -tavaraa).
        // Funktionaalisilla lauseilla on vain yksi metodi, joten lambda lauseke käy metodin alustamiseen hyvin.
        NumeroArviointi suurempiKuin = (s) -> (s > 10);
        NumeroArviointi pienempiKuin = (s) -> (s < 10);
        System.out.println(suurempiKuin.numeroTesti(20));
        System.out.println(pienempiKuin.numeroTesti(12));
    }

}
