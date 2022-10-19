package backjoon_1;

import java.util.Scanner;

public class _3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] chess = new int[6];
		chess[0] = 1;
		chess[1] = 1;
		chess[2] = 2;
		chess[3] = 2;
		chess[4] = 2;
		chess[5] = 8;
		
		
				

		for(int i = 0; i < chess.length; i++) {
			chess[i] -= sc.nextInt();
			
		}
		
		for(int i : chess) {
			System.out.print(i + " ");
		}
		
		
//		
//		for(int i = 0; i < chess.length; i++) {
//			System.out.print(chess[i]+" ");
//		}
		
		

		
		
		
		
		//int king = 1;
		//int queen = 1;
		//int rook = 2;
		//int bishop = 2;
		//int knight = 2;
		//int pawn = 8;
		//
				
		
		
//		king -= sc.nextInt();
//		queen -= sc.nextInt();
//		rook -= sc.nextInt();
//		bishop -= sc.nextInt();
//		knight -= sc.nextInt();
//		pawn -= sc.nextInt();
//		
//		System.out.print(king + " ");
//		System.out.print(queen+ " ");
//		System.out.print(rook+ " ");
//		System.out.print(bishop+ " ");
//		System.out.print(knight+ " ");
//		System.out.print(pawn);
			
	}

}
