public class Persona {
    
    //Atributos
    private String nombre; //La buena practica es poner privado
    private int edad;
    public final int NUMERO_OJOS = 2; //Normalmente las constantes se ponen en mayusculas
    public static int numeroPersona =0; //STATIC variable compartida

    //Constructor, se usa el mismo nombre la clase
    //El constructor vacio se crea por defecto en java
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        numeroPersona++;
    }
    //Metodos
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    } 
    public void caminar(int pasos){
        for(int i = 0; i<pasos;i++){
            System.out.println("Mover un pie");
            System.out.println("Mover el otro");
        }
    }
    public double trotar(double kilometros){
        return kilometros*50;
    }
}