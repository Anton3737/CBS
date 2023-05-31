package JavaEssential.ClassWork;

public class mainStd {


    public static void main(String[] args) {

        Student student1 = new Student("Vasia", 18, "Java", 3, 5, 3);
        Student student2 = new Student("Tolia", 18, "C++", 2, 2, 5);
        Student student3 = new Student("Lusia", 18, "WEB", 1, 1, 1);


        System.out.println(student1.avg(student1.getMath(), student1.getHistory(), student1.getEnglish()));
        System.out.println(student2.avg(student2.getMath(), student2.getHistory(), student2.getEnglish()));
        System.out.println(student3.avg(student3.getMath(), student3.getHistory(), student3.getEnglish()));


        System.out.println();


        student1.stependia();
        student2.stependia();
        student3.stependia();

//        double avg = 4;
//
//        if ((student1.getMath() + student1.getHistory() + student1.getEnglish()) / 3 == avg) {
//            System.out.println("Має стипендію  " + student1.getName());
//        } else {
//            System.out.println("Не стипендію  " + student1.getName());
//        }
//        if ((student2.getMath() + student2.getHistory() + student2.getEnglish()) / 3 == avg) {
//            System.out.println("Має стипендію  " + student2.getName());
//        } else {
//            System.out.println("Не стипендію  " + student2.getName());
//        }
//        if ((student3.getMath() + student3.getHistory() + student3.getEnglish()) / 3 == avg) {
//            System.out.println("Не стипендію  " + student2.getName());
//        } else {
//            System.out.println("Не стипендію  " + student2.getName());
//        }

    }
}
