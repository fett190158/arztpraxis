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
    
    protected int raumNr;
    protected int kapazität;
    
    public abstract Patient patientAufnehmen(String svnNummer);
}
