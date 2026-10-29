public class Apartamento {
    private int numero; 
    private int habitaciones; 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Apartamento(int numero, int habitaciones) {
        this.numero =numero;
        this.habitaciones = habitaciones;  

    }

    public void mostrarInformacion() {
        System.out.println("Numero de apartamento: " + numero); 
        System.out.println("Habitaciones: " + habitaciones); 
    }
    
}