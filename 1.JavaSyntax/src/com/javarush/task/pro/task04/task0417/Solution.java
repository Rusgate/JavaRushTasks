package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double i = scan.nextDouble();
        double km = 3.6;
        double x = (i*1)*km;
        int s =(int) Math.round(x);
        System.out.println(s);

    }
}