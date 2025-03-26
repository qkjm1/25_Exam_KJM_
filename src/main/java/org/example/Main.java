package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for(int i=a;i>0;i--){
            for(int j=i;a-j>0;j++){
                System.out.print(" ");
            }
            for(int k=a;k-b>0;k--){
                System.out.print((k-b)+" ");
            }
            b++;
            System.out.println();
        }
    }
}