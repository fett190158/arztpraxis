/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arztpraxis.persons;

/**
 *
 * @author leina
 */
public abstract class Person {
    
    protected int id;
    protected String name;
    
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
