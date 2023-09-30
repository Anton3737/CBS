package SomeTask;

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
            String[] arr = {"Earth, SomeTask.Mars, Jupiter"};
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
            System.out.println(firstNum * 10);
            return firstNum * 10;
        } else
            System.out.println((firstNum + 1) * 10);
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
        if (ticket != 0) {
            if (ticket >= 200) {
                System.out.print("coin ");
            }
            if (ticket % 10 == 0) {
                System.out.print("crystall ");
            }
            if (ticket % 10 == 7) {
                System.out.print("chip ");
            }
        }
        return "";
    }

    public boolean isHangarOk(int side1, int side2, int price) {

        int P = side1 * side2;
//        int cost = P * price;

        if (P > 1500)

            if (P >= 1500 && side1 < side2 * 2 && side2 < side1 * 2 && price <= 1000 * P) {
                return true;
            }
        return false;
    }


    public double[] solve(int a, int b, int c) {
        double[] doublesArray;
        double disc = b * b - 4 * a * c;
        if (disc > 0) {
            doublesArray = new double[2];
            doublesArray[0] = (-b - Math.sqrt(disc)) / (2 * a);
            doublesArray[1] = (-b + Math.sqrt(disc)) / (2 * a);
        } else if (disc == 0) {
            doublesArray = new double[1];
            doublesArray[0] = -b / (2 * a);
        } else {
            doublesArray = new double[0];
        }
        return doublesArray;
    }


    public String evenOrOdd(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }


    public int findMin(int[] triple) {
        System.out.println(Math.min(triple[0], Math.min(triple[1], triple[2])));
        return Math.min(triple[0], Math.min(triple[1], triple[2]));
    }


    public int translate(String romanNumber) {
        String tmp = romanNumber.replace(" ", "").toUpperCase();
        System.out.println(tmp);
        switch (tmp) {
            case ("I"):
                return 1;
            case ("II"):
                return 2;
            case ("III"):
                return 3;
            case ("IV"):
                return 4;
            case ("V"):
                return 5;
            case ("VI"):
                return 6;
            case ("VII"):
                return 7;
            case ("VIII"):
                return 8;
            case ("IX"):
                return 9;
            case ("X"):
                return 10;
            case ("XI"):
                return 11;
            case ("XII"):
                return 12;
            default:
                return -1;
        }
    }


    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            String tmp = prices[i] + ".jup.";
            System.out.println(tmp);
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] = (prices[i] * 2f);
            } else if (prices[i] >= 1000) {
                prices[i] = (prices[i] * 1.5f);
            }
        }
        String tmp = Arrays.toString(prices);
        System.out.println(tmp);
    }

    public int[] findMinMaxPrices(int[] prices) {
        int[] newArray;
        int tpm = 0;
        int lenght = prices.length;
        if (prices.length != 0) {
            for (int i = 0; i < lenght - 1; i++) {
                for (int j = 0; j < lenght - i - 1; j++) {
                    if (prices[j] > prices[j + 1]) {
                        int tmp = prices[j];
                        prices[j] = prices[j + 1];
                        prices[j + 1] = tmp;
                    }
                }
            }

            newArray = new int[2];
            newArray[0] = prices[0];
            newArray[1] = prices[prices.length - 1];


            if (newArray[0] == newArray[1]) {
                int[] newArrays = {newArray[0]};
                newArrays[0] = newArray[0];
                return newArrays;
            }
            return newArray;
        } else {
            return prices;
        }
    }


    public int getMinPriceCount(int[] prices) {
        int[] newArray;
        int length = prices.length;
        int loopMin = 0;
        if (prices.length != 0) {
            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    if (prices[j] > prices[j + 1]) {
                        int tmp = prices[j];
                        prices[j] = prices[j + 1];
                        prices[j + 1] = tmp;
                    }
                }
            }
            newArray = new int[2];
            newArray[0] = prices[0];
            newArray[1] = prices[prices.length - 1];
            if (newArray[0] == newArray[1]) {
                return 1;
            } else {
                for (int k = 0; k < prices.length; k++) {
                    if (prices[k] == newArray[0]) {
                        loopMin++;
                    }
                }
                return loopMin;
            }
        }
        return 0;
    }


    public int[] removePrice(int[] prices, int toRemove) {
        List<Integer> removeList = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                removeList.add(prices[i]);
            }
        }
        int[] removeArray = new int[removeList.size()];
        for (int i = 0; i < removeList.size(); i++) {
            removeArray[i] = removeList.get(i);
        }
        System.out.println(removeList);
        return removeArray;
    }


    public int[] leavePrice9(int[] prices) {
        if (prices.length != 0) {
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < prices.length; i++) {
                if (Math.abs(prices[i]) % 10 == 9) {
                    integerList.add(prices[i]);
                }
            }
            int[] array = new int[integerList.size()];
            for (int i = 0; i < integerList.size(); i++) {
                array[i] = integerList.get(i);
            }
            return array;
        } else
            return prices;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {

        int length = showcaseStocks.length + warehouseStocks.length;
        String[] newStringArray = new String[length];

        if (length != 0) {
            for (int i = 0; i < showcaseStocks.length; i++) {
                newStringArray[i] = showcaseStocks[i];
            }

            for (int j = showcaseStocks.length; j < length; j++) {
                newStringArray[j] = warehouseStocks[j - showcaseStocks.length];
            }
            return newStringArray;
        } else
            return newStringArray;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int resSum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= minPrice && prices[i] <= maxPrice) {
                resSum += prices[i];
            }
        }
        return resSum;
    }


    public String getCheapStocks(String[] stocks) {
        String res = "";
        for (int i = 0; i < stocks.length; i++) {
            String tmp = stocks[i].toString();
            String[] strings = tmp.split(" ");
            int price = Integer.parseInt(strings[1]);
            if (price < 200) {
                res += strings[0] + " ";
            }
        }
        System.out.println(res);
        return res;
    }

    public String drawQuad(int n) {
        String res = "";
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                res = "*";
                j++;
                System.out.print(res);
            }
            res = "\n";
            i++;
            System.out.print(res);
        }
        return res.toString();
    }


    public String drawRect(int width, int height, char c) {
        String res = "";
        int i = 1;
        while (i <= height) {
            int j = 1;
            while (j <= width) {
                res = String.valueOf(c);
                j++;
                System.out.print(res);
            }
            res = "\n";
            i++;
            System.out.print(res);
        }
        return res.toString();
    }


    public String drawLine(int length) {
        String res = "";
        int i = 1;
        while (i <= length) {
            if (i % 2 == 1) {
                res += "*";
            } else {
                res += "#";
            }
            i++;
        }
//        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {

//        String[] names = new String[]{"hter", "pou", "diz"};
//        int[] prices1 = {10, 700, 50, 500};
//        int[] prices = {49, 10, 59, 14, 29, 59, 9, 39, 51, 99, 43};
//        int[] prices2 = {500, 400, 200};
//         new String[]{"SomeTask.Mars", "Earth", "Jupiter"};
//        String[] names = {"gun 500", "firebow 70", "pixboom 200"};
//        String[] planets1 = new String[]{"gun", "bow"};
//        String[] planets2 = new String[]{"firegun"};
//
        HarekDataMaker harekDataMaker = new HarekDataMaker();


//        harekDataMaker.drawRect(2, 3, 'X');
        harekDataMaker.drawLine(5);

//        harekDataMaker.drawQuad(4);

//        harekDataMaker.getCheapStocks(names);

//        harekDataMaker.getPricesSum(prices1, 10, 50);
//        harekDataMaker.getPricesSum(prices2, 10, 50);

//        harekDataMaker.mergeStocks(planets1, planets2);
//        harekDataMaker.leavePrice9(prices);

//        harekDataMaker.roundSpeed(129);

//        harekDataMaker.removePrice(prices, 100);
//        harekDataMaker.getMinPriceCount(prices);
//        harekDataMaker.findMinMaxPrices(prices);

//        harekDataMaker.translate("I");
//        harekDataMaker.translate(" X I");
//        harekDataMaker.translate("iX ");
//        harekDataMaker.translate("XX");


//        harekDataMaker.findMin(new int[]{1, 10, 3});
//        harekDataMaker.findMin(new int[]{50, 4, 100});


//        harekDataMaker.evenOrOdd(10);
//        harekDataMaker.evenOrOdd(5);

//        harekDataMaker.solve(1, -2, -3);
//        harekDataMaker.solve(1, 12, 36);
//        harekDataMaker.solve(5, 3, 7);

//        harekDataMaker.getMyPrizes(10);

//        повертає true
//        harekDataMaker.isHangarOk(100, 75, 100000);
//        повертає false
//        harekDataMaker.isHangarOk(100, 20, 10000);

//        harekDataMaker.calculateMaxPower();
//
//        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
//        System.out.println("###");
//
//        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));

//        System.out.println(harekDataMaker.roundSpeed(4));


    }
}
