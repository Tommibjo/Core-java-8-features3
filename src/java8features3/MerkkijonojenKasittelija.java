/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author tommib
 */
public interface MerkkijonojenKasittelija {
    
    static String yhdistaStringit(String eka, String toka){
        return eka + " " + toka + " :)";
    }
    
    static ArrayList erotaStringit(String lause){
        String[] sanat = lause.split(" ");
        return Arrays.stream(sanat).collect(Collectors.toCollection(ArrayList::new));
    }
}
