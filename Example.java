// Example is not used
public class Example {
    // notUsed is not used
    public static void notUsed() {
        used();
    }

    // used is really used!
    public static void used() {
    }

    // method main is not called in the code
    // args is used!
    public static void main(String[] args) {
        // unusedVar is not used
        int unusedVar = 2;

        // System.out.println(unusedVar);

        System.out.println("Hello " + args[0]);
    }
}

