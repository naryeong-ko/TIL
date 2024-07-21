import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] min = new int[2]; // rc
		int[] max = new int[2]; // rc
		
		for(int i = 0; i < 2; i++) {
			min[i] = 10001;
			max[i] = -10001;
		}
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			find(min, max, Integer.parseInt(st.nextToken()), 0);
			find(min, max, Integer.parseInt(st.nextToken()), 1);
		}
		
		System.out.print((max[0] - min[0]) * (max[1] - min[1]));
		br.close();
	}
	
	public static void find(int[] min, int[] max, int n, int rc) {
		min[rc] = Math.min(min[rc], n);
		max[rc] = Math.max(max[rc], n);
	}

}
