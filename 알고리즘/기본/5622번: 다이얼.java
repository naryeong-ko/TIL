import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int ans = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'P') {
				ans += 8;
				continue;
			}
			
			if(str.charAt(i) == 'Z') {
				ans += 10;
				continue;
			}
			
			int num = str.charAt(i) - 'A';
			if(num < 15) {
				ans += num / 3 + 3;				
			} else {
				ans += (num - 1) / 3 + 3;
			}
		}
		
		System.out.print(ans);
	}

}
