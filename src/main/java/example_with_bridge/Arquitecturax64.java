package example_with_bridge;

public class Arquitecturax64 implements Arquitectura {

    Plataforma plataforma;

    public Arquitecturax64(Plataforma plataforma){
        this.plataforma = plataforma;
    }

    @Override
    public void printOS() {
        plataforma.printPlataforma();
        System.out.println(" x64");
    }
}
