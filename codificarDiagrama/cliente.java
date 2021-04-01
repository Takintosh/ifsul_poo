package codificarDiagrama;

public class cliente extends persona {

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public void imprimeDatos(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Nacimiento: "+this.getNacimiento());
        System.out.println("getCodigo: "+this.getCodigo());
    }
    
}
