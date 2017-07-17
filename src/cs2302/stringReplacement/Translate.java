package cs2302.stringReplacement;

/**
 * Created by bsetzer on 10/15/2014.
 */
public class Translate {

    public static void main(String[] args) {
//        System.out.println("The number of command line parameters is " + args.length);
//        for(String arg : args) {
//            System.out.println("Argument is " + arg);
//        }
        for(int i = 0; i < args.length; i++ ) {
            System.out.println("Argument number " + i + " is " + args[i]);
        }
        if(args.length != 4) {
            System.out.println("This program takes exactly four command line arguments");
            System.exit(1);
        }
    }
}
