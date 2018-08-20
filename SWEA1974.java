package com.study.code.solved;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA1974 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int tcN = sc.nextInt();

		for (int tc = 1; tc <= tcN; tc++) {
			int ans = 1;
			int[][] sdoku = new int[9][9];
			List<Integer> arr = new ArrayList<>();//검사 배열
			
			//배열 넣기 & 가로 검사
			for(int i = 0; i < 9; i++) {
				for(int j =0; j < 9; j++) {
					sdoku[i][j] = sc.nextInt();
					arr.add(sdoku[i][j]);
				}
				//System.out.println(arr.toString());
				for(int j = 1; j < 10; j++) {
					if(!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
			}
			
			//세로 검사
			if(ans == 1) {
				for(int i = 0; i < 9; i++) {
					for(int j =0; j < 9; j++) {
						arr.add(sdoku[j][i]);
					}
					//System.out.println(arr.toString());
					for(int j = 1; j < 10; j++) {
						if(!arr.contains(j)) {
							ans = 0;
							break;
						}
					}
					arr.removeAll(arr);
				}
			}
			
			//네모네모 검사
			if(ans == 1) {
				int x = 0;
				int y = 0;
				
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
				x += 3;
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
				x += 3;
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
				x = 0;
				y += 3;
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
				x += 3;
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
				x += 3;
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
				x = 0;
				y += 3;
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
				x += 3;
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}
				arr.removeAll(arr);
				x += 3;
				for (int r = 0; r < 3; r++) {
					for (int t = 0; t < 3; t++) {
						arr.add(sdoku[y+t][x+r]);
					}
				}
				//System.out.println(arr.toString());
				for (int j = 1; j < 10; j++) {
					if (!arr.contains(j)) {
						ans = 0;
						break;
					}
				}

				arr.removeAll(arr);

			}
			

			System.out.println("#" + tc + " " +  ans);
		}
		
		sc.close();

	}

}

// 다른 사람 코드
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
// 
//public class Solution{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int tn=Integer.parseInt(br.readLine());
//        StringTokenizer st=null;
//         
//        for(int i=1;i<=tn;i++) {
//            int[][] matrix=new int[9][9];
//            boolean[][] RCChecker=new boolean[10][10];
//            int result=1;
//             
//            for(int j=0;j<9;j++) {
//                st=new StringTokenizer(br.readLine());
//                for(int k=0;k<9;k++) {
//                    matrix[j][k]=Integer.parseInt(st.nextToken());
//                }
//            }
//             
//            for(int j=0;j<9;j++) {
//                boolean[] rowChecker=new boolean[10];
//                boolean[] colChecker=new boolean[10];
//                for(int k=0;k<9;k++) {
//                    if(!rowChecker[matrix[j][k]]) {
//                        rowChecker[matrix[j][k]]=true;
//                    }else {
//                        result--;
//                        break;
//                    }
//                    if(!colChecker[matrix[k][j]]) {
//                        colChecker[matrix[k][j]]=true;
//                    }else {
//                        result--;
//                        break;
//                    }
//                     
//                    int R=(j/3)*3+k/3;
//                    if(!RCChecker[R][matrix[j][k]]) {
//                        RCChecker[R][matrix[j][k]]=true;
//                    }else {
//                        result--;
//                        break;
//                    }
//                     
//                }
//                if(result!=1)break;
//            }
//             
//                         
//            System.out.println("#"+i+" "+result);
//        }
//    }
//}