
package arztpraxis.persons;


public class Patient {
    private int id;
    private String name;
    private String birthdate;
    private String address;
    private String svnNummer;
    
    public Patient(int id, String name, String birthdate, String addres, String svn){
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.address = addres;
        this.svnNummer = svn;
    }
    
}
