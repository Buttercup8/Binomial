package cs2302.recursion;

/**
 * Created by Owner on 10/22/2014.
 */
public class Factorial {

    public static void main(String[] args) {
        for(int i = 0; i < 15; i++ ) {
            System.out.println(i + "\t" + factorialIterative(i));
        }
        for(int i = 0; i < 15; i++ ) {
            System.out.println(i + "\t" + factorialRecursive(i));
        }

    }

    public static long factorialIterative(int n) {
        long product = 1;
        for(int i = 1; i <= n; i++ ) {
            product *= i;
        }
        return product;
    }

    /**
     * Returns the factorial of n.
     *
     * @param n  Must be greater than or equal to 0.
     * @return
     */
    public static long factorialRecursive(int n) {
        if( n == 0) {   // base case
            return 1;
        } else {   // complex  case: reduce factorial(n) to computing factorial(n-1)
            // n > 0
            return n * factorialRecursive(n-1);
        }
    }


}

