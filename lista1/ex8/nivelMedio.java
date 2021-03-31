package lista1.ex8;

public class nivelMedio extends nivelBasico {

    private String medio_inst;

    public String getMedio_inst() {
        return medio_inst;
    }

    public void setMedio_inst(String medio_inst) {
        this.medio_inst = medio_inst;
    }
    
    @Override
    public double getIngreso() {
        return super.getIngreso()*1.5;
    }

}
