public class Recursions {

    /**
     * Determines n! (n-factorial) using a recursive solution.
     *
     * @param n the initial value undergoing the factorial process.
     * @return the factorial of n.  If n is sufficiently large, this might exceed Integer.MAX_VALUE
     */
    public static int factorial(int n) {
        // base case(s) of 0 and 1 by definition return 1
        if (n==0 || n == 1) return 1;
        // otherwise, call method with n-1
        else return n * factorial(n-1);
    }
    
    
}