package runtimeterror.businesslogic;

import runtimeterror.utilities.DateTime;
import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class Query {
    private final int query_id;
    private final int customer_id;
    private final DateTime date_time;
    private final String query_content;
    private String status;

    public Query(int customer_id, String query_content) throws FileNotFoundException {
        this.query_id = IdDispenser.getID();
        this.customer_id = customer_id;

        LocalDateTime now = LocalDateTime.now();
        date_time = new DateTime(now.getSecond(), now.getMinute(), now.getHour(), now.getDayOfMonth(),
                now.getMonthValue(), now.getYear());

        this.query_content = query_content;
        status = "Active";
    }

    public int getQueryId() {
        return query_id;
    }

    public int getCustomerId() {
        return customer_id;
    }

    private DateTime getQueryDateTime() {
        return date_time;
    }

    private String getQueryContent() {
        return query_content;
    }

    private String getStatus() {
        return status;
    }

    private void closeQuery() {
        status = "Closed";
    }
}
