package matrices;

public class Persona {
    public String nombre = "";

    public Persona(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
