package com.company;


import java.util.*;
public class sumofNaturalno {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sum(num);

    }

    static void sum(int num){
        int sum=0;
        for(int i=1;i<=num;++i){
            sum+=i;
        }
        System.out.println(sum);
    }
}
