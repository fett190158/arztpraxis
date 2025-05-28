/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arztpraxis.persons;

import arztpraxis.rooms.Labor;
import java.util.Scanner;

/**
 *
 * @author leina
 */
public class AllgemeinMediziner extends Arzt{
    
    public AllgemeinMediziner(int id, String name) {
        super(id, name);
    }
    
    public void erstelleDiagnose(Patient patient, Tunusarzt tunusArzt){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Haben Sie Schmerzen?");
        String schmerzen = input.nextLine();
        if(schmerzen.toLowerCase().equals("ja")){
            tunusArzt.patientBlutAbnehmen(patient);
        }
        
        System.out.println("Brauchen Sie eine Impfung?");
        String impfen = input.nextLine();
        if(impfen.toLowerCase().equals("ja")){
            patientImpfen(patient);
        }
        
        patient.zeigeImpfpass();
    }
}
