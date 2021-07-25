/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author chata
 */
public class Persona {
    private String nombre;
    private String fechaDeNacimiento;
    private String numeroDeIdentificacion;
    private String Nacionalidad;

    
    
    
    public Persona(String nombre, String fechaDeNacimiento, String numeroDeIdentificacion, String Nacionalidad) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.Nacionalidad = Nacionalidad;
    }
    
    public void comer(){
        System.out.println(this.getNombre()+" esta comiendo ");
}
    public void trabajar(){
        System.out.println(this.getNombre()+" esta trabajando ");
    }
    public void caminar(){
        System.out.println(this.getNombre()+" esta caminando ");
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
     * @return the fechaDeNacimiento
     */
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * @param fechaDeNacimiento the fechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * @return the numeroDeIdentificacion
     */
    public String getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    /**
     * @param numeroDeIdentificacion the numeroDeIdentificacion to set
     */
    public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }
    /**
     * @return the Nacionalidad
     */
    public String getNacionalidad() {
        return Nacionalidad;
    }

    /**
     * @param Nacionalidad the Nacionalidad to set
     */
    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    
    
    
}
