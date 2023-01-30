package com.github.rochnaldo974.workshop;
import java.util.Random;
import java.util.Scanner;
public class GuessANumber {
    public static void main(String[] args) {
        int n = 0;
        Random random = new Random();
        int nbr = random.nextInt(100);
        while (n != 1) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("You guess? " + x);
            if (x == nbr) {
                System.out.println("You win !!!");
                break;
            }
            else if (x < nbr) {
                System.out.println("too low");
            }
            else if (x > nbr) {
                System.out.println("too high ");
            }
        }

    }
}
