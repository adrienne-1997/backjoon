package backjoon_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8393 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int i = 1;
		
		int x = 0;
		
		while(i <= n) {
			
			x += i;
			i++;
		}
		
		System.out.println(x);
	}

}
