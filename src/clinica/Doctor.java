/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clinica;

import java.util.ArrayList;

/**
 *
 * @author consultor05
 */
public class Doctor {
    
    private String nombre;
    private String apellido;
    ArrayList<Paciente> nombreArregloPaciente = new ArrayList<>();
    

    public Doctor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void agregarPaciente(Paciente paciente){
        nombreArregloPaciente.add(paciente);
    } 
       
        
    
    public String listarPaciente(Doctor doctor){
    
        String mensaje = "";
        mensaje += "Doctor: " + doctor.getNombre() + " " + doctor.getApellido();
        mensaje += "\n";
        mensaje += "Pacientes:";
        mensaje += "\n";
        
        for (int i = 0; i < nombreArregloPaciente.size(); i++) {
            Paciente paciente = (Paciente)nombreArregloPaciente.get(i);
            mensaje += i+1 + ".-"+ paciente.getNombre() + " " + paciente.getApellido() + " " + paciente.getNroHistoriaClinica();         
            mensaje += "\n";
        }
        
        mensaje += "Total Pacientes: " + nombreArregloPaciente.size();
    
        return mensaje;       
    }
    
        /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
