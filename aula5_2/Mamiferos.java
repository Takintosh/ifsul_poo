package aula5_2;

abstract class Mamiferos {

    public static String som;

    public String som() {
        return "Som";
    }

    public static void main(String[] args) {
        Gato g = new Gato();
        Perro p = new Perro();
        Caballo c = new Caballo();
        Lobo l = new Lobo();
        Ciervo ci = new Ciervo();
        Ballena b = new Ballena();

        System.out.println(g.som() + ": Qué Animal hace este sonido? El Gato!");
        System.out.println(p.som() + ": Qué Animal hace este sonido? El Perro!");
        System.out.println(c.som() + ": Qué Animal hace este sonido? El Caballo!");
        System.out.println(l.som() + ": Qué Animal hace este sonido? El Lobo!");
        System.out.println(ci.som() + ": Qué Animal hace este sonido? El Ciervo!");
        System.out.println(b.som() + ": Qué Animal hace este sonido? La Ballena!");

    }


}