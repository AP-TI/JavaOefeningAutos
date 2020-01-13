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
public class Gezinswagen extends Auto {
    private int zitplaatsen;
    private boolean trekhaak;
    public Gezinswagen(Type type, Merk merk, String chassisnummer, String nummerplaat, double kilometerstand, int zitplaatsen, boolean trekhaak, double kilometerFactor) {
        super(type, merk, chassisnummer, nummerplaat, kilometerstand, kilometerFactor);
        this.zitplaatsen = zitplaatsen;
        this.trekhaak = trekhaak;
    }

    public int getZitplaatsen() {
        return zitplaatsen;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nZitplaatsen: " + zitplaatsen + "\nTrekhaak: " + (trekhaak ? "Ja" : "Nee");
    }
}
