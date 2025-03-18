package arztpraxis.persons;

import arztpraxis.Arztpraxis;

public class Patient {
    
    private int id;
    private String name;
    private String birthdate;
    private String address;
    private String svnNumber;

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

    public String lieferDaten() {
        int tagesPatientenNr = 1;
        for (int i = 0; i < Arztpraxis.tagesPatienten.length; i++) {
            if (Arztpraxis.tagesPatienten[i] != null &&
                Arztpraxis.tagesPatienten[i].svnNumber.equals(this.svnNumber)) {
                tagesPatientenNr = i + 1;
                break;
            }
        }
        return tagesPatientenNr + ".Patient " + this.name + "\n"
                + "Geb. Datum: " + this.birthdate + "\n"
                + "Adresse: " + this.address + "\n"
                + "VersicherungsNr: " + this.svnNumber;
    }
}