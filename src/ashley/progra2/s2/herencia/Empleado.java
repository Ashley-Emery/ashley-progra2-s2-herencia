/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ashley.progra2.s2.herencia;

/**
 *
 * @author ashley
 */
public class Empleado extends Persona {
    
    protected double salario;
    protected String idEmpleado;
    protected String fechaContratacion;
    protected String tipoContrato;
    protected String area;
    
    public Empleado(String nombre, int edad, String dni, String direccion, String contacto, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area){
        
        super(nombre, edad, dni, direccion, contacto);
        
        this.salario = salario;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
       this.tipoContrato = tipoContrato;
       this.area = area;
    
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void trabajar(){
        System.out.println(nombre+" esta trabajando.");
    }
    
}
