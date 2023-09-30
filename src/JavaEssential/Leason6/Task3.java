package JavaEssential.Leason6;

public class Task3 {
    /**
     * Enum Types
     * An enum type is a special data type that enables for a variable to be a set of predefined constants.
     * The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST)
     * and the days of the week.
     * Because they are constants, the names of an enum type's fields are in uppercase letters.
     * In the Java programming language, you define an enum type by using the enum keyword. For example, you would specify a days-of-the-week enum type as:
     **/

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    /**
     * You should use enum types any time you need to represent a fixed set of constants.
     * That includes natural enum types such as the planets in our solar system and data sets where you know all possible values at compile time—for example,
     * the choices on a menu, command line flags, and so on.
     * Here is some code that shows you how to use the Day enum defined above:
     **/

    class EnumTest {
        Day day;

        public EnumTest(Day day) {
            this.day = day;
        }

        public void tellItLikeItIs() {
            switch (day) {
                case MONDAY:
                    System.out.println("Mondays are bad.");
                    break;

                case FRIDAY:
                    System.out.println("Fridays are better.");
                    break;

                case SATURDAY:
                case SUNDAY:
                    System.out.println("Weekends are best.");
                    break;

                default:
                    System.out.println("Midweek days are so-so.");
                    break;
            }
        }
    }
}
//        public static void Main(String[] args) {
//            EnumTest firstDay = new EnumTest(Day.MONDAY);
//            firstDay.tellItLikeItIs();
//            EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
//            thirdDay.tellItLikeItIs();
//            EnumTest fifthDay = new EnumTest(Day.FRIDAY);
//            fifthDay.tellItLikeItIs();
//            EnumTest sixthDay = new EnumTest(Day.SATURDAY);
//            sixthDay.tellItLikeItIs();
//            EnumTest seventhDay = new EnumTest(Day.SUNDAY);
//            seventhDay.tellItLikeItIs();
//        }
//    }
/**
 * The output is:
 * Mondays are bad .
 * Midweek days are so-so .
 * Fridays are better .
 * Weekends are best .
 * Weekends are best .
 * <p>
 * <p>
 * Java programming language enum types are much more powerful than their counterparts in other languages.The enum declaration defines a
 * class ( called an enum type).The enum lass body can include methods and other fields. The compiler automatically adds some special methods when it creates an enum.
 * For example, they have a static values method that returns an array containing all of the values of the enum in the order they are declared. This method is commonly
 * used in combination with the for-each construct to iterate over the values of an enum type. For example, this code from the Planet class example below iterates
 * over all the planets in the solar system.
 * -------------------------------------------------------------------------------------------------------------------
 **/

// enum Planet {
//    MERCURY (3.303e+23, 2.4397e6),
//    VENUS   (4.869e+24, 6.0518e6),
//    EARTH   (5.976e+24, 6.37814e6),
//    MARS    (6.421e+23, 3.3972e6),
//    JUPITER (1.9e+27,   7.1492e7),
//    SATURN  (5.688e+26, 6.0268e7),
//    URANUS  (8.686e+25, 2.5559e7),
//    NEPTUNE (1.024e+26, 2.4746e7);
//
//    private final double mass;   // in kilograms
//    private final double radius; // in meters
//    Planet(double mass, double radius) {
//        this.mass = mass;
//        this.radius = radius;
//    }
//    private double mass() { return mass; }
//    private double radius() { return radius; }
//
//    // universal gravitational constant  (m3 kg-1 s-2)
//    public static final double G = 6.67300E-11;
//
//    double surfaceGravity() {
//        return G * mass / (radius * radius);
//    }
//    double surfaceWeight(double otherMass) {
//        return otherMass * surfaceGravity();
//    }
//    public static void Main(String[] args) {
//        if (args.length != 1) {
//            System.err.println("Usage: java Planet <earth_weight>");
//            System.exit(-1);
//        }
//        double earthWeight = Double.parseDouble(args[0]);
//        double mass = earthWeight/EARTH.surfaceGravity();
//        for (SomeTask.Planets p : SomeTask.Planets.values())
//            System.out.printf("Your weight on %s is %f%n",
//                    p, p.surfaceWeight(mass));
//    }
//}


/**   -------------------------------------------------------------------------------------------------------------------
  ENUMS (ENUMERATION) - перелічення констан ,являється спеціальним класом який є статичним та публічним.
  enum NameClass{
  // some constants
  }
  Перечислення фактично являються "типом даних" якому ми можемо присвоїти його значення і він буде зберінати ці дані.
  ENUM веде себе так само як і звичайний Java клас , в ньому можна описати поля створити конструктор , оголосити методи
  get -set ,перевизначити метод toString(), та створити екземпляр класу з вихідгими даними для конкретної константи.

  Для перелічення є свої методи
    value() що дає повернути масив значеннь всіх описаних констант.
    ordinal() що повертає порядковий номер константи.
    valueOf() повертає значення константи що присвоєно їй під час створення клнструктору иа оголошення відповідного поля-полів.

 **/
