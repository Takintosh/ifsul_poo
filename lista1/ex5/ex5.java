package lista1.ex5;

public class ex5 {

    public static void main(String[] args) {
        
        nivelMedio f = new nivelMedio();
        
        f.setCodigo("123123123");
        f.setNombre("MEU NOME");
        f.setBasico_inst("Libe");
        f.setMedio_inst("IFSUL");
        
        System.out.println(
                f.getNombre()+"\n"+
                f.getCodigo()+"\n"+     
                f.getMedio_inst()+"\n"+
                f.getBasico_inst()+"\n"
        );
                
    }
    
}
