package backjoon_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class _10430 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A%C) * (B%C)) % C);
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int C = sc.nextInt();
//		
//		sc.close();
//		

//	
//		

	}


}
