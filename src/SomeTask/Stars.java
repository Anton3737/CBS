package SomeTask;

public class Stars {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {

        int tmp = getCount();
        String resultAddLet = "";

        int thousands = tmp / 1000;
        int hundreds = (tmp % 1000) / 100;
        int tens = (tmp % 100) / 10;
        int ones = tmp % 10;

        if (thousands > 0) {
            for (int i = 0; i < thousands; i++) {
//                resultAddLet.concat("X");
                resultAddLet = resultAddLet + "X";
            }
        }
        if (hundreds > 0) {
            for (int i = 0; i < hundreds; i++) {
//                resultAddLet.concat("Y");
                resultAddLet = resultAddLet + "Y";

            }
        }
        if (tens > 0) {
            for (int i = 0; i < tens; i++) {
//                resultAddLet.concat("Z");
                resultAddLet = resultAddLet + "Z";

            }
        }
        if (ones > 0) {
            for (int i = 0; i < ones; i++) {
//                resultAddLet.concat("*");
                resultAddLet = resultAddLet + "*";

            }
        }
        return resultAddLet;
    }


    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());

    }
}
