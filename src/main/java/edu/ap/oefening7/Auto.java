/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.oefening7;

import java.util.Objects;

/**
 *
 * @author maxim
 */
public abstract class Auto implements Comparable<Auto>{
    private static int teller = 0;
    private int volgnummer;
    private double kilometerFactor;

    public double getKilometerstand() {
        return kilometerstand;
    }
    private Type type;
    private Merk merk;
    private String chassisnummer;
    private String nummerplaat;
    private double kilometerstand;

    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    public void setKilometerstand(double kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
    
    public Auto(Type type, Merk merk, String chassisnummer, String nummerplaat, double kilometerstand, double kilometerFactor){
        volgnummer = ++teller;
        this.type = type;
        this.merk = merk;
        this.chassisnummer = chassisnummer;
        this.nummerplaat = nummerplaat;
        this.kilometerstand = kilometerstand;
        this.kilometerFactor = kilometerFactor;
    }
    
    @Override
    public String toString(){
        return "Volgnummer: " + volgnummer + "\nType: " + type + "\nVerbruik: " + kilometerFactor + "/100km" + "\nMerk: " + merk + "\nChassisnummer: " + chassisnummer + "\nNummerplaat: " + nummerplaat + "\nKilometerstand: " + kilometerstand;
    }

    @Override
    public int compareTo(Auto t) {
        return t.getClass().toString().compareTo(this.getClass().toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if (!Objects.equals(this.chassisnummer, other.chassisnummer)) {
            return false;
        }
        return true;
    }
}