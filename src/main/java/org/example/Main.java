package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; ) {
            for (int j = a; j > 0; j--) {
                System.out.print(j);
            }
            a--;
            System.out.println();
        }
    }
}