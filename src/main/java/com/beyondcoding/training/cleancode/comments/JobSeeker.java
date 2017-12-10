package com.beyondcoding.training.cleancode.comments;

import com.beyondcoding.training.cleancode.comments.support.Job;
import com.beyondcoding.training.cleancode.comments.support.Person;

public class JobSeeker {

    public void seek(Person person, Job job){

        // if the person is qualified for the job
        if(person.hasRelatedDegree(job) &&
                person.getYearsOfWorkingExperience(job)){
            person.applyFor(job);
        }

    }

}
