package lista1.ex8;

public class financiero {

    private funcionario[] funcionarios = new funcionario[10];
    
    public void crearFun()
	{
		funcionarios[0] = new nivelBasico();
		funcionarios[1] = new nivelBasico();
		funcionarios[2] = new nivelBasico();
		funcionarios[3] = new nivelBasico();
		funcionarios[4] = new nivelMedio();
		funcionarios[5] = new nivelMedio();
		funcionarios[6] = new nivelMedio();
		funcionarios[7] = new nivelMedio();
		funcionarios[8] = new universitario();
		funcionarios[9] = new universitario();
	}
    
    public void calcular()
    {
        double basico = 0.0;
        double medio = 0.0;
        double graduado = 0.0;
        double total = 0.0;
        
        for (funcionario fun : funcionarios) {
            
            if (fun instanceof universitario) {   
                universitario u = (universitario) fun;
                graduado += u.getIngreso();
                total += u.getIngreso();                
                
                continue;
            }
            
            if (fun instanceof nivelMedio) {
                
                nivelMedio m = (nivelMedio) fun;
                medio += m.getIngreso();
                total += m.getIngreso();
                                
                continue;
            }
            
            if (fun instanceof nivelBasico) {
                
                nivelBasico b = (nivelBasico) fun;
                basico += b.getIngreso();
                total += b.getIngreso();
                
                continue;
            }
                      
        }
        
        System.out.println("basico: " + basico);
        System.out.println("medio: " + medio);
        System.out.println("graduado: " + graduado);
        System.out.println("total: " + total);
    }
    
}
