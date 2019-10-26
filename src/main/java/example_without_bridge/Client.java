package example_without_bridge;

public class Client {
    public static void main(String[] args){
        Windows7x64 win64 = new Windows7x64();
        Windows7x86 win86 = new Windows7x86();

        Linuxx64 lin64 = new Linuxx64();
        Linuxx86 lin86 = new Linuxx86();

        Macx64 mac64 = new Macx64();
        Macx86 mac86 = new Macx86();

        win64.printOS();
        win86.printOS();

        lin64.printOS();
        lin86.printOS();

        mac64.printOS();
        mac86.printOS();
    }
}
