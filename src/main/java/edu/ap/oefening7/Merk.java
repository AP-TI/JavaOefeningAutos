/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.oefening7;

import java.util.ArrayList;

/**
 *
 * @author maxim
 */

public enum Merk {
    BMW("Bmw"), MERCEDES("Mercedes"), TESLA("Tesla"), CITROEN("Citroën"), PEUGOT("Peugot"), FORD("Ford");
    private String beschrijving;
    
    private Merk(String beschrijving){
        this.beschrijving = beschrijving;
    }
    

    @Override
    public String toString(){
        return beschrijving;
    }
}
