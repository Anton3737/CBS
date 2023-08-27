import java.awt.*;
import java.util.*;
import java.util.List;

public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet) {

        String resultStr = "name - " + name + ", age - " + age + ", planet - " + planet;

        return resultStr;
    }


    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {

        String[] newString = new String[3];
        for (int i = 0; i < 3; i++) {
            newString[i] = aggregateSingle(names[i], String.valueOf(ages[i]), planets[i]);
        }
        return newString;
    }


    public int calculateDistance(int distance) {
        if (distance > 0) {
            int res = distance;

        }
        int res = Math.abs(distance);
        return res;
    }

    public String[] getPlanets(String galaxy) {
        String[] emptyArr = {};
        if (galaxy.equals("DangerBanger")) {
            String[] arr = {"Fobius", "Demius"};
            return arr;
        } else if (galaxy.equals("Miaru")) {
            String[] arr = {"Maux, Reux, Piax"};
            return arr;
        } else if (galaxy.equals("Milkyway")) {
            String[] arr = {"Earth, Mars, Jupiter"};
            return arr;
        }
        return emptyArr;
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth <= 45677) {
            return "Earth";
        } else
            return "Pern";

    }


    public int calculateFuelPrice(String fuel, int count) {
        int other = 50;
        int STAR100 = 70;
        int STAR500 = 120;
        int STAR1000 = 200;

        if (fuel.equals("STAR100")) {
            return STAR100 * count;
        } else if (fuel.equals("STAR500")) {
            return STAR500 * count;
        } else if (fuel.equals("STAR1000")) {
            return STAR1000 * count;
        } else
            return other * count;
    }

    public int roundSpeed(int speed) {
        int firstNum = speed / 10;
        int secNum = speed % 10;
        if (secNum < 5) {
            return firstNum * 10;
        } else
            return (firstNum + 1) * 10;
    }


    public int calculateNeededFuel(int distance) {
        int standart = 1000;
        int fuel = 5;
        if (distance <= 20) {
            return standart;
        } else {
            return standart + (distance - 20) * fuel;
        }
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maxNumber = Math.max(a, Math.max(b, c));
        if (maxNumber < 10) {
            float res = maxNumber * 0.7f;
            System.out.println(res);
        } else if (maxNumber >= 10 && maxNumber <= 100) {
            float res = maxNumber * 1.2f;
            System.out.println(res);
        } else if (maxNumber > 100) {
            float res = maxNumber * 2.1f;
            System.out.println(res);
        } else {
            System.out.println("error");
        }
    }

    public String getMyPrizes(int ticket) {

        if (ticket >= 200) {
            return "coin";
//            if (ticket % 10 == 0) {
//                return "crystall";
//            }
//            if (ticket % 10 == 9) {
//                return "chip";
//            }
        } else {
            return "null";
        }
    }
//    Умови лотереї наступні:

//    якщо номер квитка ділиться на 10 - ви виграли кристал (слово "crystall") +
//    якщо номер квитка закінчується на цифру 7 - ви виграли чіп (слово "chip") +
//    якщо номер квитка більше ніж 200 - ви виграли монету (слово "coin") +
//    Зрозуміло, що за таких умов можна виграти кілька призів одразу.
//
//    Напиши програму, яка приймає номер квитка, та повертає рядок – виграні призи.
//    Кожен виграний приз повинен відокремлюватися рівно одним пробілом.
//    На початку і наприкінці рядка пробілів бути не повинно.
//    Якщо призів кілька, вони повинні йти у вказаному порядку – спочатку "crystall", потім "chip", і в кінці "coin".
//
//    Якщо ти нічого не виграв - поверни порожній рядок.


//    виклик getMyPrizes(10) повертає "crystall"
//    виклик getMyPrizes(77) повертає "chip"
//    виклик getMyPrizes(777) повертає "chip coin"
//    виклик getMyPrizes(54) повертає ""

    public static void main(String[] args) {

//        String[] names = new String[]{"hter", "pou", "diz"};
//        int[] ages = new int[]{30, 35, 70};
//        String[] planets = new String[]{"Mars", "Earth", "Jupiter"};
//
        HarekDataMaker harekDataMaker = new HarekDataMaker();
        harekDataMaker.getMyPrizes(100);
//        harekDataMaker.calculateMaxPower();
//
//        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
//        System.out.println("###");
//
//        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));

//        System.out.println(harekDataMaker.roundSpeed(4));


    }
}
