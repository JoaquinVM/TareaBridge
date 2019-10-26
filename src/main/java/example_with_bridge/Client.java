package example_with_bridge;

public class Client {
    public static void main(String[] args){
        Windows windows = new Windows();
        Linux linux = new Linux();
        Mac mac = new Mac();

        Arquitectura win64 = new Arquitecturax64(windows);
        Arquitectura win86 = new Arquitecturax86(windows);

        Arquitectura lin64 = new Arquitecturax64(linux);
        Arquitectura lin86 = new Arquitecturax86(linux);

        Arquitectura mac64 = new Arquitecturax64(mac);
        Arquitectura mac86 = new Arquitecturax86(mac);

        win64.printOS();
        win86.printOS();

        lin64.printOS();
        lin86.printOS();

        mac64.printOS();
        mac86.printOS();
    }
}
