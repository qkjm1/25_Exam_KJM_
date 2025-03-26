package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){      // 정수 10개의 피보나치 수열을 출력하기 위해서 10번 반복
            System.out.print(pb(i)+" ");
            // 반복문에서 인자를 받아 피보나치메서드 이용
        }
    }
    public static int pb (int i){ // main에서 인자를 받아 i= 0일때는 0을 리턴하고 i= 1일때는 1을 리턴한다.
        if(i==0){
            return 0;
        }else if(i==1){
            return 1;
        }else {
            return pb(i-1)+pb(i-2);
        } // 뒤에 두 정수값을 더한 값이 나와야하므로 i=2일때, (2-1)+(2-2)=1  / i=3  (3-1)+(3-2)=3  ... 식으로 진행
    }
}