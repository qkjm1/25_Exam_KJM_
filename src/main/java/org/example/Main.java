package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int j = b; j >0; j--) {  // b에 입력받은 값은 prinln의 줄바꿈으로 b만큼 줄이 만들어진다
            for(int i =a ;i>0;i--){    // a에 입력받은 값만큼 '*'이 출력되고 print로 인해 줄바꿈없이 출력
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}