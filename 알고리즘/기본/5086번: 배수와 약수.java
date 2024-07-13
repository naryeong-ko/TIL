import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String[] input = br.readLine().split(" ");
			int[] nums = {Integer.parseInt(input[0]), Integer.parseInt(input[1])}; 
			
			if(nums[0] == 0 && nums[1] == 0) {
				break;
			}
			
			if(nums[1] % nums[0] == 0) {
				sb.append("factor\n");
			} else if(nums[0] % nums[1] == 0) {
				sb.append("multiple\n");				
			} else {
				sb.append("neither\n");								
			}
		}

		System.out.print(sb.toString());
	}

}
