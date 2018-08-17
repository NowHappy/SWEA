package com.study.code.solved;

import java.util.Scanner;


public class SWEA2001 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int sum = 0;
			int ans = 0;
			
			int[][] paris = new int[N][N];
			for(int i = 0; i < N; i ++) {
				for(int j=0; j < N; j++) {
					paris[i][j] = sc.nextInt();
				}
			}
			
//			for(int i = 0; i < N; i ++) {
//				for(int j=0; j < N; j++) {
//					System.out.print(paris[i][j] + " ");
//				}
//				System.out.println();
//			}

			for(int i = 0; i < N-M+1; i ++) {
				for(int j=0; j < N-M+1; j++) {
					sum = 0;
					for(int x = 0; x < M; x++) {
						for(int y = 0; y < M; y++) {
							sum += paris[i+x][j+y];
						}
					}
					ans = Math.max(sum, ans);
				}
			}
			
			System.out.println("#" + tc + " " + ans);
			
			
		}
		
		sc.close();

	}

}
