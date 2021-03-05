package aula2;

public class vehiculo {

    private String placa, chasis, color, defecto;
    
	public int setPlaca(String placa) {
        this.placa = placa;
        return 1;
    }
    public String getPlaca() {
        return placa;
    }

    public int setChasis(String chasis) {
        this.chasis = chasis;
        return 1;
    }
    public String getChasis() {
        return chasis;
    }
    
    public int setColor(String color) {
        this.color = color;
        return 1;
    }
    public String getColor() {
        return color;
    }

    public int setDefecto(String defecto) {
        this.defecto = defecto;
        return 1;
    }
    public String getDefecto() {
        return defecto;
    }

}
