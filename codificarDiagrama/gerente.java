package codificarDiagrama;

public class gerente extends funcionario {

    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public float calculaImpuesto(){
        return (float) (this.getSueldo()*0.05);
    }
    
    @Override
    public void imprimeDatos(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Nacimiento: "+this.getNacimiento());
        System.out.println("Sueldo: "+this.getSueldo());
        System.out.println("Impuesto: "+this.calculaImpuesto());
        System.out.println("Area: "+this.getArea());
    }
    
}
