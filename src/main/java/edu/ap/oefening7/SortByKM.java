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
public class SortByKM implements Comparator<Auto>{

    @Override
    public int compare(Auto t, Auto t1) {
        return Double.compare(t.getKilometerstand(), t1.getKilometerstand());
    }
    
}
