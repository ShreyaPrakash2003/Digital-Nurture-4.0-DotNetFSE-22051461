public class Singleton {
    public static Singleton instance = new Singleton(); 
    
    private Singleton() {
        System.out.println("Singleton Created.");
    }

    public void helloWorld() {
        System.out.println("Hello World!");
    }
}
