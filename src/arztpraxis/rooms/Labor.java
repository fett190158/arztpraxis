/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arztpraxis.rooms;

import arztpraxis.persons.Arzt;
import arztpraxis.persons.Patient;

/**
 *
 * @author leina
 */
public class Labor extends MedizinischerRaum{

    public Labor(int raumNr, int kapazität) {
        super(raumNr, kapazität);
    }
    
    @Override
    public void patientAufnehmen(Patient p) {
    }   
}
