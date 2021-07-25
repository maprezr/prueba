package retosemanados;

import Clases.*;
import java.util.Scanner;

public class RetoSemanaDos {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inE = new Scanner(System.in);
        
        boolean iniciaMenu =true; 
        
        
        Empleado empleado1= new Empleado(800000, "miguel", "perez", "1022983331", "maperez.r@gmal.com","operario linea de empaque");
        Empleado empleado2= new Empleado(800000, "juan", "galindo", "1022654897", "juan.g@gmail.com","operario linea de empaque");
        Empleado empleado3= new Empleado(800000, "marcos", "suares", "102265498", "marcos.s@gmail.com","operario linea de empaque");
        Empleado empleado4= new Empleado(800000, "laura", "quintero", "10224847", "laura.q@gmail.com","operario manufactura ");
        Empleado empleado5= new Empleado(800000, "sofia", "urrea", "10256877", "sofua.u@gmail.com","operario manufactura ");
        Empleado empleado6= new Empleado(800000, "camila", "fernandez", "10256648", "camila.f@gmail.com","operario manufactura");
        Empleado empleados1[]={empleado1,empleado2,empleado3};
        Empleado empleados2[]={empleado4,empleado5,empleado6};
        
        EmpleadoAdministrativo supervisor1 = new EmpleadoAdministrativo("supervisor", empleados1, "SUPERVISOR LINEA DE EMPAQUE", 2000000, "ivan ", "castro", "1022698886", "ivan.c@gmail.com");
        EmpleadoAdministrativo supervisor2 = new EmpleadoAdministrativo("supervisor", empleados2, "SUPERVISOR MANUFACTURA", 2000000, "juan ", "perez", "102265478", "juan.p@gmail.com");
         
        EmpleadoAdministrativo empleadosAdministrativos []={supervisor1,supervisor2};
        
        Cliente cliente1 = new Cliente("carrera 5 n 85-35", "3159866235", "javier ", "hernandez", "79455789", "javier.hernandez@gmail.com");
        Cliente cliente2 = new Cliente("carrera 9 n 58-65", "3153159874", "natalia ", "salazar", "1022659745", "natalia.salazar@gmail.com");
        
        Cliente  clientes[]={cliente1,cliente2};
        
        Empresa empresa1 = new Empresa("surtitodo", "9006532365", "carrera 2 N° 58-36",empleadosAdministrativos);
        
        empresa1.setCliente(clientes);
        
        
        
        
        
        
        while (iniciaMenu){
        System.out.println("*********************************************");
        System.out.println("BIENVENIDO A LA BASE DE DATOS DE LA EMPRESA"+empresa1.getRazonSocial());
        System.out.println("1.mostrar datos empresa "+empresa1.getRazonSocial()); 
        System.out.println("2.mostrar empleados de la empresa "+empresa1.getRazonSocial()); 
        System.out.println("3.mostar clietes de la empresa "+empresa1.getRazonSocial());  
        System.out.print("ingrese una opcion: ");
        int opc= in.nextInt();
        switch (opc) {
            case 1:
                System.out.println("");
                System.out.println("");
                System.out.println("*********************************************");   
                System.out.println("Razon social: "+empresa1.getRazonSocial());
                System.out.println("Nit: "+empresa1.getNit());
                System.out.println("Direccion: "+empresa1.getDireccion());
                System.out.print("ENTER PARA CONTINUAR");
                inE.nextLine();
                break;
            case 2:
                  System.out.println("");
                  System.out.println("");
                 for (EmpleadoAdministrativo i: empleadosAdministrativos ){
                     System.out.println("*********************************************");   
                    System.out.println(i.getCargo()+": "+i.getNombre()+i.getApellidos()); 
                     System.out.println("SUBORDINADOS: ");
                    
                    for (Empleado j : i.getSubordinado() ){
                        System.out.println(j.getNombre() +" "+j.getApellidos());
                    }} 
                    System.out.print("ENTER PARA CONTINUAR");
                    inE.nextLine();
                
                break;           
            case 3:
                System.out.println("");
                System.out.println("");
                int k=0;
                for (Cliente i:empresa1.getCliente()){
                    k++;
                    System.out.println("*********************************************");
                    System.out.println("cliente N°: "+k);
                    System.out.println("nombre: "+i.getNombre());
                    System.out.println("apellido: "+i.getApellidos());
                    System.out.println("direccion: "+i.getDireccion());
                    System.out.println("correo: "+i.getCorreo());
                    System.out.println("telefono: "+i.getTelefono());
                    
                }
                System.out.print("ENTER PARA CONTINUAR");
                inE.nextLine();
                
                break;
            default:
                System.out.println("la opcion ingresada no es valida");
                
                
        }}
        
    }
    
}
