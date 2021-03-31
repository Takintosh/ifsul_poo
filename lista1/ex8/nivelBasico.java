package lista1.ex8;

public class nivelBasico extends funcionario {

    private String basico_inst;

    public String getBasico_inst() {
        return basico_inst;
    }

    public void setBasico_inst(String basico_inst) {
        this.basico_inst = basico_inst;
    }
    
    @Override
    public double getIngreso() {
        return super.getIngreso()*1.1;
    }
    
}
