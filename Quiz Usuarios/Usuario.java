import java.util.ArrayList; 


public class Usuario {
    private int id; 
    private String nombreCompleto;
    private String nombreUsuario; 
    private String contraseña; 
    private Rol rol; 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public ArrayList<RegistroAccion> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<RegistroAccion> historial) {
        this.historial = historial;
    }

    private ArrayList<RegistroAccion> historial; 
    
    public Usuario(int id, String nombreCompleto, String nombreUsuario, String contraseña, Rol rol) {
        this.id= id;
        this.nombreCompleto =nombreCompleto; 
        this.nombreUsuario =nombreUsuario; 
        this.contraseña = contraseña; 
        this.rol = rol; 
        this.historial = new ArrayList<>();  
    }

    public void mostrarDatos(){
        System.out.println("ID: " + id);
        System.out.println("Nombre:" + nombreCompleto);
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Rol: " + rol);

    }

    public void mostrarHistorial() {
        System.out.println("Historial de: " + nombreUsuario); 

        if (historial.isEmpty()){
            System.out.println("No hay acciones registradas"); 
            return;

        }

        for(RegistroAccion accion: historial) {
            accion.mostrar();

        }
    }

    public void registroAccion(String string) {
        throw new UnsupportedOperationException("Unimplemented method 'registroAccion'");
    }
    
}
