package lista1.ex4;

public class zoo {

    private animal[] jaulas = new animal[10];
    
    public void crearJaula()
	{
		jaulas[0] = new perro();
		jaulas[1] = new caballo();
		jaulas[2] = new perezoso();
		jaulas[3] = new perro();
		jaulas[4] = new caballo();
		jaulas[5] = new perezoso();
		jaulas[6] = new perro();
		jaulas[7] = new caballo();
		jaulas[8] = new perezoso();
		jaulas[9] = new perro();
	}
    
    public void seleccionarJaula()
    {
        for (animal jaula : jaulas) {
            jaula.sonido();
            if (jaula instanceof caballo) {
                caballo c = (caballo) jaula;
                c.correr();
            } else if (jaula instanceof perro) {
                perro c = (perro) jaula;
                c.correr();
            }
        }
    }
    
}
