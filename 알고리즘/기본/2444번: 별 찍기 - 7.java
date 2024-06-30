import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		int ans = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int sub = str.length() / 2;
		String str1 = sb.append(str.substring(0, sub)).reverse().toString();
		
		if(str.length() % 2 == 0) {
			if(str1.equals(str.substring(sub))) {
				ans = 1;				
			}
		} else {
			if(str1.equals(str.substring(sub + 1))) {
				ans = 1;
			}
		}
		
		System.out.print(ans);
	}

}
