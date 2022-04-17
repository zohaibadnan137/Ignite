package runtimeterror.utilities;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTime {
    private int seconds;
    private int minutes;
    private int hours;
    private int day;
    private int month;
    private int year;

    private LocalDateTime date_time;
    private String string_date_time;

    public DateTime(int seconds, int minutes, int hours, int day, int month, int year) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        this.day = day;
        this.month = month;
        this.year = year;

        Month m = Month.of(month);

        date_time = LocalDateTime.of(year, m, day, hours, minutes, seconds);
        DateTimeFormatter date_format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        string_date_time = date_time.format(date_format);
    }

    public String getDateTime() {
        return string_date_time;
    }

    public void setDateTime(int seconds, int minutes, int hours, int day, int month, int year) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        this.day = day;
        this.month = month;
        this.year = year;

        Month m = Month.of(month);

        date_time = LocalDateTime.of(year, m, day, hours, minutes, seconds);
        DateTimeFormatter date_format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        string_date_time = date_time.format(date_format);
    }
}
