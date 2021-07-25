package classes;

import java.util.ArrayList;
 public  class  baseDeDatos {
    private static ArrayList<bus> buses = new ArrayList<bus>();
    private static ArrayList<clienteMenor> clientesMenores = new ArrayList<clienteMenor>();
    private static ArrayList<clienteMayor> clientesMayores = new ArrayList<clienteMayor>();
    
    public static void agregarBus(bus bus){
        getBuses().add(bus);
    }
    
    public static void agregarClienteMenor(clienteMenor clienteMenor){
        getClientesMenores().add(clienteMenor);
    }
    public static void agregarClienteMayor(clienteMayor clientemayor){
        getClientesMayores().add(clientemayor);
    }

    /**
     * @return the buses
     */
    public static ArrayList<bus> getBuses() {
        return buses;
    }

    /**
     * @param aBuses the buses to set
     */
    public static void setBuses(ArrayList<bus> aBuses) {
        buses = aBuses;
    }

    /**
     * @return the clientesMenores
     */
    public static ArrayList<clienteMenor> getClientesMenores() {
        return clientesMenores;
    }

    /**
     * @param aClientesMenores the clientesMenores to set
     */
    public static void setClientesMenores(ArrayList<clienteMenor> aClientesMenores) {
        clientesMenores = aClientesMenores;
    }

    /**
     * @return the clientesMayores
     */
    public static ArrayList<clienteMayor> getClientesMayores() {
        return clientesMayores;
    }

    /**
     * @param aClientesMayores the clientesMayores to set
     */
    public static void setClientesMayores(ArrayList<clienteMayor> aClientesMayores) {
        clientesMayores = aClientesMayores;
    }
    
     
    
}
