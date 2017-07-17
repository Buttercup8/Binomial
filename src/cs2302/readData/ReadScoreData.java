package cs2302.readData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by bsetzer on 10/15/2014.
 */
public class ReadScoreData {

    public static void main(String[] args) throws FileNotFoundException {
        File infile = new File("scores.txt");
        try(Scanner inscan = new Scanner(infile)) {
            int numberOfPeople = 0;
            int totalOfScores = 0;
            int totalOfSquaredScores = 0;
            while(inscan.hasNext()) {
                String firstName = inscan.next();
                String lastName = inscan.next();
                int score = inscan.nextInt();  // gets the next token and converts
                                                // it to an int
                System.out.println("Name: " + lastName + ", " + firstName);
                System.out.println("  Score: " + score);
                numberOfPeople++;
                totalOfScores += score;
                // totalOfScores = totalOfScores + score;
                totalOfSquaredScores += score*score;
            }
            // after the loop we can print statistics
            System.out.println("Total number of people is " + numberOfPeople);
            double average = ((double)totalOfScores)/numberOfPeople;
            System.out.println("Average score: " + average);
            double stddevNum = Math.sqrt(numberOfPeople* totalOfSquaredScores - totalOfScores*totalOfScores);
            double stdev = stddevNum / numberOfPeople;
            System.out.println("Standard deviation is " + stdev);
        }
    }

}
