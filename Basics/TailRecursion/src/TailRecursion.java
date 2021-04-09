public class TailRecursion {

    /* first value printed will be 0 */
    public static void recurseFirst(int n) {
        if (n > 0) recurseFirst(n - 1);
        System.out.println(n);
    }

    /* first value printed will be n */
    public static void recurseLast(int n) {
        System.out.println(n);
        if (n > 0) recurseLast(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Make recursive call before processing data");
        recurseFirst(5);
        System.out.println("Make recursive call after processing data - tail recursion");
        recurseLast(5);

    }

}