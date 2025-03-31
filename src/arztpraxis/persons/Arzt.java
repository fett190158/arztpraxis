/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arztpraxis.persons;

import arztpraxis.medicalDocuments.Impfung;
import java.util.Scanner;

/**
 *
 * @author leina
 */
public class Arzt {
    private int id;
    private String name;
    
    public Arzt(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void patientImpfen(Patient patient){
        Scanner input = new Scanner(System.in);
        
        Impfung newImpfung = new Impfung();
        
        System.out.println("Name der Impfung: ");
        newImpfung.setName(input.nextLine());
        
        System.out.println("Chargennummer der Impfung: ");
        newImpfung.setChargenNummer(input.nextLine());
        
        System.out.println("Dosis der Impfung: ");
        newImpfung.setDosis(input.nextInt());
        
        newImpfung.setBehandelnderArzt(this.name);
        
        patient.speichereImpfung(newImpfung);
    }
}
