/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ashley.progra2.s2.herencia;

/**
 *
 * @author ashley
 */
public class Persona {
    
    protected String nombre;
    protected int edad;
    protected String dni; 
    protected String direccion;
    protected String contacto;
    
    public Persona(String nombre, int edad, String dni, String direccion, String contacto){
        
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
        this.contacto = contacto;
        
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("DNI: "+dni);
        System.out.println("Direccion: "+direccion);
        System.out.println("Contacto: "+contacto);
    }
}
