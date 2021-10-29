package day05;

import java.util.Scanner;

public class JournalMain {

    public static void main(String[] args) {
        Journal journal = new Journal();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(journal.addStudent(name));
        System.out.println(journal.getNames());
    }
}
