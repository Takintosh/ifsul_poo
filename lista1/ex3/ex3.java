package lista1.ex3;

public class ex3 {

    public static void main(String[] args) {
        
        veterinario veterinario = new veterinario();
        
        perro perro = new perro();
        caballo caballo = new caballo();
        perezoso perezoso = new perezoso();
        
        veterinario.examinar(perro);
        veterinario.examinar(caballo);
        veterinario.examinar(perezoso);
                
    }
    
}
