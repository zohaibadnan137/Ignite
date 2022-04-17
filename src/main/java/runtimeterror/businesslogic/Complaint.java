package runtimeterror.businesslogic;

import runtimeterror.utilities.DateTime;
import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class Complaint {
    private int complaint_id;
    private int customer_id;
    private DateTime date_time;
    private String complaint_content;

    public Complaint(int customer_id, String complaint_content) throws FileNotFoundException {
        this.complaint_id = IdDispenser.getID();
        this.customer_id = customer_id;

        LocalDateTime now = LocalDateTime.now();
        date_time = new DateTime(now.getSecond(), now.getMinute(), now.getHour(), now.getDayOfMonth(),
                now.getMonthValue(), now.getYear());

        this.complaint_content = complaint_content;
    }
}
