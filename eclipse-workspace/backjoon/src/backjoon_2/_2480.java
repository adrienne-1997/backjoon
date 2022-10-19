package backjoon_2;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class _2480 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =	new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		
		if(a == b && b == c) {
			System.out.println(10000 + a*1000);
			
		} else if(a == b) {
			System.out.println(1000 + a * 100);
			
			
		} else if(a == c) {
			System.out.println(1000 + a * 100);

			
		} else if(b == c){
			System.out.println(1000 + b * 100);

			
		} else {
			
			if(a > c && a > b) {
				System.out.println(a * 100);
			} else if( b > c && b > a) {
				System.out.println( b * 100);
			} else {
				System.out.println( c * 100);
			}
			
			
		}
	}

}
