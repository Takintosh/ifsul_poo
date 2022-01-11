package aula4_b;

public class Aula4 {

    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.setNome("Puppy");
        c.setCor("Preto");
        c.setPeso(5300);

        Clinica cl = new Clinica();
        cl.setNome("Crazy Pet");
        cl.setEndereco("Rua dos Cachorros Nº 123");
        cl.setTelefone(123456789);

        Veterinario v = new Veterinario();
        v.setNome("Fulano");
        v.setClinica("Crazy Pet");
        v.setNconsulta(1);
        v.setCrm(12345);

        Consulta co = new Consulta();
        co.setNconsulta(1);
        co.setNomeVeterinario("Fulano");
        co.setHorario("16:30 hs");

        System.out.println("Dados da Consulta");
        System.out.println("-----------------");
        System.out.println("Clinica: " + cl.getNome());
        System.out.println("Endereço: " + cl.getEndereco());
        System.out.println("Telefone: " + cl.getTelefone());
        System.out.println("Nº Consulta: " + co.getNconsulta());
        System.out.println("Horario: " + co.getHorario());
        System.out.println("Veterinario: " + v.getNome() + " | CRM: " + v.getCrm());
        System.out.println("Nome do cachorro: " + c.getNome());
        System.out.println("Cor do cachorro: " + c.getCor());
        System.out.println("Peso do cachorro: " + c.getPeso() + "g.");

    }

}