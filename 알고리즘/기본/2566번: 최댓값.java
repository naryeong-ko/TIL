import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxV = 0;
		int r = 0;
		int c = 0;
				
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				int n = Integer.parseInt(st.nextToken());
				if(maxV < n) {
					maxV = n;
					r = i;
					c = j;
				}
			}
		}
		
		System.out.println(maxV);
		System.out.print(++r + " " + ++c);
	}

}
