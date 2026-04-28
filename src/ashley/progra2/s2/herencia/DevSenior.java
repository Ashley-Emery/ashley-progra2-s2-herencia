/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ashley.progra2.s2.herencia;

/**
 *
 * @author ashley
 */
public class DevSenior extends Desarrollador {
    
    private int aniosExperiencia;
    private int proyectosLead;
    private String especializacion;
    private boolean puedeDarMentoria;
    
    public DevSenior(String nombre, int edad, String documentoIdentidad, String direccion, String contacto,
                               double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area,
                               String lenguajePrincipal, String nivelTecnico, String herramientas, int proyectosParticipados,
                               int aniosExperiencia, int proyectosLead, String especializacion, boolean puedeDarMentoria) {
        
        super(nombre, edad, documentoIdentidad, direccion, contacto, salario, idEmpleado, fechaContratacion, tipoContrato, area, lenguajePrincipal, nivelTecnico, herramientas, proyectosParticipados);
        
        this.aniosExperiencia = aniosExperiencia;
        this.proyectosLead = proyectosLead;
        this.especializacion = especializacion;
        this.puedeDarMentoria = puedeDarMentoria;
    }
    
    public void trabajar(){
        System.out.println(nombre+" desarrolla softare y lidera proyectos");
        
    }
    
    public void impartirCapacitacion(){
        System.out.println(nombre + " esta impartiendo capacitacion");
        
    }
    
}
