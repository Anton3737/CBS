package JavaEssential.ClassWork;

public class Student {

    private String name;

    private int age;
    private String course;

    private int math;

    private int history;

    private int english;


    public Student(String name, int age, String course, int math, int history, int english) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.math = math;
        this.history = history;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }


    public double avg(int math, int history, int english) {
        double avg = (math + history + english) / 3;
        return avg;
    }

    public void stependia() {

        if (avg(this.math, this.history, this.english) < 4) {
            System.out.println("Student will have stipendia");
        } else {
            System.out.println("Student will not have stipendia");
        }

    }


}
