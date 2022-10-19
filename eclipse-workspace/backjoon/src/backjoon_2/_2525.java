package backjoon_2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2525 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		
		
		if(A+((B+C)/60) >= 24) {
			A = (A+((B+C)/60)) - 24 ;
			B = (B+C) % 60 ;
			
			System.out.println(A + " " + B);
			
		} else {
			A = (A+((B+C)/60));
			B =(B+C) % 60 ;
			System.out.println(A + " " + B);
		}
		
		
		
		
	}

}
