public class RecursiveFibonacci {

    /**
     * Determines the Fibonacci value at the given index.
     *
     * @param index the n-th term in the series (zero based)
     * @return the value at index.  If index is sufficiently large, this might exceed Integer.MAX_VALUE
     */
    public static int fibonacci(int index) {
        // two base cases
        if (index == 0) return 0;
        else if (index == 1) return 1;
        // and a recursive case
        else return fibonacci(index - 1) + fibonacci(index - 2);

    }

}