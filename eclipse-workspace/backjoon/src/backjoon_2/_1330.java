package backjoon_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;



public class _1330 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		
		if(A > B) {
			System.out.println(">");
			
		} else if(A < B) {
			System.out.println("<");
			
		} else {
			System.out.println("==");
		}
		
		

	}

}
