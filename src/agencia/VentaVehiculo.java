
package agencia;

import javax.swing.JOptionPane;


public class VentaVehiculo {
    
    public void vender(Vehiculo matCarros[][]){
        for (int i = 0; i < matCarros.length; i++) {
            for (int j = 0; j < matCarros[i].length; j++) {
                
                char booleana='s';
                matCarros[i][j] = new Vehiculo();
                matCarros[i][j].setPlaca(JOptionPane.showInputDialog("Digite la placa"));
                matCarros[i][j].setModelo(JOptionPane.showInputDialog("Digite el modelo"));
                matCarros[i][j].setColor(JOptionPane.showInputDialog("Digite el color"));
                
                booleana = JOptionPane.showInputDialog("¿Tiene extras? s/n").charAt(0);
                if (booleana== 'S' || booleana == 's') {
                    matCarros[i][j].setExtras(true);
                } else {
                    matCarros[i][j].setExtras(false);
                }
                
                matCarros[i][j].setPrecioVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Digite el precio")));
                System.out.println("Auto registrado");
            }
        }
    }
    
    public void imprimir(Vehiculo matCarros[][]){
        System.out.println("--------------------");
        System.out.println("Autos vendidos");
        for (int i = 0; i < matCarros.length; i++) {
            for (int j = 0; j < matCarros.length; j++) {
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
