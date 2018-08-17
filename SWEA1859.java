package com.study.code.solved;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA1859 {
	
	private static Scanner sc;
	
	private static int profit;
	
	public static void profitIs(List<Integer> arr) {
		//arr���� max ���� ã��
		//max�� ������ �迭 �� �ϳ��� ���ϰ�
		//max������ ���� ����ϰ�
		//max+1�迭 ���� ���ȣ��
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
		
		//�ְ� ���� �ϴ� ����
		//�׸��� �� �ְ� ������ �ְ� ���� ������ ���� �׸��� �ְ��� �Ⱦ�
		//�ְ� �Ȱ��� �ݺ�
		
		//��� ������ ���� �׳� ���ϱ� ! ��� ���� ���� �� ���ϱ� = �� ��
		//����  = (�Ĵ� �� ���� * �곯 ��) - �� �����ߴ� ����(�� ��)

	}

}
