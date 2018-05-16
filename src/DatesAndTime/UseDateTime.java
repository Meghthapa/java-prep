package DatesAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by meght on 4/14/2018.
 */
public class UseDateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018, Month.APRIL,01);
        System.out.println(localDate);
        localDate=localDate.plusDays(5).plusMonths(1).plusYears(2);
        System.out.println(localDate);

        LocalTime time = LocalTime.of(10,00);
        System.out.println(time);
        time = time.plusHours(2).plusMinutes(0);
        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.of(2015,01,01,10,00);
        System.out.println(localDateTime);
        localDateTime = localDateTime.plusDays(1).plusMonths(1).plusYears(1).plusHours(2).plusMinutes(0);
        System.out.println(localDateTime);


    }


}
