
package agencia;

import javax.swing.JOptionPane;


public class Agencia {

    public void VehiculosConExtras(Vehiculo matCarros[][]){
        System.out.println("--------------------");
        System.out.println("Autos con extras");
        for (int i = 0; i < matCarros.length; i++) {
            for (int j = 0; j < matCarros[i].length; j++) {
                if (matCarros[i][j].isExtras()) {
                System.out.println("");
                System.out.println("Placa: " + matCarros[i][j].getPlaca());
                System.out.println("Modelo: " + matCarros[i][j].getModelo());
                System.out.println("Color: " + matCarros[i][j].getColor());
                System.out.println("Precio: " + matCarros[i][j].getPrecioVehiculo());
                }
            }
        }
    }
    
    public void Mayor25M(Vehiculo matCarros[][]){
        System.out.println("--------------------");
        System.out.println("Autos con precio mayor a 25 M");
        for (int i = 0; i < matCarros.length; i++) {
            for (int j = 0; j < matCarros[i].length; j++) {
                if (matCarros[i][j].getPrecioVehiculo()>25000000) {
                System.out.println("");
                System.out.println("Placa: " + matCarros[i][j].getPlaca());
                System.out.println("Modelo: " + matCarros[i][j].getModelo());
                System.out.println("Color: " + matCarros[i][j].getColor());
                if (matCarros[i][j].isExtras() == true) {
                    System.out.println("Extras: Sí tiene");
                } else {
                    System.out.println("Extras: No tiene");
                }
                System.out.println("Precio: " + matCarros[i][j].getPrecioVehiculo());
                }
            }
        }
    }
    
   
    
    public void MarcasConVerdes(Vehiculo matCarros[][]){
        System.out.println("--------------------");
        System.out.println("Vehículos con color verde");
        for (int i = 0; i < matCarros.length; i++) {
            for (int j = 0; j < matCarros[i].length; j++) {
                if (matCarros[i][j].getColor().equalsIgnoreCase("Verde")) {
                System.out.println("");
                System.out.println("Placa: " + matCarros[i][j].getPlaca());
                System.out.println("Modelo: " + matCarros[i][j].getModelo());
                System.out.println("Color: " + matCarros[i][j].getColor());
                
                if (matCarros[i][j].isExtras() == true) {
                    System.out.println("Extras: Sí tiene");
                } else {
                    System.out.println("Extras: No tiene");
                }
                
                System.out.println("Precio: " + matCarros[i][j].getPrecioVehiculo());
                }
            }
        }
    }
    
    public void MasCaro(Vehiculo MatCarros[][]){
        int fila=0, columna=0;
        float caro=0;
        
        for (int i = 0; i < MatCarros.length; i++) {
            for (int j = 0; j < MatCarros[i].length; j++) {
                if (MatCarros[i][j].getPrecioVehiculo()>caro) {
                    caro = MatCarros[i][j].getPrecioVehiculo();
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("");
        System.out.println("Auto mas caro");
        System.out.println("");
                System.out.println("Placa: " + MatCarros[fila][columna].getPlaca());
                System.out.println("Modelo: " + MatCarros[fila][columna].getModelo());
                System.out.println("Color: " + MatCarros[fila][columna].getColor());
                
                if (MatCarros[fila][columna].isExtras() == true) {
                    System.out.println("Extras: Sí tiene");
                } else {
                    System.out.println("Extras: No tiene");
                }
                
                System.out.println("Precio: " + MatCarros[fila][columna].getPrecioVehiculo());
    }
    
    
    public void Menu(){
        byte opc;
        VentaVehiculo objVV = new VentaVehiculo();
        Vehiculo MatCarros[][] = new Vehiculo[2][2];
        do {            
            opc = Byte.parseByte(JOptionPane.showInputDialog("¿Qué opción desea realizar?\n1- Venta\n2- Impresión\n3- Lista de vehículos con extras\n4- Lista de vehículos cuyo precio supera los 25 millones de colones\n5- Vehículos de color verde\n6- Auto mas caro\n7- Salir"));
            
            switch (opc) {
                case 1:
                    objVV.vender(MatCarros);
                    break;
                case 2:
                    objVV.imprimir(MatCarros);
                    break;
                case 3:
                    VehiculosConExtras(MatCarros);
                    break;
                case 4:
                    Mayor25M(MatCarros);
                    break;
                case 5:
                    MarcasConVerdes(MatCarros);
                    break;
                case 6:
                    MasCaro(MatCarros);
                    break;
                default:
                    System.out.println("Saliendo del programa...");
            }
        } while (opc>=1&&opc<=6);
    }
    
    public static void main(String[] args) {
        
        Agencia objA = new Agencia();
        objA.Menu();
    }//main
    
}//class
