package codificarDiagrama;

import java.util.ArrayList;

public class registrarPersonas {

    ArrayList<persona> datos = new ArrayList<>();
    
    public void registrarPersona(persona persona){
        datos.add(persona);
    }
    
    public void imprimepersonas(){
        datos.forEach((persona dato) -> {
            dato.imprimeDatos();
        });
    }
    
}
