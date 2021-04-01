package codificarDiagrama;

public class diagrama {

    public static void main(String[] args) {
        
        registrarPersonas cp = new registrarPersonas();
        
        persona cliente = new cliente();
        cliente.setNombre("Nombre");        
        cliente.setNacimiento("01/01/2000");
        
        funcionario fun = new funcionario();
        fun.setNombre("Nombre");        
        fun.setNacimiento("01/01/2000");
        fun.setSueldo(1000);
        
        gerente ge = new gerente();
        ge.setNombre("Nombre");        
        ge.setNacimiento("01/01/2000");
        ge.setArea("CEO");
        ge.setSueldo(5000);
        
        cp.registrarPersona(cliente);
        cp.registrarPersona(fun);
        cp.registrarPersona(ge);
                
        cp.imprimepersonas();
                
    }
    
}
