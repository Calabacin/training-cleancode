package com.beyondcoding.training.cleancode.methods.numberofarguments;

import com.beyondcoding.training.cleancode.methods.numberofarguments.support.Company;
import com.beyondcoding.training.cleancode.methods.numberofarguments.support.Location;
import com.beyondcoding.training.cleancode.methods.numberofarguments.support.Presentation;

import java.time.LocalDateTime;

public class BeyondCodingTrainer {





    public void arrangeTrainingPreparations() {


        prepareNextWeeksPresentation();



        prepareNextWeeks(presentation);



        prepareFor(presentation, nextWeek);



        prepareFor(presentation, company, numberOfDevelopers, nextWeek, vienna);


    }














    private Presentation presentation;
    private LocalDateTime nextWeek;
    private Company company;
    private Integer numberOfDevelopers;
    private Location vienna;



    private void prepareNextWeeksPresentation() { }

    private void prepareNextWeeks(Presentation presentation) { }

    private void prepareFor(Presentation presentation, LocalDateTime nextWeek) { }

    private void prepareFor(Presentation presentation, Company company, Integer numberOfDevelopers, LocalDateTime
            nextWeek, Location vienna) { }

}
