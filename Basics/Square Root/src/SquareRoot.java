public class SquareRoot {

    /* The Babylonian/Newton method */
    public static double root(double value, double guess) {
        double quotient = value / guess;
        if (quotient == guess) return guess;
        else {
            double refined = (quotient + guess)/2.0;
            return root(value, refined);
        }
    }

}