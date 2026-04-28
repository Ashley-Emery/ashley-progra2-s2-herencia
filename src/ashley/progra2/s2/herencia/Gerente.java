/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ashley.progra2.s2.herencia;

/**
 *
 * @author ashley
 */
public class Gerente extends Empleado{
    
    private String departamento;
    private int personaACargo;
    private String frecuenciaReuniones;
    private double presupuesto;
    
    public Gerente(String nombre, int edad, String documentoIdentidad, String direccion, String contacto,
                   double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area,
                   String departamento, int personasACargo, double presupuesto, String frecuenciaReuniones) {
        
        super(nombre, edad, documentoIdentidad, direccion, contacto, salario, idEmpleado, fechaContratacion, tipoContrato, area);
        
        this.departamento = departamento;
        this.personaACargo = personaACargo;
        this.frecuenciaReuniones = frecuenciaReuniones;
        this.presupuesto = presupuesto;
        
    
    }
    
    public void trabajar(){
        System.out.println(nombre+" coordina el departamento de: "+departamento);
        
    }
    
    public void evauluoDesempeno(){
        System.out.println(nombre+" a cargo de evaluar el desempeno del equipo");
    
    }
    
}
