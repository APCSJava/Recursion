import java.util.Arrays;

public class Fibonacci {

    public static int fibonacci(int n, int[] data) {
        if (data[n] == -1) { // not yet known
            data[n] = fibonacci(n - 1, data) + fibonacci(n - 2, data);
        }
        // data for n has been calculated and stored in the array
        return data[n];
    }

    public static void main(String[] args) {
        int target = 10;
        int[] memoData = new int[target + 1]; // holds 0 - 10, inclusive
        Arrays.fill(memoData, -1); // set all values to -1
        memoData[0] = 0;
        memoData[1] = 1;
        System.out.println(fibonacci(target, memoData));
    }
}