/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoohandlung;

/**
 *
 * @author l.eggers
 */
public class Schmetterling extends Tier implements Laufen, Fliegen{
    int anzahlBeine;

    @Override
    public void laufe() {
        System.out.println("Ich laufe.");
    }
    @Override
    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }
    
    @Override
    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    @Override
    public void fliegLos() {
       System.out.println("Ich fliege los.");
    }

    @Override
    public void lande() {
        System.out.println("Ich lande.");
    }
}



   
    
 
