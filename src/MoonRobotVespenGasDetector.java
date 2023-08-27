import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MoonRobotVespenGasDetector {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        String name = firstName.toLowerCase() + " " + lastName.toUpperCase();
        return name;
    }

    public boolean isNameLucky(String name) {
        return name.contains("a") || name.contains("o") || name.contains("A") || name.contains("O");
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

    public char[][] createKeyboard(){
        char[][] array = { {'1', '2', '3'},
                           {'4', '5', '6'},
                           {'7', '8', '9'},
                           {'*', '0', '#'} };

        return array;
    }

    public void printKeyboard(){
        char[][] newArray = createKeyboard();
        System.out.println(Arrays.toString(newArray[0]));
        System.out.println(Arrays.toString(newArray[1]));
        System.out.println(Arrays.toString(newArray[2]));
        System.out.println(Arrays.toString(newArray[3]));
    }

    public String[] makeCopy(String[] names){
        String [] copyArray = Arrays.copyOf(names,names.length);
        System.out.println(Arrays.toString(copyArray));
        return copyArray;
    }


//    Напиши метод public String firstAndLastTogether(String[] names).
//    Він приймає масив рівно з 10 рядків, і повертає перший і останній рядок,
//    з'єднані рядком " AND ", і в кінці додається слово "TOGETHER". Між усіма словами має бути рівно один пробіл.

//    виклик firstAndLastTogether на масиві ["io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"] повертає "io AND rew TOGETHER"

    //Test output
    public static void main(String[] args) {
        MoonRobotVespenGasDetector names = new MoonRobotVespenGasDetector();
        String[] results = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        names.changeElectResultAgain(results);
        names.printKeyboard();
        names.makeCopy(results);




//        String[] namese = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
//        String[] toReplace = new String[]{"lopr", "boki"};
//
//        new MoonRobotVespenGasDetector().fixNames(namese, toReplace);
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

