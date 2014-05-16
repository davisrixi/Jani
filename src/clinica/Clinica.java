/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clinica;

/**
 *
 * @author consultor05
 */
public class Clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Doctor doctor1 = new Doctor("Juan", "Perez");
    
    Paciente paciente1 = new Paciente("Davis","Rixi","001");
    Paciente paciente2 = new Paciente("Janina","Giraldo","002");
            
    doctor1.agregarPaciente(paciente1);
    doctor1.agregarPaciente(paciente2);
    
     
    System.out.println(doctor1.listarPaciente(doctor1));
    
    
    }
    
}
