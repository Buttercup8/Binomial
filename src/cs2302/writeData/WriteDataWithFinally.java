package cs2302.writeData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by bsetzer on 10/13/2014.
 */
public class WriteDataWithFinally {
    public static void main(String[] args) throws FileNotFoundException {
        File scoresFile = new File("scores.txt");
        if(scoresFile.exists()) {
            System.out.println("Scores file already exists! " + scoresFile.getName());
            System.out.println("Exiting!");
            System.exit(1);
        }
        PrintWriter scoresPW = new PrintWriter(scoresFile);

        try {

            scoresPW.println("Bob " + " Evans " + 75);
            scoresPW.println("Sue " + " Jones " + 85);

            int compute = 1 / 0;

            scoresPW.println("David " + " Smith " + 90);
        }
        finally {
            scoresPW.close();
        }

    }
}
