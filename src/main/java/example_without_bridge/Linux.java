package example_without_bridge;

public abstract class Linux implements Plataforma {
    @Override
    public void printPlataforma() {
        System.out.println("Linux");
    }
}
