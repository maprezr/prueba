package classes;
public class clienteMenor {
    private String nombre ;
    private String apellido;
    private String tipoDoc;
    private String numeroDoc;
    private String sexo;
    private  int   edad ;

    public clienteMenor(String nombre, String apellido, String tipoDoc, String numeroDoc, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
        this.sexo = sexo;
        this.edad = edad;
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
     * @return the tipoDoc
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * @param tipoDoc the tipoDoc to set
     */
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    /**
     * @return the numeroDoc
     */
    public String getNumeroDoc() {
        return numeroDoc;
    }

    /**
     * @param numeroDoc the numeroDoc to set
     */
    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    


    }             

