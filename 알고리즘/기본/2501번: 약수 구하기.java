import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		System.out.print(find(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static int find(int a, int b) {
		int cnt = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				cnt++;
				if(cnt == b) {
					return i;
				}
			}
		}
		
		return 0;
	}

}
