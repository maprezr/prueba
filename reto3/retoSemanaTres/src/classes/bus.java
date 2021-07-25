package classes;

import java.util.ArrayList;

public class bus {

    private String placa;
    private int numeroPuestos;
    private String salida;
    private String llegada;
    private String fechaSalida;
    private String horaSalida;
    private double precio;
    private ArrayList<clienteMayor> pasajeroMayor = new ArrayList<clienteMayor>();
    private ArrayList<clienteMenor> pasajeroMenor = new ArrayList<clienteMenor>();

    public bus(String placa, int numeroPuestos, String salida, String llegada, String fechaSalida, String horaSalida, double precio) {
        this.placa = placa;
        this.numeroPuestos = numeroPuestos;
        this.salida = salida;
        this.llegada = llegada;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.precio = precio;
    }

    public void pasajeroMayor(clienteMayor clienteMayor) {
        this.getPasajeroMayor().add(clienteMayor);
    }

    public void pasajeroMenor(clienteMenor clienteMenor) {
        this.getPasajeroMenor().add(clienteMenor);
    }

    public int pasajerosBus() {
        return getPasajeroMayor().size() + getPasajeroMenor().size();
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the numeroPuestos
     */
    public int getNumeroPuestos() {
        return numeroPuestos;
    }

    /**
     * @param numeroPuestos the numeroPuestos to set
     */
    public void setNumeroPuestos(int numeroPuestos) {
        this.numeroPuestos = numeroPuestos;
    }

    /**
     * @return the salida
     */
    public String getSalida() {
        return salida;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(String salida) {
        this.salida = salida;
    }

    /**
     * @return the llegada
     */
    public String getLlegada() {
        return llegada;
    }

    /**
     * @param llegada the llegada to set
     */
    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the horaSalida
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the pasajeroMayor
     */
    public ArrayList<clienteMayor> getPasajeroMayor() {
        return pasajeroMayor;
    }

    /**
     * @param pasajeroMayor the pasajeroMayor to set
     */
    public void setPasajeroMayor(ArrayList<clienteMayor> pasajeroMayor) {
        this.pasajeroMayor = pasajeroMayor;
    }

    /**
     * @return the pasajeroMenor
     */
    public ArrayList<clienteMenor> getPasajeroMenor() {
        return pasajeroMenor;
    }

    /**
     * @param pasajeroMenor the pasajeroMenor to set
     */
    public void setPasajeroMenor(ArrayList<clienteMenor> pasajeroMenor) {
        this.pasajeroMenor = pasajeroMenor;
    }
    
    
}
