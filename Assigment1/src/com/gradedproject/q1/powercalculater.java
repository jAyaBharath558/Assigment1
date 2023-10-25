package com.gradedproject.q1;

import java.util.Scanner;

public class powercalculater {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter base number :-");
        int base =scanner.nextInt();
        System.out.println("eneter power of base number:-");
        int power = scanner.nextInt();
        double results = powercalculater (base,power);
        System.out.println("base * power :-"+results);
    }
    static double powercalculater(int base,int power){
        if (power==0){
            return 1;
        } else if (power%2==0) {
            double halfpower = powercalculater( base,power/2);
            return halfpower*halfpower;
        }else {
            double halfpower=powercalculater(base,(power-1)/2);
            return base*halfpower*halfpower;
        }
    }
}
