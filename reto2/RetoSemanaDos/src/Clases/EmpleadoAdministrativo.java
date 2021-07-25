package Clases;
public class EmpleadoAdministrativo extends Empleado {
    private String categoria;
    private Empleado subordinado[];
    public EmpleadoAdministrativo(String categoria, Empleado[] subordinado, String cargo, double salario, String nombre, String apellidos, String documento, String correo) {
        super(salario, nombre, apellidos, documento, correo, cargo);
        this.categoria = categoria;
        this.subordinado = subordinado;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the subordinado
     */
    public Empleado[] getSubordinado() {
        return subordinado;
    }

    /**
     * @param subordinado the subordinado to set
     */
    public void setSubordinado(Empleado[] subordinado) {
        this.subordinado = subordinado;
    }

   
    
}
