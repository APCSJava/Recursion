import java.util.Arrays;

public class Fibonacci {

    private static int[] data;

    public static int fibonacci(int n) {
        if (data[n] == -1) {
            data[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return data[n];
    }

    public static void main(String[] args) {
        int target = 10;
        data = new int[target + 1]; // holds 0 - 10, inclusive
        Arrays.fill(data, -1); // set all values to -1
        data[0] = 0;
        data[1] = 1;
        System.out.println(fibonacci(target));
    }
}