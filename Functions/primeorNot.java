package com.company;

import java.util.*;

public class primeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(checkPrime(num));
    }

    static boolean checkPrime(int num){
        // fail
        if(num <= 1)
            return false;

        int i=2;
        while(i*i <= num ){
            if(num%i==0)
                return false;
            i++;  // i=3

        }
        return i*i > num;
    }
}
