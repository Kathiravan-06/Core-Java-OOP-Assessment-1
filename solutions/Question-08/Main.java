import java.util.*;
abstract class Course {
    double courseFee;
    Course(double fee) {
        courseFee = fee;
    }
    abstract double calculateDiscount();
    abstract String getCourseType();
    double calculateFinalFee() {
        return courseFee - calculateDiscount();
    }
}
class ProgrammingCourse extends Course {
    ProgrammingCourse(double fee) {
        super(fee);
    }
    double calculateDiscount() {
        return courseFee * 10 / 100;
    }
    String getCourseType() {
        return "Programming";
    }
}
class DataScienceCourse extends Course {
    DataScienceCourse(double fee) {
        super(fee);
    }
    double calculateDiscount() {
        return courseFee * 15 / 100;
    }
    String getCourseType() {
        return "Data Science";
    }
}
class CloudCourse extends Course {
    CloudCourse(double fee) {
        super(fee);
    }
    double calculateDiscount() {
        return courseFee * 5 / 100;
    }
    String getCourseType() {
        return "Cloud";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        double fee = sc.nextDouble();
        Course course;
        switch (type) {
            case 1:
                course = new ProgrammingCourse(fee);
                break;
            case 2:
                course = new DataScienceCourse(fee);
                break;
            default:
                course = new CloudCourse(fee);
        }
        System.out.println("Course Type: " + course.getCourseType());
        System.out.printf(Locale.US, "Discount: %.2f%n",course.calculateDiscount());
        System.out.printf(Locale.US, "Final Fee: %.2f%n",course.calculateFinalFee());
    }
}
