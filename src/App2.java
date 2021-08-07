public class App2 {
    //Solucionar el numero de Personas usandolo como STATIC
    public static void main(String args []){
        Persona p1 = new Persona("Johana",30);
        Persona p2 = new Persona("Leidy",31);
        Persona p3 = new Persona("Cami",32);
        System.out.println(Persona.numeroPersona); //Al haber cosas estatica lo adecuado es preguntarlo a la clase
        
    }   
}
