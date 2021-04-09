public class Fibonacci {

    private static int calls = 0;

    public static int fibonacci(int n) {
        System.out.println("calculating fibonacci "+n);
        calls++;
        if (n == 0 || n == 1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println("Total calls: "+calls);
    }
}