package io.nology.exceptions;

/**
 * Client for calling the {@link FilePrinter}.
 */
public class Client {

    public static final String BOH_RHAPS = "bohemian-rhapsody.txt";
    public static final String LIFE_ON_MARS = "life-on-mars.txt";

    public static void main(String[] args) {

        FilePrinter filePrinter = new FilePrinter(BOH_RHAPS);

        filePrinter.printOutFile();

    }

}
