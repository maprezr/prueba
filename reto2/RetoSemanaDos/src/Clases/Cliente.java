package Clases;
public class Cliente extends Persona{
    private String direccion;
    private String telefono;

    public Cliente(String direccion, String telefono, String nombre, String apellidos, String documento, String correo) {
        super(nombre, apellidos, documento, correo);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
