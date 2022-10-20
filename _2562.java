package backjoon_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2562 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arry = new int[9];
		
		for(int i = 0; i < arry.length; i++ ) {
			
			arry[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arry[0];
		int count = 1;
		
		for(int i = 0; i < 9; i++) {
			if(max < arry[i]) {
				max = arry[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);

	}

}
