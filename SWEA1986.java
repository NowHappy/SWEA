package com.study.code.solved;

import java.util.Scanner;


public class SWEA1986 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {
			
			int N = sc.nextInt();
			int sum = 0;
			
			for(int i = 1; i <= N; i++) {
				if(i%2 == 0) {
					sum -= i;
				}else {
					sum += i;
				}
			}
			
			
			System.out.println("#" + tc + " " + sum);
		}
		
		sc.close();

	}

}
