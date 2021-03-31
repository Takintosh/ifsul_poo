package lista1.ex6;

import lista1.ex5.nivelMedio;

public class ex6 {

    public static void main(String[] args) {
        
        nivelMedio f = new nivelMedio();
        
        f.setCodigo("111");
        f.setNombre("Mi Nombre");
        f.setBasico_inst("Basico");
        f.setMedio_inst("Medio");
        
        System.out.println(
                f.getNombre()+"\n"+
                f.getCodigo()+"\n"+     
                f.getMedio_inst()+"\n"+
                f.getBasico_inst()+"\n"
        );
        
        System.out.println("Ingreso: " + f.getIngreso());
        System.out.println("------------------------------------------------------------------------------");
        
        nivelBasico b = new nivelBasico();
        
        b.setCodigo("222");
        b.setNombre("Mi Nombre");
        b.setBasico_inst("Basico");
        
        System.out.println(
                b.getNombre()+"\n"+
                b.getCodigo()+"\n"+
                b.getBasico_inst()+"\n"
        );
        
        System.out.println("Ingreso: " + b.getIngreso());
        System.out.println("------------------------------------------------------------------------------");
        
        universitario u = new universitario();
        
        u.setCodigo("333");
        u.setNombre("Mi Nombre Universitario");
        u.setBasico_inst("Universitario");
        
        System.out.println(
                u.getNombre()+"\n"+
                u.getCodigo()+"\n"+
                u.getBasico_inst()+"\n"+
                u.getMedio_inst()+"\n"
        );
        
        System.out.println("Ingreso: " + u.getIngreso());
                
    }
    
}
