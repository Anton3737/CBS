package JavaEssential.Leason8.Task2_3_4;

public class Main {

    public static void main(String[] args) {

        Device GalaxyBook = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(GalaxyBook);
        Device SamsungMonitor = new Monitor("Samsung", 120, "AB1234567CD", 1400, 900);
        System.out.println(SamsungMonitor);
        Device Router = new EthernetAdapter("Asus", 299.35F, "RCMG123456", 300, "MAC45699921");
        System.out.println(Router);


        System.out.println(GalaxyBook.hashCode());
        System.out.println(SamsungMonitor.hashCode());
        System.out.println(Router.hashCode());

        System.out.println(GalaxyBook.equals(SamsungMonitor));
        System.out.println(Router.equals(GalaxyBook));
        System.out.println(SamsungMonitor.equals(Router));


    }
}
