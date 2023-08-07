public class test {

    public boolean isDiscount50(int price){
        double temp  = price * 4.0;
        System.out.println(temp);
        return  temp > 1000;
    }

    public static void main(String[] args) {

        test test = new test();
        System.out.println( test.isDiscount50(250));
    }
}
