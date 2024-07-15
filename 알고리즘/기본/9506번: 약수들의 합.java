import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) {
				break;
			}
			
			sb.append(find(n) + "\n");
		}

		System.out.print(sb.toString());
	}
	
	public static String find(int n) {
		int sum = 1;
		StringBuilder sb = new StringBuilder();
		sb.append(n + " = 1");
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				sum += i;
				sb.append(" + " + i);
			}
		}
		
		
		if(sum == n) {
			return sb.toString();
		}
		
		return n + " is NOT perfect.";
	}

}
