package lista1.ex8;

public class universitario extends nivelMedio {

    private String universitario_inst;

    public String getUniversitario_inst() {
        return universitario_inst;
    }

    public void setUniversitario_inst(String universitario_inst) {
        this.universitario_inst = universitario_inst;
    }
    
    @Override
    public double getIngreso() {
        return super.getIngreso()*2;
    }
    
}
