package Clases;

public class Empresa {

    private String razonSocial;
    private String nit;
    private String direccion;
    private Empleado empleado[];
    private Cliente cliente[];

    public Empresa(String razonSocial, String nit, String direccion, Empleado[] empleado) {
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.direccion = direccion;
        this.empleado = empleado;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
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
     * @return the empleado
     */
    public Empleado[] getEmpleado() {
        System.out.println(empleado);
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado[] empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the cliente
     */
    public Cliente[] getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

}
