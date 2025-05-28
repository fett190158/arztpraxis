/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arztpraxis.persons;

/**
 *
 * @author leina
 */
public class Tunusarzt extends Arzt {
    
    public Tunusarzt(int id, String name) {
        super(id, name);
    }
    
    public void patientBlutAbnehmen(Patient patient){
        System.out.println("Dem Patienten "+patient.getName()+" wird Blut abgenommen.");
        
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        }
    }
}
