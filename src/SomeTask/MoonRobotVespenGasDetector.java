package SomeTask;

import java.util.*;

public class MoonRobotVespenGasDetector {

    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        String name = firstName.toLowerCase() + " " + lastName.toUpperCase();
        return name;
    }

    public boolean isNameLucky(String name) {
        return name.contains("a") || name.contains("o") || name.contains("SomeTask.A") || name.contains("O");
    }


    public String getNameCode(String name) {
        String code = name.toUpperCase();
        char[] arr = code.toCharArray();
        int tmp = arr.length;
        String first = String.valueOf(arr[0]);
        //        return (arr[0] + "" +arr[tmp-1]).toString() || (arr[0]?arr.length:a );
        return arr.length > 1 ? (arr[0] + "" + arr[tmp - 1]).toString() : first;
    }

    public boolean isMoneyName(String name) {
        char[] arr = name.toCharArray();
        int i = arr[0];
        boolean isDigit = i >= '0' && i <= '9';
        return isDigit;
    }

    public boolean isInvisibleName(String name) {
        return name.isBlank() || name.length() != 0;
    }

    public String makeNamePositive(String name) {
        String tmp = name.toLowerCase();
        String replace = tmp.replace("no", "yes");
        String newString = replace.substring(0, 1).toUpperCase() + replace.substring(1);
        return name.replace("No", "yes").replace("no", "yes").replace("nO", "yes").replace("no", "yes");
    }

    public String makeNameClean(String name) {
        name.trim();
        return "CLEAN" + name + "CLEAN";
    }

    public String makeHalfOfName(String name) {
        return name.substring(0, name.length() / 2);
    }


    public String encode(String name) {
        String firstCode = "NOTFORYOU";
        String lastCode = "YESNOTFORYOU";
        String newName = name.replace("a", "5").replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4");
        String newCodeName = firstCode + newName + lastCode;
        return newCodeName;
    }

    public String decode(String name) {
        //        Scanner sc = new Scanner(System.in);
        //        String name = sc.next();
        String firstCode = "NOTFORYOU";
        String lastCode = "YES";
        String newName = name.replace("5", "a").replace("1", "e").replace("2", "u").replace("3", "i")
                .replace("4", "o").replace(firstCode, "").replace(lastCode, "");
        return newName;
    }


    //    public void createForms(){
    //        Scanner scanner = new Scanner(System.in);
    //        String name = scanner.next();
    //        String secName = scanner.next();
    //        int age = scanner.nextInt() * 10;
    //
    //        String newName = name + "\n" + secName + "\n" +age;
    //        System.out.println(newName.toUpperCase());
    //    }


    public void createForms() {
        try {

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            String secName = scanner.nextLine();
            int age = scanner.nextByte();
            int newAge = age * 10;

            String newName = name + " " + secName + " " + newAge;
            System.out.println(newName);
            System.out.println(name.toUpperCase() + "\n" + secName.toUpperCase() + "\n" + newAge);
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public void changeElectResult(String[] results) {
        String tmp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = tmp;

    }


    public String[] changeElectResultAgain(String[] results) {
        String[] array = new String[3];
        array[0] = results[2];
        array[1] = results[3];
        array[2] = results[4];

        return array;
    }

    public char[][] createKeyboard() {
        char[][] array = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};

        return array;
    }

    public void printKeyboard() {
        char[][] newArray = createKeyboard();
        System.out.println(Arrays.toString(newArray[0]));
        System.out.println(Arrays.toString(newArray[1]));
        System.out.println(Arrays.toString(newArray[2]));
        System.out.println(Arrays.toString(newArray[3]));
    }

    public String[] makeCopy(String[] names) {
        String[] copyArray = Arrays.copyOf(names, names.length);
        System.out.println(Arrays.toString(copyArray));
        return copyArray;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String res = new String(pattern);
        String result = res;
        int i = 1;
        while (i < repeatCount) {
            ++i;
            String symb = res;
            result += symb;
        }
        return result;
    }

    public String drawTriangle(int side) {
        String star = "*";
        String text = "";
        int i = 1;
        int j;
        while (i <= side) {
            j = side;
            while (j >= i) {
                System.out.print(star);
                text.concat(star);
                j--;
            }
            System.out.print("\n");
            i++;
        }
        System.out.println(text);
        return text;
    }

    public int sumQuads(int n) {
        int tmp = 0;
        int res = 0;
        int start = 1;
        while (start <= n) {
            tmp = start * start;
            res += tmp;
            start++;
        }
        return res;
    }


    public int countSumOfDigits(int number) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        while (number > 0) {
            list.add(number % 10);
            number /= 10;
        }
        res = list.stream().reduce(Integer::sum).get();
        return res;
    }

