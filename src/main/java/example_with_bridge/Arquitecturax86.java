package example_with_bridge;

public class Arquitecturax86 implements Arquitectura {

    Plataforma plataforma;

    public Arquitecturax86(Plataforma plataforma){
        this.plataforma = plataforma;
    }

    @Override
    public void printOS() {
        plataforma.printPlataforma();
        System.out.println(" x86");
    }
}
