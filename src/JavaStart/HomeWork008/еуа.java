package JavaStart.HomeWork008;

public class еуа {
    static boolean method1() {
        System.out.println("Method1");
        return true;
    }
    static boolean method2() {
        System.out.println("Method2");
        return false;
    }
    public static void main(String[] args) {
        if (method1() & method2())
            System.out.println(2);
    }
}
