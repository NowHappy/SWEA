package com.study.code.solved;

import java.util.Scanner;

public class SWEA1954 {
     
    private static Scanner sc;
    
    public static void main(String[] args) {
 
        sc = new Scanner(System.in);
 
        int tcN = sc.nextInt();
 
        for (int tc = 1; tc <= tcN; tc++) {
        	int N = sc.nextInt();
        	int K = N;
        	int[][] arr = new int[N][N];
        	int num = 1;
        	int[] d = {0, 1, 2, 3};
        	int i = 0;
        	//방향이 +j, +i, -j, -i 순으로 진행하고 경계값이 1씩 줄어듬
        	//진행 크기 N과 방향
        	int x = -1, y = 0;
			while (K > 0) {
				if (d[i % 4] == 0) {
					for (int j = 0; j < K; j++) {
						x++;
						arr[y][x] = num;
						num++;
					}
					K--;
					i++;
					continue;
				}
				if (d[i % 4] == 1) {
					for (int j = 0; j < K; j++) {
						y++;
						arr[y][x] = num;
						num++;
					}
					i++;
					continue;
				}
				if (d[i % 4] == 2) {
					for (int j = 0; j < K; j++) {
						x--;
						arr[y][x] = num;
						num++;
					}
					K--;
					i++;
					continue;
				}
				if (d[i % 4] == 3) {
					for (int j = 0; j < K; j++) {
						y--;
						arr[y][x] = num;
						num++;
					}
					i++;
					continue;
				}
			}
        	
        	System.out.println("#"+ tc);
        	for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < N; j2++) {
					System.out.print(arr[j][j2] + " ");
				}
				System.out.println();
			}
        }
        sc.close();
 
    }
 
}