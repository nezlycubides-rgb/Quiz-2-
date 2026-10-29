import java.util. ArrayList; 


public class Edificio {
    private String direccion; 
    private int capacidad; 
    private ArrayList<Apartamento> apartamentos;

    public String getDireccon() {
        return direccion;
    }

    public void setDireccon(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    public Edificio(String direccion, int capacidad) {
        if (capacidad <=0) {
            throw new 
IllegalArgumentException(
                "La capacidad debe ser mayor que cero"
); 

        }

        this.direccion = direccion; 
        this.capacidad = capacidad; 
        this.apartamentos = new ArrayList<>(); 
    }

    public void agragarApartamento(int numero, int habitaciones) {
        if (apartamentos.size() >= capacidad) { 
            System.out.println("El edificio esta lleno.");
            return; 
        }

        if (numero <= 0 || habitaciones <= 0) {
            System.out.println("Datos del apartamento invalidos.");
            return;
        }

        for (Apartamento apt : apartamentos) 

            if (apt.getNumero() == numero) { 
                System.out.println("Ese apartamento ya existe.");
                return; 

            }
        
            apartamentos.add(new Apartamento(numero, habitaciones)); 
            System.out.println("Apartamento agregado correctamente."); 
   
}

public void mostrarEdifico(){
    System.out.println("Edificio en: "+ direccion);
    System.out.println("Capacidad del apartamento: " + capacidad); 
    System.out.println("Apartamentos registrados: " + apartamentos.size()); 
}

}