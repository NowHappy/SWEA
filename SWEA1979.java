package com.study.code.solved;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA1979 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] arr = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j =0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
//			for(int i = 0; i < N; i++) {
//				for(int j =0; j < N; j++) {
//					System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			List<Integer> ns = new ArrayList<Integer>();
			int sum = 0;
			//가로
			for(int i = 0; i < N; i++) {
				sum = 0;
				for(int j =0; j < N; j++) {
					if(arr[i][j] == 0) {
						ns.add(sum);
						sum = 0;
					}else if(j == N-1) {
						sum += arr[i][j];
						ns.add(sum);
					}else {
						sum += arr[i][j];
					}
				}
			}
			//System.out.println(ns.toString());
			//세로
			for(int i = 0; i < N; i++) {
				sum = 0;
				for(int j =0; j < N; j++) {
					if(arr[j][i] == 0) {
						ns.add(sum);
						sum = 0;
					}else if(j == N-1) {
						sum += arr[j][i];
						ns.add(sum);
					}else {
						sum += arr[j][i];
					}
				}
			}
			//System.out.println(ns.toString());
			
			int ans = 0;
			for(int i =0; i < ns.size();i++) {
				if(ns.get(i) == K) {
					ans++;
				}
			}
			
			System.out.println("#" + tc + " " + ans);
		}
		
		sc.close();

	}

}
