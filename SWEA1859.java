package com.study.code.solved;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA1859 {
	
	private static Scanner sc;
	
	private static int profit;
	
	public static void profitIs(List<Integer> arr) {
		//arr에서 max 값을 찾고
		//max값 전까지 배열 다 하나씩 더하고
		//max값에서 이익 계산하고
		//max+1배열 부터 재귀호출
		int max = 0;
		int lastIndex = arr.size()-1;
		
		for(int i = 0; i < arr.size(); i++) {
			max = Math.max(max, arr.get(i));
		}
		
		int maxIndex = arr.indexOf(max);
		if(maxIndex == 0) {
			System.out.println(profit);
			return;
		}
		int buySum = 0;
		for(int i = 0; i <= maxIndex; i++) {
			if(i == maxIndex) {
				profit += (arr.get(maxIndex)*(maxIndex)) - buySum;
			}else {
				buySum += arr.get(i);
			}
		}
		
		if(maxIndex == lastIndex || lastIndex == 0) {
			System.out.println(profit);
			return;
		}else {
			List<Integer> subArr = arr.subList(maxIndex + 1, lastIndex + 1);
			profitIs(subArr);
		}
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {

			profit = 0;
			
			int count = sc.nextInt();
			
			List<Integer> arr = new ArrayList<Integer>();
			
			for(int i = 0; i < count; i++) {
				arr.add(sc.nextInt());
			}
			
			System.out.println("#" + tc + " ");
			profitIs(arr);
		}
		
		//최고가 까지 일단 끊어
		//그리고 그 최고가 까지는 최고가 보다 낮으면 더해 그리고 최고가에 팔아
		//최고가 똑같이 반복
		
		//사는 날에는 숫자 그냥 더하기 ! 사는 날은 가격 값 더하기 = 총 합
		//이익  = (파는 날 가격 * 산날 수) - 총 구입했던 가격(총 합)

	}

}
