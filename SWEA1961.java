package com.study.code.solved;

import java.util.Scanner;

public class SWEA1961 {
     
    private static Scanner sc;
    
    private static int N = 0;
    
    public static void Rotate(int[][] oriArr, int[][] newArr) {
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				newArr[i][j] = oriArr[N-1-j][i];
			}
		}
    }
 
    public static void main(String[] args) {
 
        sc = new Scanner(System.in);
 
        int tcN = sc.nextInt();
 
        for (int tc = 1; tc <= tcN; tc++) {
        	N = sc.nextInt();
        	
        	int[][] oriArr = new int[N][N];
        	
        	int[][] r1Arr =  new int[N][N];
        	int[][] r2Arr =  new int[N][N];
        	int[][] r3Arr =  new int[N][N];
        	
        	for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					oriArr[i][j] = sc.nextInt();
				}
			}
        	
//        	for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(oriArr[i][j]);
//				}
//				System.out.println();
//			}
        	
        	Rotate(oriArr,r1Arr);
        	
//        	for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(r1Arr[i][j]);
//				}
//				System.out.println();
//			}
        	
        	Rotate(r1Arr,r2Arr);
        	
//        	for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(r2Arr[i][j]);
//				}
//				System.out.println();
//			}
        	
        	Rotate(r2Arr,r3Arr);
        	
//        	for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(r3Arr[i][j]);
//				}
//				System.out.println();
//			}
        	
        	System.out.println("#" + tc);
        	for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(r1Arr[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < N; j++) {
					System.out.print(r2Arr[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < N; j++) {
					System.out.print(r3Arr[i][j]);
				}
				System.out.println();
			}
        	
        }
        sc.close();
 
    }
 
}