package com.study.code.solved;

import java.util.Scanner;


public class SWEA2007 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();
		
		char[] madi = new char[10];

		for (int tc = 1; tc <= tcN; tc++) {
			
			String text = sc.next();
			int minLength = 10;
			
			for(int i = 0; i < 10; i++) {
				madi[i] = text.charAt(i);
			}
//			for(int i = 0; i < 10; i++) {
//				System.out.print(madi[i]);
//			}
//			System.out.println();
			//madi 길이가 10이야
			//전체 길이 % 10 하면 그 인덱스끼리 다 같아야해
			boolean match = true;
			for(int i = 1; i < 11; i++) {
				match = true;
				for(int j = 0; j < 30; j++) {
					//System.out.println(j + "ori = " + text.charAt(j));
					
					//마디가 길이가 1이면
					//마디 0번째랑 0번째문자랑 비교
					//마디가 길이가 2이면
					//마디 0번째랑 0번째문자
					if(j%i == 0) {
						//System.out.println(j + "madi = " + madi[0]);
						if(text.charAt(j) != madi[0]) {
							//System.out.println("false");
							match = false;
							break;
						}
					}else {
						//System.out.println(j + "madi = " + madi[j%i]);
						if(text.charAt(j) != madi[j%i]) {
							//System.out.println("false");
							match = false;
							break;
						}
					}
					
					if(j == 29 && match) {
						//System.out.println(i);
						minLength = Math.min(minLength, i);
					}
				}
			}
			
			System.out.println("#"+ tc + " " + minLength);
		}
		
		sc.close();

	}

}
