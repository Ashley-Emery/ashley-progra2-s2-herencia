/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ashley.progra2.s2.herencia;

/**
 *
 * @author ashley
 */
public class Desarrollador extends Empleado {
    
    protected String lenguajePrincipal;
    protected String nivelTecnico;
    protected String herramientas;
    protected int proyectosParticipados;
    
    public Desarrollador(String nombre, int edad, String documentoIdentidad, String direccion, String contacto,
                         double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area,
                         String lenguajePrincipal, String nivelTecnico, String herramientas, int proyectosParticipados) {
        super(nombre, edad, documentoIdentidad, direccion, contacto, salario, idEmpleado, fechaContratacion, tipoContrato, area);
        this.lenguajePrincipal = lenguajePrincipal;
        this.nivelTecnico = nivelTecnico;
        this.herramientas = herramientas;
        this.proyectosParticipados = proyectosParticipados;
    }
    
    public void trabajar(){
        System.out.println(nombre+" escribe codigo en: "+lenguajePrincipal);
    }
}
