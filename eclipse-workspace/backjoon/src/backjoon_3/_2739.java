package backjoon_3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2739 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());
		
		
		int i = 1;
		
		while(i < 10) {
			System.out.println(N + " * " + i + " = " + N*i);
			i++;
		}
		
		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(N + " * " + i + " = " + N*i);
//		}
//		
		
		
	}

}
