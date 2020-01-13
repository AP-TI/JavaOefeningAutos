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
public class SorteerByZitplaatsen implements Comparator<Auto>{

    @Override
    public int compare(Auto t, Auto t1) {
        if(t instanceof Gezinswagen && t1 instanceof Gezinswagen){
            Gezinswagen gw = (Gezinswagen)t;
            Gezinswagen gw1 = (Gezinswagen)t1;
            return Integer.compare(gw.getZitplaatsen(), gw1.getZitplaatsen());
        }
        return t.compareTo(t1);
    }
    
}
