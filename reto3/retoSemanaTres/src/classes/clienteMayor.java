package classes;
public class clienteMayor extends clienteMenor {
    private String contacto;
    private String correoElec;

    public clienteMayor(String contacto, String correoElec, String nombre, String apellido, String tipoDoc, String numeroDoc, String sexo, int edad) {
        super(nombre, apellido, tipoDoc, numeroDoc, sexo, edad);
        this.contacto = contacto;
        this.correoElec = correoElec;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the correoElec
     */
    public String getCorreoElec() {
        return correoElec;
    }

    /**
     * @param correoElec the correoElec to set
     */
    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

   
    
}
