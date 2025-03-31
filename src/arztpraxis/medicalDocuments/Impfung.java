/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arztpraxis.medicalDocuments;

import arztpraxis.Arztpraxis;
import java.util.Date;

/**
 *
 * @author leina
 */
public class Impfung {
    
    private String name;
    private Date date;
    private String chargenNummer;
    private String impfstoff;
    private int dosis;
    private String behandelnderArzt;
    
    public Impfung(){
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getChargenNummer() {
        return chargenNummer;
    }

    public String getImpfstoff() {
        return impfstoff;
    }

    public int getDosis() {
        return dosis;
    }

    public String getBehandelnderArzt() {
        return behandelnderArzt;
    }

    public void setBehandelnderArzt(String Arzt){
        this.behandelnderArzt = Arzt;
    }
    
    public void setName(String name) {
        for(int i = 0; i < Arztpraxis.angeboteneImpfungen.length; i++) {
            if(Arztpraxis.angeboteneImpfungen[i].equals(name.toUpperCase())){
                this.name = name;
                setImpfstoffForName(name);
                return;
            }
        }
        System.out.println("Name invalide!");
    }
    
    private void setImpfstoffForName(String name){
        switch(name.toUpperCase()){
            case "MASERN":
                impfstoff = "Merieux";
                break;
            case "MUMPS":
                impfstoff = "MMRV";
                break;
            case "ROETELN":
                impfstoff = "MMR";
                break;
            case "HEPATITIS A":
                impfstoff = "Genevac A";
                break;
            case "HEPATITIS B":
                impfstoff = "Recombivax HB";
                break;
            case "FSME":
                impfstoff = "Encepur";
                break;
            case "INFLUENZA":
                impfstoff = "Fluarix";
                break;
        }
    }
    
    public void setChargenNummer(String chargenNummer){        
        if(Character.isLetter(chargenNummer.charAt(0)) &&
           Character.isDigit(chargenNummer.charAt(chargenNummer.length()-1))){
            this.chargenNummer = chargenNummer;
        }
        else{
            System.out.println("ChargenNummer invalide!");
        }
    }
    
    public void setDosis(int dosis){
        if(dosis >=1 && dosis <= 3){
            this.dosis = dosis;
        }
        else{
            System.out.println("Dosis invalide!");
        }
    }
}
