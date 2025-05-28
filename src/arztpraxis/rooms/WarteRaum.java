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
public class WarteRaum extends AdministrativerRaum{


    public WarteRaum(int kapazität, int raumNr) {
        super(raumNr, kapazität);
        Patient[] wartendePatienten = new Patient[kapazität];
    }
    
    @Override
    public void patientAufnehmen(Patient p) {
    }
    
    public Patient checkOUT(int patientID){
        return null;
    }
    
}
