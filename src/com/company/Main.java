package com.company;

public class Main {

    public static void main(String[] args) {
        isPrime(15);
    }

    public static boolean isPrime(int N) {
        if (N < 2) System.out.println("is not prime " + false);
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0) System.out.println(false);
        return true;

    }

}



