package com.study.code.solved;

import java.util.Scanner;

public class SWEA1970 {
     
    private static Scanner sc;
 
    public static void main(String[] args) {
 
        sc = new Scanner(System.in);
 
        int tcN = sc.nextInt();
 
        for (int tc = 1; tc <= tcN; tc++) {
        	int a, b, c, d, e, f, g, h = 0;
        	int money = sc.nextInt();
			
        	a = money / 50000;
        	money -= a * 50000;

			
			b = money / 10000;
			money -= b * 10000;
			
			c = money / 5000;
			money -= c * 5000;

			d = money / 1000;
			money -= d * 1000;

			
			e = money / 500;
			money -= e * 500;

			f = money / 100;
			money -= f * 100;

			
			g = money / 50;
			money -= g * 50;

			h = money / 10;
			money -= h * 10;

        		
        	
            System.out.println("#" + tc);
            System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
        }
         
        sc.close();
 
    }
 
}