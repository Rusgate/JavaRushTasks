package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length-1; i++) { // null; null; null; Java; Tasks; World // i = 3
                String word = strings[i]; // word = null
            for (int j = i + 1; j < strings.length; j++) { // j=2
                if(word==null) {
                    break;
                }
                if (word.equals(strings[j])) { //
                    strings[i] = null;
                    strings[j] = null;
                }

            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
