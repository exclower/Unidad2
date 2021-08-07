import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona p1 = new Persona("Mauricio", 15);
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        
        p1.setEdad(20);
        System.out.println(p1.getEdad());
        p1.setNombre("Cami");
        System.out.println(p1.getNombre());
        //p1.NUMERO_OJOS = 5;  //Si se usa Finale se asegura que no es cambiable en main
        JOptionPane.showMessageDialog(null, "Un mensaje", "titulo", JOptionPane.ERROR_MESSAGE); //Libreria para mostrar en ventanas
        //Se escribe JoptionPane y se ve las opciones
        
        //METODOS
        p1.caminar(2);
        System.out.print(p1.trotar(4.5));

    }
}
