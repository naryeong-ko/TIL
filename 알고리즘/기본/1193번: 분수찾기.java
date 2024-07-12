import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int sum = 0;
		int cnt = 0;
		
		while(sum < X) {
			sum += ++cnt;
		}
		
		int tmp = sum - X;
		if(cnt % 2 == 0) {			
			System.out.print((cnt - tmp) + "/" + (tmp + 1));
		} else {
			System.out.print((tmp + 1) + "/" + (cnt - tmp));
		}
	}

}
