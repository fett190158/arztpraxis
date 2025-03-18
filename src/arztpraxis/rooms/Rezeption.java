package arztpraxis.rooms;

import arztpraxis.Arztpraxis;
import java.util.Scanner;
import arztpraxis.persons.Patient;

public class Rezeption {

    public Rezeption() {}

    public Patient patientAnmelung(String svnNumber) {
        for (int i = 0; i < Arztpraxis.patientenStamm.length; i++) {
            if (Arztpraxis.patientenStamm[i] != null
                    && Arztpraxis.patientenStamm[i].getSVNNumber().equals(svnNumber)) {
                return Arztpraxis.patientenStamm[i];
            }
        }
        return null;
    }

    public Patient patientAufnehmen(String svnNumber) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wie heißen Sie?");
        String newPatientName = input.nextLine();

        System.out.println("Wann sind Sie geboren?");
        String newPatientBirthdate = input.nextLine();

        System.out.println("Wo wohnen Sie?");
        String newPatientAddress = input.nextLine();

        int newPatientID = 1;
        for (int i = Arztpraxis.patientenStamm.length - 1; i > 0; i--) {
            if (Arztpraxis.patientenStamm[i] != null) {
                newPatientID = Arztpraxis.patientenStamm[i].getID() + 1;
            }
        }

        return new Patient(newPatientID,
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