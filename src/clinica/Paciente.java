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
public class Paciente {
    
    private String nombre;
    private String apellido;
    private String nroHistoriaClinica;

    public Paciente(String nombre, String apellido, String nroHistoriaClinica) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroHistoriaClinica = nroHistoriaClinica;
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

    /**
     * @return the nroHistoriaClinica
     */
    public String getNroHistoriaClinica() {
        return nroHistoriaClinica;
    }

    /**
     * @param nroHistoriaClinica the nroHistoriaClinica to set
     */
    public void setNroHistoriaClinica(String nroHistoriaClinica) {
        this.nroHistoriaClinica = nroHistoriaClinica;
    }
    
    
    
}
