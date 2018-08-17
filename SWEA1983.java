package com.study.code.solved;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class AscFloat implements Comparator<Float> {
	@Override
	public int compare(Float o1, Float o2) {
		return o1.compareTo(o2);
	}
	
}

public class SWEA1983 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		String[] grades = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		
		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			//35%, 45%, 20%
			List<Float> sumOfScores = new ArrayList<Float>();
			float sum = 0;
			for(int i = 0; i < N; i++) {
				sum = 0;
				for(int j = 0;j<3;j++) {
					if(j == 0) {
						sum += sc.nextFloat()*0.35;
					}else if(j == 1) {
						sum += sc.nextFloat()*0.45;
					}else {
						sum += sc.nextFloat()*0.2;
					}
				}
				sumOfScores.add(sum);
			}
			
			
			List<Float> sumOfScoresWithAsc = new ArrayList<Float>(sumOfScores);
			
			AscFloat asc = new AscFloat();
			sumOfScoresWithAsc.sort(asc);
			
			//System.out.println(sumOfScores.toString());
			//System.out.println(sumOfScoresWithAsc.toString());
			
			Map<Float,String> gradesOfScores = new HashMap<Float,String>();
			
			int howMany = N/10;
			List<String> gradesOfStudents = new ArrayList<String>();
			
			for(int i = 9; i >= 0; i--) {
				for(int j = 0;j < howMany;j++) {
					gradesOfStudents.add(grades[i]);
				}
			}

			for (int i = 0; i < N; i++) {
				//System.out.println(sumOfScoresWithAsc.get(i) + ":" + gradesOfStudents.get(i));
				gradesOfScores.put(sumOfScoresWithAsc.get(i),gradesOfStudents.get(i));
			}
			//System.out.println( K + "번째 학생 점수 : " + sumOfScores.get(K-1));
			
			System.out.println("#" + tc + " " + gradesOfScores.get(sumOfScores.get(K-1)));
		}
		
		sc.close();

	}

}
