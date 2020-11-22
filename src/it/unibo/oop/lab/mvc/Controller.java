package it.unibo.oop.lab.mvc;

/**
 * A controller that prints strings and has memory of the strings it printed.
 */
public interface Controller {

    /*
     * This interface must model a simple controller responsible of I/O access. It
     * considers only the standard output, and it is able to print on it.
     * 
     * Write the interface and implement it in a class in such a way that it
     * includes:
     * 
     * 1) A method for setting the next string to print. Null values are not
     * acceptable, and an exception should be produced
     * 
     * 2) A method for getting the next string to print
     * 
     * 3) A method for getting the history of the printed strings (in form of a List
     * of Strings)
     * 
     * 4) A method that prints the current string. If the current string is unset,
     * an IllegalStateException should be thrown
     * 
     */

    /**
     * set the next string to be printed and/or stored.
     * 
     * @param s
     *          the string to be stored
     * @throws IllegalArgumentException
     *          if the s value is null an {@link IllegalArgumentException} is thrown
     */
    void setNextString(final String s) throws IllegalArgumentException;

    /**
     * return the last set string.
     * 
     * @return the last set String
     */
    String getNextString();

    /**
     * return the list of all of the set strings.
     * 
     * @return a list of the set strings
     */
    java.util.List<String> getStringList();

    /**
     * the currently set string is printed on the STDout.
     * 
     * @throws IllegalStateException
     *      if the currently set string is null an {@link IllegalStateException} is thrown;
     *      (e.g. if the first string hasn't been set yet)
     */
    void printString() throws IllegalStateException;
 
}
