package io.nology.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Prints out the contents of a file!
 */
public class FilePrinter {

    /**
     * The path to the file to print.
     */
    private String filePath;

    /**
     * A {@link List} of lines from the file
     */
    private List<String> fileLines;

    /**
     * Constructor, takes the file to print.
     * @param filePath
     */
    public FilePrinter(String filePath) {
        this.filePath = filePath;
        this.fileLines = loadFile();
    }

    /**
     * Get the contents of the file as a {@link List} of Strings.
     * @return
     */
    private List<String> loadFile() {
        List<String> lines = new ArrayList<>();
        // uncomment line to start
//        lines = Files.readAllLines(Paths.get( this.filePath ));
        return lines;
    }

    /**
     * Print out the file to standard out.
     */
    public void printOutFile() {
        printOutFile( false );
    }

    public void printOutFile(boolean includeNumbers) {
        System.out.println("Contents of file: " + filePath);
        int lines = 1;
        for (String line : fileLines) {
            if( includeNumbers ) {
                System.err.print(lines++ + ".");
            }
            System.out.print("\t"+ line + "\n");
        }
    }

}
