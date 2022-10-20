package backjoon_4;


import java.io.BufferedReader; 
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class _10818 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		int[] arry = new int[N];
		
		
		for(int i = 0; i < N; i++) {
			
			arry[i] = Integer.parseInt(st.nextToken());
			
		}
	
		
	
		
//		Arrays.sort(arry);
//		
//		System.out.println(arry[N-1] + " " + arry[0]);

		int max = arry[0];
		for(int i = 0; i < arry.length; i++) {
			if(arry[i] < max) {
				max = arry[i];
			}
		}
		
		int min = arry[0];
		for(int i = 0; i < arry.length; i++) {
			if(arry[i] > min){
				min = arry[i];
			}
		}
		
		System.out.println(max + " " + min);
		
		
	}

}
