/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.oefening7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author maxim
 */
public class Garage {
    private ArrayList<Auto> autolijst;
    
    public Garage(){
        autolijst = new ArrayList<Auto>();
    }
    
    public void addAuto(Auto auto){
        autolijst.add(auto);
    }
    
    public boolean removeAuto(Auto auto){
        return autolijst.remove(auto);
    }
    
    public String autolijstSportwagenToString(){
        StringBuffer result = new StringBuffer();
        for(Auto auto: autolijst){
            if(auto instanceof Sportwagen)
            result.append("\n\n\n" + auto);
        }
        return result.toString();
    }
    public String autolijstGezinswagenToString(){
        StringBuffer result = new StringBuffer();
        for(Auto auto: autolijst){
            if(auto instanceof Gezinswagen)
            result.append("\n\n\n" + auto);
        }
        return result.toString();
    }
    
    /**
     * Sorteren van de lijst van auto's
     */
    public void sort(){
        Collections.sort(autolijst);
    }
    
    /**
     * Sorteren van de lijst van auto's a.d.h.v. een meegegeven comparator
     * @param comparator Comparator
     */
    public void sort(Comparator comparator){
        Collections.sort(autolijst, comparator);
    }
    
    @Override
    public String toString(){
        return "Auto's in deze garage: " + autolijstGezinswagenToString() + autolijstSportwagenToString();
    }
}
