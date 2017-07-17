package cs2302.recursion;

/**
 * Created by Owner on 10/22/2014.
 */
public class Binomaial {

    public static void main(String[] args) {
        System.out.println("binom(0,0) = " + binom(0,0));
        System.out.println("binom(4,4) = " + binom(4,4));
        System.out.println("binom(5,2) = " + binom(5,2));
        System.out.println("binom(15,7) = " + binom(15,7));
        System.out.println("binom(30,15) = " + binom(30,15));
        System.out.println("binom(40,20) = " + binom(40,20));
    }

    public static long binom(int r, int c) {
        if(c == 0) {            // first base case
            return 1;
        } else if( r == c) {    // second base case
            return 1;
        } else {                // complex case reduces to computing the row above
            return binom(r-1,c-1) + binom(r-1,c);
        }
    }
}



