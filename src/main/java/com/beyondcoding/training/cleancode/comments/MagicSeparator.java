package com.beyondcoding.training.cleancode.comments;

import com.beyondcoding.training.cleancode.comments.support.EnumType;
import com.beyondcoding.training.cleancode.comments.support.Enumerated;
import com.beyondcoding.training.cleancode.comments.support.InstanceType;

public class MagicSeparator {

    // this practice goes against best practices,
    // but let's try to live with it
    // this combines values together, otherwise
    // we would need a new row for each value
    public static final String MAGIC_SEPARATOR = "!-:-!";



    // TODO consider this, do we really need it ,
    // does it bring more good or bad?
    @Enumerated()
    private InstanceType instanceType;

}
