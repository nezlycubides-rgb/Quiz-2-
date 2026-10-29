public class Main {
    public static void main(String[] args) {

        Edificio edificio = new Edificio("Calle 100 #15-20, Bogota", 3); 

        edificio.agragarApartamento(101, 2); 
        edificio.agragarApartamento(102, 3); 
        edificio.agragarApartamento(201, 2); 


        edificio.agragarApartamento(202, 4); 
        edificio.mostrarEdifico();
    }

}
