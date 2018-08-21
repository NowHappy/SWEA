package com.study.code.solved;

import java.util.Scanner;

public class SWEA1959 {
     
    private static Scanner sc;
    
    public static void main(String[] args) {
 
        sc = new Scanner(System.in);
 
        int tcN = sc.nextInt();
 
        for (int tc = 1; tc <= tcN; tc++) {
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	
        	int[] arrN = new int[N];
        	for (int i = 0; i < N; i++) {
				arrN[i] = sc.nextInt();
			}
        	
        	int[] arrM = new int[M];
        	for (int i = 0; i < M; i++) {
				arrM[i] = sc.nextInt();
			}
        	
        	int ans = 0;
        	int tmpAns = 0;
        	// M이 큰지 N이 큰지
        	if(M>N) {
        		int tmp = 0;
        		for (int x = 0; x <= M-N; x++) {
        			tmpAns = 0;
					for (int i = 0; i < N; i++) {
						tmpAns += arrN[i]*arrM[i+tmp];
					}
					ans = Math.max(ans, tmpAns);
					tmp++;
				}
        	}else if(M<N) {
        		int tmp = 0;
        		for (int x = 0; x <= N-M; x++) {
        			tmpAns = 0;
					for (int i = 0; i < M; i++) {
						tmpAns += arrN[i+tmp]*arrM[i];
					}
					ans = Math.max(ans, tmpAns);
					tmp++;
				}
        	}else {
        		for (int i = 0; i < N; i++) {
					ans += arrN[i]*arrM[i];
				}
        	}
        	
        	System.out.println("#"+ tc + " " + ans);
        }
        sc.close();
 
    }
 
}