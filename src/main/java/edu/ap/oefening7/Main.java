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
public class Main {
    public static void main(String[] args) {
        Auto auto = new Gezinswagen(Type.BENZINE, Merk.BMW, "02820802824082", "1-ABC-123", 1200, 5, false, 6);
        Auto auto2 = new Sportwagen(Type.DIESEL, Merk.MERCEDES, "8223808238230823", "1-XYZ-789", 5821, 12, 500);
        Garage garage = new Garage();
        garage.addAuto(auto2);
        garage.addAuto(auto);
        garage.sort(new SortByKM());
        System.out.println(garage);
    }
}