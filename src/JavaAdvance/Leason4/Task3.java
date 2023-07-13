package JavaAdvance.Leason4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Task3 {

    static void bordDate(int day, int month, int year) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");


        GregorianCalendar gregorianCalendar = new GregorianCalendar(year, month, day);
        System.out.println(simpleDateFormat.format(gregorianCalendar.getTime()));


        GregorianCalendar gregorianCalendarToday = new GregorianCalendar();
        System.out.println(simpleDateFormat.format(gregorianCalendarToday.getTime()));


        System.out.println("---------------------------");

        System.out.println("№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = dateFormat.parse("07.07.1985");
        Date date2 = dateFormat.parse("07.07.2023");

        System.out.println("Первая дата: " + date1);
        System.out.println("Вторая дата: " + date2);

        long milliseconds = date2.getTime() - date1.getTime();
        System.out.println("\nРазница между датами в миллисекундах: " + milliseconds);

        // 1000 миллисекунд = 1 секунда
        int seconds = (int) (milliseconds / (1000));
        System.out.println("Разница между датами в секундах: " + seconds);

        // 60 000 миллисекунд = 60 секунд = 1 минута
        int minutes = (int) (milliseconds / (60 * 1000));
        System.out.println("Разница между датами в минутах: " + minutes);

        // 3 600 секунд = 60 минут = 1 час
        int hours = (int) (milliseconds / (60 * 60 * 1000));
        System.out.println("Разница между датами в часах: " + hours);

        // 24 часа = 1 440 минут = 1 день
        int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
        System.out.println("Разница между датами в днях: " + days);

        int mount = (int) (milliseconds / (24 * 60 * 60 * 1000));
        System.out.println("Разница между датами в днях: " + mount);

        int years = (int) (milliseconds / (365 * 24 * 60 * 60 * 1000));
        System.out.println(years);



        System.out.println("№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№№");



        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate today = LocalDate.parse("12 08 2023",dateTimeFormatter);
        System.out.println(today);
        LocalDate bornDate = LocalDate.parse("07 07 1985",dateTimeFormatter);
        System.out.println(bornDate);

        Period period = Period.between(bornDate, today);
        System.out.println(period.getYears());
        System.out.println(period.getDays());
        System.out.println(period.getMonths());



//«Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
//
//        LocalDate today = LocalDate.now(dateTimeFormatter.getZone());
//        System.out.println(today);
//        LocalDate bornDate = LocalDate.of(day, month, year);
//        System.out.println(bornDate);
//
//        Period period = Period.between(bornDate, today);
//        System.out.println(period.getYears());
//        System.out.println(period.getDays());
//        System.out.println(period.getMonths());
//        System.out.println();

//        long milliseconds = today.getTime() - bornDate.getTime();

//        int years = (int) (milliseconds / (365 *  24 * 60 * 60 * 1000));
//        int mount = (int) (milliseconds / (24 * 60 * 60 * 1000));
//        int days = (int) (milliseconds / (24 * 60 * 60 * 1000)); // 24 год *
//        int hours = (int) (milliseconds / (60 * 60 * 1000)); // 3600 сек * 60 хв  * 1000 мс
//        int minutes = (int) (milliseconds / (60 * 1000)); // 60 сек = 1хв
//        int seconds = (int) (milliseconds / (1000));  // 1000 мс = 1 сек
//
//        System.out.println("Років " + years);
//        System.out.println("Місяців " + mount);
//        System.out.println("Днів " + days);
//        System.out.println("Годин " + hours);
//        System.out.println("Хвилин " + minutes);
//        System.out.println("Секунд " + seconds);
//        System.out.println("Мілісекунд " + milliseconds);

        System.out.println();

        System.out.println("---------------------------");

        LocalDate localDateTimeTod = LocalDate.now();
        LocalDate localDateTime = LocalDate.of(year, month, day);
        System.out.println(localDateTime);
        System.out.println(localDateTimeTod);

        long Year = ChronoUnit.YEARS.between(localDateTime, localDateTimeTod);
        long Month = ChronoUnit.MONTHS.between(localDateTime, localDateTimeTod);
        long Days = ChronoUnit.DAYS.between(localDateTime, localDateTimeTod);

        System.out.println("Років " + Year);
        System.out.println("Місяців " + Month);
        System.out.println("Днів " + Days);

    }

    public static void main(String[] args) throws ParseException {

        bordDate(07, 07, 1985);
    }


}


//Завдання 3
//        Спроектуйте та розробте метод, який визначає, скільки часу пройшло із заданої дати.
//        За допомогою цього методи виведіть у консоль,
//        скільки часу пройшло з вашого дня народження у зручному для сприйняття вигляді,
//        наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».