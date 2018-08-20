package com.study.code.solved;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Ascend implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
}

public class SWEA1966 {
     
    private static Scanner sc;
 
    public static void main(String[] args) {
 
        sc = new Scanner(System.in);
 
        int tcN = sc.nextInt();
 
        for (int tc = 1; tc <= tcN; tc++) {
        	int N = sc.nextInt();
        	List<Integer> arr = new ArrayList<>();
        	
        	for (int i = 0; i < N; i++) {
				arr.add(sc.nextInt());
			}
        	Ascend asc = new Ascend();
        	arr.sort(asc);
        	
        	System.out.print("#"+tc+" ");
        	
			for (int i = 0; i < N; i++) {
				System.out.print(arr.get(i) + " ");
			}
			
			System.out.println();
        }
        sc.close();
 
    }
 
}