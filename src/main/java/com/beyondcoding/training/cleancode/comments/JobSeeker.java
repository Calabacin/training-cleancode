package com.beyondcoding.training.cleancode.comments;

import com.beyondcoding.training.cleancode.comments.support.Job;
import com.beyondcoding.training.cleancode.comments.support.Person;

public class JobSeeker {

    public void seek(Person person, Job job){

        if(isQualifiedForThe(job, person)){
            person.applyFor(job);
        }

    }

    private boolean isQualifiedForThe(Job job, Person person) {
        return person.hasRelatedDegree(job) &&
                person.getYearsOfWorkingExperience(job);
    }

}
