package com.realdolmen.bestPracticesTesting;

import javax.print.attribute.PrintJobAttribute;
import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class Person extends PrintJob {

    public final String firstName, lastName;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Graphics getGraphics() {
        return null;
    }

    public Dimension getPageDimension() {
        return null;
    }

    public int getPageResolution() {
        return 0;
    }

    public boolean lastPageFirst() {
        return false;
    }

    public void end() {

    }
}
