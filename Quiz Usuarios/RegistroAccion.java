import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroAccion{
    private String descripcion; 
    private LocalDateTime fecha; 

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public RegistroAccion(String descripcion) {
        this.descripcion = descripcion; 
        this.fecha= LocalDateTime.now(); 
    }

    public void mostrar() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 

        System.out.println(fecha.format(formato) + "-" + descripcion); 

    }
}