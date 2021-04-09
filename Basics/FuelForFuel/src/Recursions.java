public class Recursions {

    /**
     * Determines n! (n-factorial) using a recursive solution.
     *
     * @param n the initial value undergoing the factorial process.
     * @return the factorial of n.  If n is sufficiently large, this might exceed Integer.MAX_VALUE
     */
    public static int factorial(int n) {
        // base case(s) of 0 and 1 by definition return 1
        if (n == 0 || n == 1) return 1;
            // recursive case, method invokes itself
        else return n * factorial(n - 1);
    }

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

    /**
     * Calculates the fuel needed to launch a rocket of the given mass.
     * @param mass rocket payload >= 0
     * @return amount of fuel to launch mass + fuel
     */
    public static int calculateFuel(int mass) {
        int fuel = mass / 3 - 2;
        if (fuel <= 0) return 0;
        else return fuel + calculateFuel(fuel);

    }


}