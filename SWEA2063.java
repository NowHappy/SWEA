package com.study.code.solved;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Ascending implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		//같으면 0, 양수면 o1이 더 큼, 음수면 o2가 더큼.
		return o1.compareTo(o2);
	}
	
}

public class SWEA2063 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();
		
		List<Integer> arr = new ArrayList<Integer>();

		for (int tc = 1; tc <= tcN; tc++) {
			arr.add(sc.nextInt());
		}
		Ascending asc = new Ascending();
		arr.sort(asc);
		
		System.out.println(arr.get(tcN/2));
		
		sc.close();

	}

}
