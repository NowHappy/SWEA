package com.study.code.solved;

import java.util.Scanner;


public class SWEA2005 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {
			
			System.out.println("#" + tc);
			
			int sizeOfTriangle = sc.nextInt();
			int[] arrPast = new int[10];
			int[] arrCurr = new int[10];
			for(int i =0; i < sizeOfTriangle; i++) {
				for(int j = 0; j <= i; j++) {
					if(j == 0 || j == i) {
						System.out.print("1");
						arrPast[j] = 1;
						arrCurr[j] = 1;
					}else {
						System.out.print(arrPast[j-1] + arrPast[j]);
						arrCurr[j] = arrPast[j-1] + arrPast[j];
						
					}
					System.out.print(" ");
				}
				
				for(int j = 0; j <= i; j++) {
					arrPast[j] = arrCurr[j];
				}
				System.out.println();
			}
			
		}
		
		sc.close();

	}

}
