package com.github.rochnaldo974.workshop;

public class HelloWorld {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 200) {
            if ((n % 5 == 0)  && (n % 3 == 0)) {
                System.out.printf("%d-> FizzBuzz\n", n);
            }
            else if (n % 3 == 0) {
                System.out.printf("%d-> Fizz\n", n);
            }
            else if (n % 5 == 0) {
                System.out.printf("%d-> Buzz\n", n);
            }
            else
                System.out.printf("%d\n", n);
            n++;
        }
    }
}