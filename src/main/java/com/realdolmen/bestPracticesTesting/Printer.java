package com.realdolmen.bestPracticesTesting;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class Printer{
    private Queue<PrintJob> jobs = new LinkedList<PrintJob>();

    public void addToQueue(PrintJob job){
        jobs.add(job);
    }

    public boolean startPrinting(){
        for(PrintJob job:this.jobs){
            System.out.println(job.toString());
        }
        return true;
    }
}