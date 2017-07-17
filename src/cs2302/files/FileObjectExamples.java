package cs2302.files;

import java.io.File;

/**
 * Created by Alena Whitlock on 10/13/2014.
 *
 * Create some File objects and try out some of the available methods.
 *
 */
public class FileObjectExamples {

    public static void main(String[] args) {
        File dictionary = new File("6of12.txt");
        // this file object uses a RELATIVE PATH to identify a file
        //   a relative path identifies a file relative to the WORKING DIRECTORY
        //   of the program
        // "6of12.txt" references a file in the working directory
        //
        //  The working directory of a Java program in IntelliJ IDEA is
        //  the project directory (though you can change that)
        System.out.println("Does the dictionary file exist? " + dictionary.exists());
        System.out.println("The dictionary file size is " + dictionary.length());
        System.out.println("The absolute path to the dictionary is " +
                        dictionary.getAbsolutePath());

        File mystery = new File("books/TheAdventureOfWisteriaLodge.txt");
        System.out.println("Does the mystery file exist? " + mystery.exists());
        System.out.println("Is the mystery a directory? " + mystery.isDirectory());

        File sourceCode = new File("src/cs2302/files/FileObjectExamples.java");
        System.out.println("Does the source code exist? " + sourceCode.exists());

        File srcFolder = new File("src");
        System.out.println("Does the src folder exist? " + srcFolder.exists());
        System.out.println("Is the src folder a directory? " + srcFolder.isDirectory());
        System.out.println("The size of the directory is " + srcFolder.length());

        String abspath = "N:\\briefcase-7\\Documents\\public_html\\2302fa14\\extra\\projects\\class-141013\\6of12.txt";
    }

}
