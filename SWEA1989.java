package com.study.code.solved;

import java.util.Scanner;


public class SWEA1989 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {
			String word = sc.next();
			String[] array_word;

			//��ǻ� ���� ������
			array_word = word.split(""); //�迭�� �ѱ��ھ� �����ϱ�
					
			for(int i=0;i<array_word.length;i++) { //���
				if(!array_word[i].equals(array_word[array_word.length -1 - i])) {
			    	System.out.println("#" + tc + " " + 0);
			    	break;
			    }
			    if(i == array_word.length - i -1) {
			    	if(!array_word[i].equals(array_word[array_word.length -1 - i])) {
			    		System.out.println("#" + tc + " " + 0);
				    }else {
				    	System.out.println("#" + tc + " " + 1);
				    }
			    	break;
			    }else if(i == array_word.length/2) {
			    	if(!array_word[i].equals(array_word[i-1])) {
			    		System.out.println("#" + tc + " " + 0);
				    }else {
				    	System.out.println("#" + tc + " " + 1);
				    }
			    	break;
			    }
			}

			
			//System.out.println("#" + tc + " " + ans);
			
			
		}
		
		sc.close();

	}

}
