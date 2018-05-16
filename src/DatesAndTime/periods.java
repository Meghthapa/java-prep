package DatesAndTime;

import java.time.*;

/**
 * Created by meght on 4/14/2018.
 */
public class periods {
    public static void main(String[] args) {
        LocalDate start= LocalDate.of(2018, Month.JANUARY,01);
        LocalDate end = LocalDate.of(2018,Month.APRIL,30);
        Period period = Period.ofWeeks(1);


        cleanAnimalCage(start,end,period);
        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
        //System.out.println(LocalTime.now().plus(period));// unsupported unit day

        Period yearOfMonth = period.plusMonths(1).plusYears(1);
        System.out.println(yearOfMonth);



    }
    public static void cleanAnimalCage(LocalDate start,LocalDate end,Period period){
        while (start.isBefore(end)){
            System.out.println("Need to clean the cage on date="+ start);
            start = start.plus(period);
        }
    }
}
