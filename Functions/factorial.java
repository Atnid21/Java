package com.company;
import java.util.*;

public class factorial {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fact(num));
    }

    static int fact(int num){
        if(num ==0 || num == 1)
            return 1;

        int multi=1;
        while(num>0){
            multi*=num;
            num--;
        }
        return multi;

    }
}
