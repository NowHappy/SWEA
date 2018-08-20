package com.study.code.solved;

import java.util.Scanner;

public class SWEA1976 {
     
    private static Scanner sc;
 
    public static void main(String[] args) {
 
        sc = new Scanner(System.in);
 
        int tcN = sc.nextInt();
 
        for (int tc = 1; tc <= tcN; tc++) {
            int fHour = sc.nextInt();
            int fMinute = sc.nextInt();
             
            int sHour = sc.nextInt();
            int sMinute = sc.nextInt();
             
            int aHour;
            if((fHour+sHour)%12 == 0) {
                aHour = 12;
            }else {
                aHour = (fHour+sHour)%12;
            }
             
            int aMinute;
            if((fMinute+sMinute) >= 60) {
                aHour++;
                if(aHour > 12) {
                    aHour = (fHour+sHour)%12;
                }
                aMinute = (fMinute+sMinute) - 60;
            }else {
                aMinute = (fMinute+sMinute);
            }
             
            System.out.println("#" + tc + " " + aHour + " " + aMinute);
        }
         
        sc.close();
 
    }
 
}