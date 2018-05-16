package DatesAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by meght on 4/14/2018.
 */
public class ParsingDateAndTime {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 01 2018",formatter);
        LocalTime time = LocalTime.parse("10:00");

        System.out.println(date);
        System.out.println(time);

        String text = date.format(formatter);
        System.out.println(text);
    }
}
