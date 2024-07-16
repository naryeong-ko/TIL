import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = -1;
		
		if(M == 1) {
			M++;
		}
		
		for(int i = M; i <= N ; i++) {
			boolean yes = true;
			for(int j = 2; j * j <= i; j++) {
				if(i % j == 0) {
					yes = false;
					break;
				}				
			}
			
			if(yes) {
				sum += i;
				
				if(min == -1) {
					min = i;
				}
			}
		}
		
		if(min == -1) {
			System.out.print(-1);
		} else {
			System.out.print(sum + "\n" + min);			
		}
	}

}
