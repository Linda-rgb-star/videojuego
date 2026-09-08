
public class Main {

    public static void main(String[] args) {

        // Crear un jugador
        Jugador jugador = new Jugador("Linda");

        System.out.println("Jugador creado: " + jugador.getNombre());

        // Crear un personaje
        jugador.crearPersonaje("Guerrero", 100);

        Personaje personaje = jugador.getPersonaje();

        System.out.println("información del personaje creado");
        personaje.mostrarDatos();

        // Subir de nivel
        personaje.subirNivel();
        System.out.println("\nEl personaje realiza una acción y sube de nivel.");
        

        personaje.mostrarDatos();
      
        // Daño
        personaje.modificarVida(-30);
        System.out.println("\nEl personaje recibe 30 puntos de daño.");
        

        personaje.mostrarDatos();

        // Curarse
      personaje.modificarVida(20);
        System.out.println("\nEl personaje recupera 20 puntos de vida.");
        

        personaje.mostrarDatos();

        // Intentar superar la vida máxima
        personaje.modificarVida(100);
        System.out.println("\nEl personaje intenta recuperar 100 puntos de vida.");
        

        personaje.mostrarDatos();

        // Agregar objetos al inventario
        System.out.println("\nINVENTARIO: ");

        personaje.getInventario().agregarObjeto(new Objeto("Espada"));
        personaje.getInventario().agregarObjeto(new Objeto("Poción"));
        personaje.getInventario().agregarObjeto(new Objeto("Escudo"));

        personaje.getInventario().mostrarInventario();

        // Eliminar personaje
        System.out.println("\n eliminando personaje");

        jugador.eliminarPersonaje();

        System.out.println("El personaje ha sido eliminado.");
        System.out.println("El jugador" +  + jugador.getNombre() + "continúa existiendo" );

        if (jugador.getPersonaje() == null) {
            System.out.println("El jugador ya no tiene personaje.");
            System.out.println("El inventario del personaje también desapareció.");
        }
    }
}
