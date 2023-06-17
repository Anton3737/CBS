package JavaEssential.Leason6;

public enum Vehicles {
    MERCEDES(12000, "Black"), KIA(5300, "Red"), HONDA(12500, "Pink"), NISSAN(15600, "Dark blue"), TOYOTA(32900, "White"), BMW(1900, "Purple"), LEXUS(23030, "Black"), MASERATI(55000, "Light grey"), AUDI(11990, "Black"), SKODA(6600, "Yellow");

    int price;
    String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Aвтомобіль:" +
                " назва: " + name() +
                ", ціна: " + price +
                ", колір: " + getColor();
    }

    public static void main(String[] args) {

        Vehicles Mercedes = Vehicles.MERCEDES;
        Vehicles Kia = Vehicles.KIA;
        Vehicles Honda = Vehicles.HONDA;
        Vehicles Nissan = Vehicles.NISSAN;
        Vehicles Toyota = Vehicles.TOYOTA;
        Vehicles Bmw = Vehicles.BMW;
        Vehicles Lexus = Vehicles.LEXUS;
        Vehicles Maserati = Vehicles.MASERATI;
        Vehicles Audi = Vehicles.AUDI;
        Vehicles Skoda = Vehicles.SKODA;


        System.out.println(Mercedes);
        System.out.println(Kia);
        System.out.println(Honda);
        System.out.println(Nissan);
        System.out.println(Toyota);
        System.out.println(Bmw);
        System.out.println(Lexus);
        System.out.println(Maserati);
        System.out.println(Audi);
        System.out.println(Skoda);
    }
}

//        Завдання 4
//        Створіть проект за допомогою IntelliJ IDEA.
//        Створіть перечислювальний тип (enum) Vehicles, що містить конструктор,
//        який повинен набувати цілого числа (вартість автомобіля), містити метод getColor(),
//        який повертає рядок з кольором автомобіля, і містити перевантажений метод toString(),
//        який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.

