package empleados;

public class Persona {
    //ATRIBUTOS
    protected int id;
    protected String nombre, apellidos;
    protected int edad;

    //constructor
    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //getters setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    //TO STRING
    @Override
    public String toString() {
        return "##########################\n"
                + "id:" + this.id + "\n"
                + "Nombre:" + this.nombre + "\n"
                + "Apellidos:" + this.apellidos + "\n"
                + "Edad:" + this.edad + "\n";

    }
    
    //metodos concentrarse y viajar
    public void concentrarse(){
        System.out.println("Me estoy concentrando");
    
    }
    
    public void viajar(){
        System.out.println("Estoy viajando");
    
    }

}
