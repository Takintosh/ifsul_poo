package aula3;

public class persona {

    private String nombre, direccion;

    public int setNombre(String nombre) {
        this.nombre = nombre;
        return 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

}
