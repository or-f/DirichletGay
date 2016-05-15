package com.example.user.appadd;

import java.sql.Date;
import java.sql.Time;

/**
 * Created by user on 14/05/2016.
 */

public class Reminder {
    Date date;
    Time time;
    String description;

    public Reminder(Date date,String des) {

        this.date = date;
        description=des;
        time.setHours(12);      // ### deafault time set to 12:00 --> need to decide
        time.setMinutes(0);
        time.setSeconds(0);

    }
    public Reminder(Date date,String des,Time t) {

        this.date = date;
        description=des;
        time=t;

    }
}
