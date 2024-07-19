import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] rc = new int[2][3];
		
		for(int i = 0; i < 3; i++) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			rc[0][i] = Integer.parseInt(st.nextToken());
			rc[1][i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(find(rc[0]) + " " + find(rc[1]));
		br.close();
	}
	
	public static int find(int[] n) {
		if(n[0] == n[1]) {
			return n[2];
		} else if(n[0] == n[2]) {
			return n[1];
		}
		
		return n[0];
	} 

}
