package cs2302.stringReplacement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Owner on 10/22/2014.
 */
public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length != 4) {
            System.out.println("This program takes exactly four command line arguments");
            System.out.println("The arguments should be:");
            System.out.println("input-file-name  output-file-name  key-string  replacement-string");
            System.exit(1);
        }

            String inputFileName = args [0];
            String outputFileName = args [1];
            String keyString = args [2];
            String replacementString = args [3];

            File inputFile = new File(inputFileName);
        if (!inputFile.exists()) {
            System.out.println("Input file does not exist: " + inputFileName);
            System.exit(2);
        }

            File outputFile = new File(outputFileName);
        if (outputFile.exists()) {
            System.out.println("Output file already exists: " + outputFile);
            System.exit(3);
        }
          try(
               Scanner inscan = new Scanner(inputFile);
               PrintWriter outwriter = new PrintWriter(outputFile);
                  ) {
              while(inscan.hasNext()) {
                  String line = inscan.nextLine();
                  String modifiedLine = line.replaceAll(keyString, replacementString);
                  outwriter.println(modifiedLine);
              }


              }
          }
        }



