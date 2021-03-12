package aula4;

public class FabricaLampara {

    public class Fluorescente implements Lampara {
        @Override
        public void encender() {
            System.out.println("Lámpara fluorescente encendida!");
        }
        @Override
        public void apagar() {
            System.out.println("Lámpara fluorescente apagada!");
        }
    }

    public class Incandescente implements Lampara {
        @Override
        public void encender() {
            System.out.println("Lámpara incandescente encendida!");
        }
        @Override
        public void apagar() {
            System.out.println("Lámpara incandescente apagada!");
        }
    }

    public Lampara construir(boolean fluorescente) {
        if(fluorescente) {
            return new Fluorescente();
        } else {
            return new Incandescente();
        }
    }
    
}
