package com.company;

import java.util.*;
public class armStrongNo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int temp =num;
        int res = checkArmstrong(temp);

        if(res == num)
            System.out.println("ArmStrong");
        else
            System.out.println("Not ArmStrong");

    }

    // 153  -- 1 5 3   rem = 3

    static int checkArmstrong(int num){


//            int a = num%10;
//            num/=10;
//            int b= num%10;
//            num/=10;
//            int c=num;
//
//            int armStrong = a*a*a + b*b*b + c*c*c;
        int sum=0;

        while(num>0){
            int rem =num%10;
            sum= sum + rem*rem*rem;
            num/=10;
        }


        return sum;
    }
}
