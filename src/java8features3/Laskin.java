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
public class Laskin implements Laskuri {

    public Laskin() {
    }

    @Override
    public int plussaa(int eka, int toka) {
        return eka + toka;
    }

    @Override
    public int miinusta(int eka, int toka) {
        return eka - toka;
    }
}
