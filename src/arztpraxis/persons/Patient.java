
package arztpraxis.persons;


public class Patient {
    private int id;
    private String name;
    private String birthdate;
    private String address;
    private String svnNumber;
    
    public Patient(int id, String name, String birthdate, String address, String svnNumber){
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.svnNumber = svnNumber;
    }
    
    public String getSVNNumber(){
        return this.svnNumber;
    }
    public String lieferDaten(){
        return this.id+".Patient "+this.name+"\n"
               +"Geb. Datum: "+this.birthdate+"\n"
               +"Adresse: "+this.address+"\n"
               +"VersicherungsNr: "+this.svnNumber;
    }
    
}
