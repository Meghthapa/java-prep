package DatesAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;

/**
 * Created by meght on 4/14/2018.
 */
public class CreatingDateAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2018, Month.APRIL,14);
        LocalTime localTime = LocalTime.of(10,30);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);


        // before java 8
        UseDateTime date = new UseDateTime();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,calendar.APRIL,14);
        java.util.Date april = calendar.getTime();
        System.out.println(april);


    }
}
