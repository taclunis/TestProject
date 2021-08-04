package practice;

public class LearnAccessModifiers {

    static public int x = 5;

    public static void main(String[] args) {
        System.out.println(x);
    }

    public static void doSomethingSpecial() {
        int y = x + 10;
        int z = y + x;

        System.out.println(z + y);
    }
}
