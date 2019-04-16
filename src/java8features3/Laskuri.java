/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features3;

/**
 *
 * @author tommib
 */
public interface Laskuri {
    int plussaa(int eka, int toka);
    int miinusta(int eka, int toka);
    
    /* Jälkikäteen lisätty ominaisuus
       Default metodit ovat hyviä legacy softien rajapintojen päivitykseen.
       Eivät riko rajapintaa valmiiksi toteuttavia luokkia & kuitenkin toimivat jokaisella toteuttavalla luokalla.
    */
    default double jaaLuvut(int eka, int toka){
        return eka/(double)toka;   
    }
}
