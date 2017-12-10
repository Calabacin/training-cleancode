package com.beyondcoding.prepared.cleancode.conditional.preconditions;

public interface Calculation {

    boolean isNotApplicableTo(int number);

    int calculate(int number);

}
