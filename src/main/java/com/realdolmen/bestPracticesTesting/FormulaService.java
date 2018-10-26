package com.realdolmen.bestPracticesTesting;

import org.graalvm.compiler.graph.Node;

import javax.inject.Inject;

public class FormulaService {

    private String secondsElapsed;

    private static final String TIME = "5";

    @Inject
    Calculator calculator;

    public void addTimeElapsed(){
        this.secondsElapsed = calculator.add(this.secondsElapsed, TIME);
    }

    public String secondsPassed(){
        return this.secondsElapsed;
    }

    public String numberOfRuns() {
        return calculator.divide(this.secondsElapsed, TIME);
    }

    public void skipAhead(int skipCount){
        this.secondsElapsed = calculator.add(this.secondsElapsed, calculator.multiply(TIME, String.valueOf(skipCount)));
        for(int i = 0; i<skipCount; i++){
            this.addTimeElapsed();
        }
    }
}
