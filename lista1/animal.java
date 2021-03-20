package lista1;

public class animal {

    private String nombre, sonido;
    private int edad;

    public int setNombre(String nombre) {
        this.nombre = nombre;
        return 1;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSonido() {
        return sonido;
    }

}
