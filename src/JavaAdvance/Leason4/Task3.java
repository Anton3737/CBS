package JavaAdvance.Leason4;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

public class Task3 {

    static void bordDate(int day, int month, int year) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("Поточна дата і час: " + localDate + " " + localTime);

        LocalDate localDate1 = LocalDate.of(year, month, day);
        LocalTime localTime1 = LocalTime.of(0, 0, 0);

        Period periods = Period.between(localDate1, localDate);
//        System.out.println(periods.getYears());
//        System.out.println(periods.getMonths());
//        System.out.println(periods.getDays());

        Duration duration = Duration.between(localTime1, localTime);
//        System.out.println(duration.toHours());
//        System.out.println(duration.toMinutes());
//        System.out.println(duration.getSeconds());
//        System.out.println(duration.getNano());

        System.out.println("Вам виповнилося " + periods.getYears() + " років, " + periods.getMonths() + " місяці, " + periods.getDays() +
                " днів, " + duration.toHours() + " години, " + duration.toMinutes() + " хвилин та " + duration.getSeconds() + " секунд");

    }

    public static void main(String[] args) throws ParseException {

        bordDate(06, 11, 1949);
    }

}


//Завдання 3
//        Спроектуйте та розробте метод, який визначає, скільки часу пройшло із заданої дати.
//        За допомогою цього методи виведіть у консоль,
//        скільки часу пройшло з вашого дня народження у зручному для сприйняття вигляді,
//        наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».