package it.unibo.oop.lab.mvc;

import java.util.LinkedList;
import java.util.List;

public class ControllerImpl implements Controller {

    private final List<String> sList = new LinkedList<>();

    @Override
    public void setNextString(final String s) throws IllegalArgumentException {
        if (s == null) {
            throw new IllegalArgumentException("argument passed should not be null");
        }
        this.sList.add(s);
    }

    @Override
    public String getNextString() {
        return this.sList.isEmpty() ? null : this.sList.get(this.sList.size() - 1);
    }

    @Override
    public List<String> getStringList() {
        return new LinkedList<String>(this.sList);
    }

    @Override
    public void printString() throws IllegalStateException {
        if(this.sList.isEmpty()) {
            throw new IllegalStateException("the String to be printed has not been initialised");
        }
        System.out.println(this.sList.get(this.sList.size() - 1));
    }

}
