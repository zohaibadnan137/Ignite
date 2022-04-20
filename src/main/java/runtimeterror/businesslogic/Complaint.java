package runtimeterror.businesslogic;

import runtimeterror.utilities.DateTime;
import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class Complaint {
    private final int complaint_id;
    private final int customer_id;
    private final DateTime date_time;
    private final String complaint_content;
    private String status;

    public Complaint(int customer_id, String complaint_content) throws FileNotFoundException {
        this.complaint_id = IdDispenser.getID();
        this.customer_id = customer_id;

        LocalDateTime now = LocalDateTime.now();
        date_time = new DateTime(now.getSecond(), now.getMinute(), now.getHour(), now.getDayOfMonth(),
                now.getMonthValue(), now.getYear());

        this.complaint_content = complaint_content;
        status = "Active";
    }

    public int getComplaintId() {
        return complaint_id;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public DateTime getComplaintDateTime() {
        return date_time;
    }

    public String getComplaintContent() {
        return complaint_content;
    }

    public String getStatus() {
        return status;
    }

    public void closeComplaint() {
        status = "Closed";
    }
}
