package day02;

import java.util.Scanner;

public class MathematicsMain {

    public static void main(String[] args) {

        Mathematics mathematics = new Mathematics();
        System.out.println("Igaz értéket kapunk vissza, ha a paraméterül adott szám prím, különben hamisat.");
        System.out.println();

        System.out.println("0 " + mathematics.isPrime(0));
        System.out.println("1 " + mathematics.isPrime(1));
        System.out.println("2 " + mathematics.isPrime(2));
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy számot!");
        int number = scanner.nextInt();

        System.out.println(number + " " + mathematics.isPrime(number));
    }
}
