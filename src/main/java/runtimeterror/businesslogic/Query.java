package runtimeterror.businesslogic;

import runtimeterror.utilities.DateTime;
import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class Query {
    private int query_id;
    private int customer_id;
    private DateTime date_time;
    private String query_content;

    public Query(int customer_id, String query_content) throws FileNotFoundException {
        this.query_id = IdDispenser.getID();
        this.customer_id = customer_id;

        LocalDateTime now = LocalDateTime.now();
        date_time = new DateTime(now.getSecond(), now.getMinute(), now.getHour(), now.getDayOfMonth(),
                now.getMonthValue(), now.getYear());

        this.query_content = query_content;
    }
}
