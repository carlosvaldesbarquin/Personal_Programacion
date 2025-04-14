package valdesCarlos1;

public class Factura {
    private String nombreCliente;
    private String vehiculoAlquilado;
    private double precioAlquiler;
    private int diasAlquiler;
    private double totalFactura;

    public Factura(String nombreCliente, String vehiculoAlquilado, double precioAlquiler, int diasAlquiler) {
        this.nombreCliente = nombreCliente;
        this.vehiculoAlquilado = vehiculoAlquilado;
        this.precioAlquiler = precioAlquiler;
        this.diasAlquiler = diasAlquiler;
        this.totalFactura = calcularTotalFactura();
    }


    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getVehiculoAlquilado() {
        return vehiculoAlquilado;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public double calcularTotalFactura() {
        return precioAlquiler * diasAlquiler;
    }

    public void mostrarFactura() {
        System.out.println("----- FACTURA -----");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Vehículo: " + vehiculoAlquilado);
        System.out.println("Precio por día: " + precioAlquiler + "€");
        System.out.println("Días de alquiler: " + diasAlquiler);
        System.out.println("Total: " + totalFactura + "€");
    }
    

}
