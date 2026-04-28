/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ashley.progra2.s2.herencia;

/**
 *
 * @author ashley
 */
public class AshleyProgra2S2Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado emp1 = new Desarrollador("Ashley Fajardo", 25, "0501199708225", "San Pedro SUla", "9999-1111", 25000, "DEV001", "01/02/2024", "Tiempo completo", "Desarrollo", "Java", "Intermedio", "NetBeans", 4);

        Empleado emp2 = new Gerente("Maria Lopez", 35, "0801199001234", "San Pedro Sula", "9999-2222", 50000, "GER001", "15/01/2020", "Tiempo completo", "Administracion", "Recursos Humanos", 12, 150000, "Semanal");

        Empleado emp3 = new DesarrolladorSenior("Ana Rodriguez", 30, "0501199405678", "La Ceiba", "9999-3333", 40000, "SEN001", "10/03/2021", "Tiempo completo", "Desarrollo", "Java", "Avanzado", "NetBeans", 10, 7, 5, "Backend", true);

        emp1.trabajar();
        emp2.trabajar();
        emp3.trabajar();

        System.out.println("Salario empleado 1: " + emp1.getSalario());
        System.out.println("Salario empleado 2: " + emp2.getSalario());
        System.out.println("Salario empleado 3: " + emp3.getSalario());
    }
    
}
