package com.company;

import java.util.*;

public class primebetweenTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();

        for(int i=a;i<=b;++i){
            if(primeNo(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean primeNo(int num){

        if(num <= 1)
            return false;

        int i =2;
        while(i*i<=num){
            if(num%i==0)
                return false;
            i++;
        }
        return i*i>num;

    }
}
