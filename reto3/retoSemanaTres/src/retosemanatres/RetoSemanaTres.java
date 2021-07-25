package retosemanatres;

import classes.*;
import controller.controller;
import java.util.Scanner;
import view.view;

public class RetoSemanaTres {

    public static void main(String[] args) {

        controller.crearBus("QIR364", 16, "Bogota", "Medellin", "20-07-21", "10:00 PM", 60000);
        controller.crearBus("DXX689", 10, "Medellin", "Bogota", "20-07-21", "08:00 AM", 60000);
        controller.crearBus("OPT548", 15, "Cali", "Medellin", "20-07-21", "12:00 M", 70000);
        controller.crearBus("UAS785", 20, "Medellin", "Cali", "20-07-21", "05:00 PM", 70000);
        controller.crearBus("OSJ548", 16, "Bogota", "Barranquilla", "20-07-21", "14:00", 100000);
        controller.crearBus("IKL846", 15, "Barranquilla", "Bogota", "20-07-21", "04:00 AM", 100000);

        controller.crearClientemayor("3166008808", "maperez.r@gmail.com", "miguel", "perez", "CC", "1022983331", "masculino", 28);
        controller.crearClientemayor("3156963266", "natalia.s@gmail.com", "natalia", "salazar", "CC", "598631135", "femenino", 23);
        controller.crearClientemayor("3129865488", "diego.r@gmail.com", "diego", "ramirez", "CC", "1022863155", "masculino", 34);
        controller.crearClientemayor("3189563148", "juan.a@gmail.com", "juan", "alvarado", "CC", "1022659987", "masculino", 19);

        controller.crearClienteMenor("diego", "perez", "TI", "1022659874", "Masculino", 15);
        controller.crearClienteMenor("ivan", "fernandez", "TI", "102665484", "Masculino", 13);
        controller.crearClienteMenor("laura", "salasar", "TI", "102264865", "Femenino", 10);
        controller.crearClienteMenor("esteban", "martinez", "TI", "1022543159", "Masculino", 15);
        controller.crearClienteMenor("camila", "chavarro", "TI", "102149875", "Femenino", 5);
        
        view view = new view();
        view.show();

    }

}
