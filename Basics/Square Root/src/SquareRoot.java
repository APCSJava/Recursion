public class SquareRoot {

    /* The Babylonian/Newton method */
    public static double root(double value, double guess) {
        double quotient = value / guess;
        if (quotient == guess) return guess;
        else return root(value, (quotient + guess)/2.0);
    }

}