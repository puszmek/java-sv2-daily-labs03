package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        GuessTheNumber guessTheNumber = new GuessTheNumber();

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gondoltam egy számra.");
        System.out.println(randomNumber);
        System.out.println("Adjon meg egy számot 1 és 100 között.");

        for (int i = 0; i < 6; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number == randomNumber) {
                System.out.println("Gartulálok! Ön kitalálta a számot!");
                break;
            } else {
                if (number < randomNumber) {
                    System.out.println("Az Ön által megadott szám kisebb, mint a gondolt szám.");
                }
                if (number > randomNumber) {
                    System.out.println("Az Ön által megadott szám nagyobb, mint a gondolt szám.");
                }
            }
        }
        System.out.println("Erre a számra gondoltam: " + randomNumber);
    }
}
