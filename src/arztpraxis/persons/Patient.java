package arztpraxis.persons;

import arztpraxis.Arztpraxis;
import arztpraxis.medicalDocuments.Impfung;

public class Patient {
    
    private int id;
    private String name;
    private String birthdate;
    private String address;
    private String svnNumber;
    private static Impfung[] impfpass = new Impfung[10];

    public Patient(int id, String name, String birthdate, String address, String svnNumber) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.svnNumber = svnNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSvnNumber() {
        return svnNumber;
    }

    public void setSvnNumber(String svnNumber) {
        this.svnNumber = svnNumber;
    }
    
    public Impfung[] getImpfpass(){
        return impfpass;
    }

    public String lieferDaten() {
        for (int i = 0; i < Arztpraxis.tagesPatienten.length; i++) {
            if (Arztpraxis.tagesPatienten[i] != null &&
                Arztpraxis.tagesPatienten[i].svnNumber.equals(svnNumber)) {
                break;
            }
        }
        return this.id + ".Patient " + name + "\n"
                + "Geb. Datum: " + birthdate + "\n"
                + "Adresse: " + address + "\n"
                + "VersicherungsNr: " + svnNumber;
    }
    
    public void speichereImpfung(Impfung impfung){
        for (int i = 0; i < impfpass.length; i++) {
            if(impfpass[i] == null){
                impfpass[i] = impfung;
                break;
            }
        }
    }
    
    public void zeigeImpfpass(){
        System.out.println("************* Impfpass *************");
        System.out.println(lieferDaten());
        System.out.println("------------------------------------");
        
        for (int i = 0; i < impfpass.length; i++) {
            if(impfpass[i] != null){
                int counter = i + 1;
                System.out.println(counter + ". Impfung:\n"
                        + "Name: " + impfpass[i].getName() + "\n"
                        + "Datum: " + impfpass[i].getDate() + "\n"
                        + "Dosis: " + impfpass[i].getDosis() + "\n"
                        + "Wirkstoff: " + impfpass[i].getImpfstoff() + "\n"
                        + "ChargenNr: " + impfpass[i].getChargenNummer() + "\n"
                        + "Arzt: " + impfpass[i].getBehandelnderArzt() + "\n"
                        + "------------------------------------");
            }
        }
    }
}