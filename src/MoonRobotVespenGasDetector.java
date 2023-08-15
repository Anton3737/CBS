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

    //Test output
    public static void main(String[] args) {
        MoonRobotVespenGasDetector names = new MoonRobotVespenGasDetector();
//        System.out.println(names.encode();
        String resEncode = names.encode("Crab");
        System.out.println("encode " + resEncode);
        System.out.println(names.decode(resEncode));

        names.createForms();


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

