package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;
 import java.util.*;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings= new String[6];
        for(int j = 0; j < strings.length; j++) {
            strings[j]=scan.nextLine();
        }
            for(int j = 0; j < strings.length; j++) {
            for(int i = 0; i < strings.length; i++){
              }
                if (  strings[i]==null; strings[j]==null; j==i){
                        continue;

                 }else if(strings[j].equals(strings[i])){
                  strings[j]=  null;
                   strings[i]=  null;
                    }
                }
                   }
//              if(strings[1].equals(strings[2])){
//                  strings[1]=  null;
 //                  strings[2]=  null;
 //                   }
 //          if(strings[2].equals(strings[3])){
 //                 strings[2]=  null;
  //                  strings[3]=  null;
 //                   }
 //           if(strings[3].equals(strings[4])){
 //                 strings[3]=  null;
 //                  strings[4]=  null;
//                    }
//                    if(strings[4].equals(strings[5])){
 //                 strings[4]=  null;
//                    strings[5]=  null;
//                    }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}