package it.unibo.oop.lab.mvcio;

import java.io.File;

/**
 * 
 */
public class Controller {

    /*
     * This class must implement a simple controller responsible of I/O access. It
     * considers a single file at a time, and it is able to serialize objects in it.
     * 
     * Implement this class with:
     * 
     * 1) A method for setting a File as current file
     * 
     * 2) A method for getting the current File
     * 
     * 3) A method for getting the path (in form of String) of the current File
     * 
     * 4) A method that gets a String as input and saves its content on the current
     * file. This method may throw an IOException.
     * 
     * 5) By default, the current file is "output.txt" inside the user home folder.
     * A String representing the local user home folder can be accessed using
     * System.getProperty("user.home"). The separator symbol (/ on *nix, \ on
     * Windows) can be obtained as String through the method
     * System.getProperty("file.separator"). The combined use of those methods leads
     * to a software that runs correctly on every platform.
     */
    private File currentFile;

    /**
     * builds a new Controller used to access a file.
     * 
     * the default file is set to output.txt in the user's home folder
     */
    public Controller() {
        this(new File(System.getProperty("user.home") + System.getProperty("file.separator") + "output.txt"));
    }

    /**
     * builds a new Controller used to access the specified file.
     * 
     * @param file
     *          the file which will be accessed
     */
    public Controller(final File file) {
        this.currentFile = file;
    }

    /**
     * sets the current file to read from / write to.
     * 
     * @param file
     *          the file to be accessed
     */
    public void setCurrentFile(final File file) {
        this.currentFile = file; 
    }

    /**
     * returns the current file used to read/write data.
     * 
     * @return returns the current file used to read/write data, null if no files are set
     */
    public File getCurrentFile() {
        return this.currentFile;
    }

    /**
     * returns the path to the file.
     * 
     * @return path to the currently set file, null if no files are set
     */
    public String getFilePath() {
        return this.currentFile.getPath();
    }

    /**
     * prints the specified string to the current file.
     * 
     * @param text
     *          the string to be written in the current file
     * @throws java.io.IOException
     *          if an I/O exception occurs
     */
    public void printToFile(final String text) throws java.io.IOException {
        try (java.io.Writer fw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.currentFile)))) {
            fw.append(text);
        }
    }
}
