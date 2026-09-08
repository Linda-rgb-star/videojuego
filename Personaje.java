public class Personaje {

    private String nombre;
    private int nivel;
    private int puntosVida;
    private int vidaMaxima;
    private Inventario inventario;

    public Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.nivel = 1;
        this.puntosVida = vidaMaxima;
        this.inventario = new Inventario();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public Inventario getInventario() {
        return inventario;
    }
//solo aimenta el nivel si el juuego asi lo pide desde alguna parte del codigo
    public void subirNivel() {
        nivel++;
    }

    public void modificarVida(int cantidad) {
        puntosVida += cantidad;

        if (puntosVida < 0) {
            puntosVida = 0;
        }

        if (puntosVida > vidaMaxima) {
            puntosVida = vidaMaxima;
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de vida: " + puntosVida + "/" + vidaMaxima);
    }
}
