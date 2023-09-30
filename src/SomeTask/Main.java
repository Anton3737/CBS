package SomeTask;

class A {
    public void method() {
        System.out.println("Class SomeTask.A: method()");
    }
}
class B extends A {
    @Override
    public void method() {
        System.out.println("Class SomeTask.B: method()");
    }
}
class C extends B {

}
 class Q11 {
    public static void main(String[] args) {
        B instance = new C();
        instance.method();
    }
}


//    static String perevircaMethod(int a, int b, int c) {
//        int tmpUp = 0;
//        int tmpZero = 0;
//        int tmdDw = 0;
//
//
//        if (a > 0) {
//            tmpUp++;
//        } else if (a < 0) {
//            tmdDw++;
//        } else {
//            tmpZero++;
//        }
//
//        if (b > 0) {
//            tmpUp++;
//        } else if (b < 0) {
//            tmdDw++;
//
//        } else {
//            tmpZero++;
//        }
//
//        if (c > 0) {
//            tmpUp++;
//        } else if (c < 0) {
//            tmdDw++;
//        } else {
//            tmpZero++;
//        }
//
//
//        return " Більше нуля " + tmpUp + "\n менше нуля " + tmdDw + "\n рівно нулю  " + tmpZero;
//    }
//
//
//    public static void Main(String[] args) {
//
////        int res = perevircaMethod(-45, 5, 9);
////        System.out.println(res);
//
//        System.out.println(perevircaMethod(2, 7, -12));
//    }

