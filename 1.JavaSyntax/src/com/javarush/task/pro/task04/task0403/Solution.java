package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        boolean isEnter;
        while(true){
            String string = scan.nextLine();
            isEnter = string.equals("ENTER");
            if(isEnter){
                break;
            }
            sum += Integer.parseInt(string);
        }
        System.out.println(sum);
    }
}