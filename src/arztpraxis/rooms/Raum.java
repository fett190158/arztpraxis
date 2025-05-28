/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arztpraxis.rooms;

import arztpraxis.persons.Patient;

/**
 *
 * @author leina
 */
public abstract class Raum {
    
    private int raumNr;
    private int kapazität;

    public Raum(int raumNr, int kapazität) {
        this.raumNr = raumNr;
        this.kapazität = kapazität;
    }
    
    public abstract void patientAufnehmen(Patient p);
}
