/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.oefening7;

/**
 *
 * @author maxim
 */
public class Sportwagen extends Auto {
    private double pk;
    public Sportwagen(Type type, Merk merk, String chassisnummer, String nummerplaat, double kilometerstand, double kilometerFactor, double pk) {
        super(type, merk, chassisnummer, nummerplaat, kilometerstand, kilometerFactor);
        this.pk = pk;
    }

    public double getPk() {
        return pk;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nPK: " + pk;
    }
}
