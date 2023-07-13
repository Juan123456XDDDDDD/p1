
package agencia;


public class Vehiculo {
    private String placa, modelo, color;
    boolean extras;
    float precioVehiculo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }

    public float getPrecioVehiculo() {
        return precioVehiculo;
    }

    public void setPrecioVehiculo(float precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }
    
    
}
