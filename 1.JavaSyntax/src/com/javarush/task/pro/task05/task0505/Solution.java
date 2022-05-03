package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int[] array= new int[n];
        for (int i = 0; i > 0; i++) {
            array[i] = scan.nextInt();
        }
            if(array[n] %2==0){
                for (int i = 0; i < array.length; i++){
                System.out.println(array[n]);}
            }else{
                for (int i = 0; i < array.length; i--){
                    System.out.println(array[n]);
            }

        }
    }
}
