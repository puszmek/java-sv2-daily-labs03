package day02;

import java.util.Scanner;

public class Mathematics {

    private int number;

    public boolean isPrime(int number) {
        if (number == 0) {
            return false;
        }
        if (number == 1) {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
