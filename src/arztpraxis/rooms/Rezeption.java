package arztpraxis.rooms;

import arztpraxis.Arztpraxis;
import java.util.Scanner;
import arztpraxis.persons.Patient;
import arztpraxis.persons.Rezeptionistin;
        
public class Rezeption extends AdministrativerRaum{

    private Rezeptionistin rezeptionistin;
    
    public Rezeption(Rezeptionistin rezeptionistin, int raumNr, int kapazität) {
        super(raumNr, kapazität);
        this.rezeptionistin = rezeptionistin;
    }
     
    @Override
    public void patientAufnehmen(Patient p) {
    }
    
    public Patient patientAnmelung(String svnNumber) {
        // Wenn Patient in patientenStamm: Patient
        for (int i = 0; i < Arztpraxis.patientenStamm.length; i++) {
            if (Arztpraxis.patientenStamm[i] != null
                    && Arztpraxis.patientenStamm[i].getSvnNumber().equals(svnNumber)) {
                return Arztpraxis.patientenStamm[i];
            }
        }
        // Wenn Patient nicht in patientenStamm: null
        return null;
    }

    public int getLowestID(){
        int newPatientID = 1;
        for (int i = Arztpraxis.patientenStamm.length - 1; i > 0; i--) {
            if (Arztpraxis.patientenStamm[i] != null) {
                newPatientID = Arztpraxis.patientenStamm[i].getId() + 1;
                break;
            }
        }
        return newPatientID;
    }
    
    public Patient neuenPatientAufnehmen(String svnNumber) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Wie heißen Sie?");
        String newPatientName = input.nextLine();

        System.out.println("Wann sind Sie geboren?");
        String newPatientBirthdate = input.nextLine();

        System.out.println("Wo wohnen Sie?");
        String newPatientAddress = input.nextLine();

        return new Patient(getLowestID(),
                           newPatientName,
                           newPatientBirthdate,
                           newPatientAddress,
                           svnNumber);   
    }

    public void zeigeTagespPatienten() {
        System.out.println("********** Tagespatienten **********\n"
                         + "*----------------------------------*");
        for (int i = 0; i < Arztpraxis.tagesPatienten.length; i++) {
            if (Arztpraxis.tagesPatienten[i] != null) {
                System.out.println(Arztpraxis.tagesPatienten[i].lieferDaten() + "\n"
                         + "*----------------------------------*");
            }
        }
    }

    
}