import java.util.ArrayList; //porque el inventario de un personaje puede tener varios elementos u objetos en este caso
//porque son objetos de otra clase

public class Inventario {

    private ArrayList<Objeto> objetos;

    public Inventario() {
        objetos = new ArrayList<>();
    }
// para agregar un nuevo objeto al array
    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }
//para elininar objeto del array
    public void eliminarObjeto(Objeto objeto) {
        objetos.remove(objeto);
    }

    public void mostrarInventario() {
        if (objetos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario:");

            for (Objeto objeto : objetos) {
                System.out.println("- " + objeto.getNombre());
            }
        }
    }
}
