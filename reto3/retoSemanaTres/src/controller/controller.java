package controller;

import classes.*;

public class controller {

    public static void crearBus(String Placa, int cantidadPuestos, String salida, String llegada, String fechaSalida, String horaSalida, double precio) {
        bus NuevoBus = new bus(Placa, cantidadPuestos, salida, llegada, fechaSalida, horaSalida, precio);
        baseDeDatos.agregarBus(NuevoBus);

    }

    public static void crearClienteMenor(String nombre, String apellido, String tipoDoc, String numeroDoc, String sexo, int edad) {
        clienteMenor NuevoClienteMenor = new clienteMenor(nombre, apellido, tipoDoc, numeroDoc, sexo, edad);
        baseDeDatos.agregarClienteMenor(NuevoClienteMenor);
    }

    public static void crearClientemayor(String contacto, String correoElec, String nombre, String apellido, String tipoDoc, String numeroDoc, String sexo, int edad) {
        clienteMayor NuevoClienteMayor = new clienteMayor(contacto, correoElec, nombre, apellido, tipoDoc, numeroDoc, sexo, edad);
        baseDeDatos.agregarClienteMayor(NuevoClienteMayor);
    }

    public static clienteMayor buscarclienteMayor(String numeroDoc) {
        clienteMayor clienteMayorN = null;
        for (clienteMayor i : baseDeDatos.getClientesMayores()) {
            if (i.getNumeroDoc().equals(numeroDoc)) {
                clienteMayorN =i;
            }
        }
        return clienteMayorN;
    }
    
    public static clienteMenor buscarClienteMenor(String numeroDoc){
        clienteMenor clienteMenorN =null;
         for (clienteMenor i : baseDeDatos.getClientesMenores()) {
            if (i.getNumeroDoc().equals(numeroDoc)) {
                clienteMenorN =i;
            }
        }
        return clienteMenorN;
    }
    public static bus buscarBus(String salida, String llegada){
        bus busE = null;
        for (bus i : baseDeDatos.getBuses()){
            if (i.getSalida().equals(salida)&&i.getLlegada().equals(llegada)) {
                busE=i;
            }
        }
        return busE;
    }
    public static bus buscarBusPlaca(String placa ){
        bus busE=null;
        for (bus i : baseDeDatos.getBuses()){
            if (i.getPlaca().equals(placa)) {
                busE=i;
            }
        }
        return busE;
            
        }
    }
            
    
    
    


