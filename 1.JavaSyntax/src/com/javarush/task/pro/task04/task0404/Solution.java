package com.javarush.task.pro.task04.task0404;

/*
Заполненный прямоугольник             
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 5) {
            int b = 1;
            while (b < 10) {
                System.out.print("Q");
                b++;
            }
            System.out.println("Q");
            a++;
        }
    }
}