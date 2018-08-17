package com.study.code.solved;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Asc implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
}

public class SWEA1984 {
	
	private static Scanner sc;
	
	private static int sum = 0;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {
			
			List<Integer> arr = new ArrayList<Integer>();
			
			for(int i = 0; i < 10; i++) {
				arr.add(sc.nextInt());
			}
			
			Asc asc = new Asc();
			arr.sort(asc);
			
			System.out.println(arr.toString());
			
			sum = 0;
			arr.forEach((e)->{
				sum += e;
			});
			
			sum -= arr.get(0);
			sum -= arr.get(arr.size()-1);
			
			System.out.println("#" + tc + " " + Math.round((float)((float)sum/(float)(arr.size()-2))));
		}
		
		sc.close();

	}

}
