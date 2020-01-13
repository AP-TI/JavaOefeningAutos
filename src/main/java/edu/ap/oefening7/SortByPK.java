/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.oefening7;

import java.util.Comparator;

/**
 *
 * @author maxim
 */
public class SortByPK implements Comparator<Auto>{

    @Override
    public int compare(Auto t, Auto t1) {
        if(t instanceof Sportwagen && t1 instanceof Sportwagen){
            Sportwagen sw = (Sportwagen)t;
            Sportwagen sw1 = (Sportwagen)t1;
            return Double.compare(sw.getPk(), sw1.getPk());
        }
        return t.compareTo(t1);
    }
    
}
