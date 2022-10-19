package backjoon_3;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _25304 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  ;
		
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		
		int[] c = new int[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			c[i] = a * b;
			
		}
		
		int sum = 0;
		
		for(int i = 0; i < c.length; i++) {
			sum += c[i];
			
		}
		
		
		

		
		if(sum == X) {
			System.out.println("Yes");
			
		} else {
			System.out.println("No");
		}

	}

}
