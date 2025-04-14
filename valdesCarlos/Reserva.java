package valdesCarlos;

public class Reserva {
    private String nombreCliente;
    private Sala salaReservada;
    private String fechaReserva;
    private String horaInicio;
    private String horaFin;

    public Reserva(String nombreCliente, Sala salaReservada, String fechaReserva, String horaInicio, String horaFin) {
        this.nombreCliente = nombreCliente;
        this.salaReservada = salaReservada;
        this.fechaReserva = fechaReserva;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Sala getSalaReservada() {
        return salaReservada;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void mostrarDetallesReserva() {
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Sala reservada: " + salaReservada.getNombre());
        System.out.println("Fecha de reserva: " + fechaReserva);
        System.out.println("Hora de inicio: " + horaInicio);
        System.out.println("Hora de fin: " + horaFin);
    }
    
    
}
