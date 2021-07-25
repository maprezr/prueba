package Clases;
public class Empleado extends Persona{
    private double salario;
    private String cargo;

    public Empleado(double salario, String nombre, String apellidos, String documento, String correo,String cargo) {
        super(nombre, apellidos, documento, correo);
        this.salario = salario;
        this.cargo=cargo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
