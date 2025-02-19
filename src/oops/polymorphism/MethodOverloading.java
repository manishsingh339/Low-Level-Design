package oops.polymorphism;

class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {  // Overloaded method
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.add(5, 10));      // Calls first method
        System.out.println(math.add(5, 10, 15));  // Calls overloaded method
    }
}
