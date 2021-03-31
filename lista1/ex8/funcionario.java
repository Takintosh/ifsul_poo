package lista1.ex8;

public class funcionario {

    private String nombre;
    private String codigo;
    private double ingreso = 1000.00;
    private String cargo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public double getIngreso() {
        return ingreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double comision(){
        
        if(cargo.equals("Vendedor")){
            return 250.00;
        }
        if(cargo.equals("Supervisor")){
            return 600.00;
        }
        if(cargo.equals("Gerente")){
            return 1500.00;
        }        
        
        return 0.00;
    }
    
}
