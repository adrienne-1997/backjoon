package backjoon_1;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		double B = Double.parseDouble(br.readLine());
		
		
		
		int[] num2 = new int[3];
		
		int i = 0 ;
		while(true){
			
			num2[i] = (int)(B % 10);
			
			B = B / 10;
			
			++i;
			
			if(i == 3) {
				
				B = (B * 1000);
				break;
			}
				
		}
		
		System.out.println(A * num2[0]);
		System.out.println(A * num2[1]);
		System.out.println(A * num2[2]);
		System.out.println(A * (int)B);
		
		
	}

}
