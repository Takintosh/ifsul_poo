package codificarDiagrama;

public class funcionario extends persona {

    private float sueldo;

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public float calculaImpuesto(){
        return (float) (this.sueldo*0.03);
   }
   
    @Override
    public void imprimeDatos(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Nacimiento: "+this.getNacimiento());
        System.out.println("Impuesto: "+this.calculaImpuesto());
    }
    
}
