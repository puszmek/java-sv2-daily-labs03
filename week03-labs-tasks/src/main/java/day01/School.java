package day01;

public class School {

    public static void main(String[] args) {

        Students students = new Students();

        students.addHeight(154);
        students.addHeight(154);
        students.addHeight(160);

        System.out.println(students.isHeightsIncreasing());
    }
}
