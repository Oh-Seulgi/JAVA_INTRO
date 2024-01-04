package method;

public class Overloading2 {

    public static void main(String[] args) {
        add(1,1.2);
        add(1.2,2);
    }

    private static void add(int a, double b) {
        System.out.println("int a, double b");
    }

    private static void add(double a, int b) {
        System.out.println("double a, int b");
    }
}
