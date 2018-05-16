package DatesAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * Created by meght on 4/14/2018.
 */
public class FormatDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2010, Month.APRIL,1);
        LocalTime time = LocalTime.of(11,00,00);
        LocalDateTime localDateTime= LocalDateTime.of(date,time);

        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println((localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortFormater = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter MediumFormater = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(shortFormater.format(date));
        System.out.println(shortFormater.format(localDateTime));
        System.out.println(MediumFormater.format(localDateTime));
        //System.out.println(shortFormater.format(time));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd,yyyy,hh:mm");
        System.out.println(localDateTime.format(formatter));

        SimpleDateFormat sf= new SimpleDateFormat("hh:mm:ss");
        System.out.println(sf.format(new Date()));

    }
}
