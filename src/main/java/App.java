public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello DevOps!");

        // Keep container alive
        while (true) {
            Thread.sleep(10000);
        }
    }
}