//    public int countBanknotes(int sum) {
//        int count = 0;
//        int[] cash = {500, 200, 100, 50, 20, 10, 5, 2, 1};
//        int i = 0;
//        int tmp = 0;
//        if (sum != 0) {
//            for (i = 0; i <= 100; i++) {
//                if (sum != 0 && sum >= cash[i]) {
//                    sum -= cash[i];
//                    System.out.println("залишок = " + tmp);
//                    count++;
//                }
//            }
//        } else {
//            System.out.println("Sum = 0");
//        }
//        return count;
//    }


    public int countBanknotes(int sum) {
        int count = 0;
        int[] cash = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        if (sum > 0) {
            int i = 0;
            while (i < cash.length) {
                if (sum >= cash[i]) {
                    sum -= cash[i];
                    count++;
                } else {
                    i++;
                }
            }
        } else {
            System.out.println("Sum = Zero");
        }
        return count;
    }


    public void sertName(String name) {
        if (name.length()>=100||name.length()==0){
        }else {
            this.name = name;
        }
    }


    public void setserialNumber(String serialNumber) {
        String firstSymbols = serialNumber.substring(0,2).toUpperCase();
        if (firstSymbols.equals("SN") && serialNumber.length() == 8){
            this.serialNumber = serialNumber;
        }
    }


    public static void main(String[] args) {
        MoonRobotVespenGasDetector names = new MoonRobotVespenGasDetector();

            names.setserialNumber("sn8123fy");


//            char[] results = {"J", "a", "v", "a"};
//            names.changeElectResultAgain(results);
//            names.printKeyboard();
//            names.makeCopy(results);
//        System.out.println(names.countBanknotes(1932));


//        names.countSumOfDigits(572);

//        names.sumQuads(17);

//        names.drawTriangle(3);


//        char[] results = {'J', 'a', 'v', 'a'};
//        names.drawPattern(results, 3);

        //        String[] namese = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        //        String[] toReplace = new String[]{"lopr", "boki"};
        //
        //        new SomeTask.MoonRobotVespenGasDetector().fixNames(namese, toReplace);
        //        System.out.println(Arrays.toString(namese));


        //        System.out.println(names.encode();
        //        String resEncode = names.encode("Crab");
        //        System.out.println("encode " + resEncode);
        //        System.out.println(names.decode(resEncode));
        //
        //        names.createForms();


        //        //Should be true
        //        boolean namesEqual = names.areNamesEqual("nm", "nm");
        //        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
        //
        //        System.out.println(names.areNamesEqual("Exor", "Exor"));
        //        System.out.println(names.areNamesEqual("gork", "Maxon"));

        //        System.out.println(names.makeFullName("gork","gork"));
        //           System.out.println(names.isNameLucky("Exma"));
        //           System.out.println(names.isNameLucky("Igun"));

        //        System.out.print(names.isMoneyName("7Anton"));
        //        boolean isInvisible = names.isInvisibleName(" ");
        //        System.out.println("names.isInvisibleName(\" \") =  true " + isInvisible);
        //        System.out.println("names.isInvisibleName(ihway) false = " + names.isInvisibleName("ihway"));
        //        System.out.println(names.makeNamePositive("Nomad"));
        //        System.out.println(names.makeNamePositive("Henot"));
        //        System.out.println(names.makeNamePositive("xnOon"));
        //        System.out.println(names.makeNamePositive("Nowak"));
        //        System.out.println(names.makeHalfOfName("Magicoraxi"));
        //        System.out.println(names.makeHalfOfName("Javametro"));

    }

}

