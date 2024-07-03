import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] inputs = new String[5];
		int maxLen = 0;

		for (int i = 0; i < 5; i++) {
			inputs[i] = br.readLine();
			maxLen = Math.max(inputs[i].length(), maxLen);
		}

		for (int i = 0; i < maxLen; i++) {
			for (int j = 0; j < 5; j++) {
				if (inputs[j].length() > i) {
					sb.append(inputs[j].charAt(i));
				}
			}
		}
		
		System.out.print(sb.toString());
	}

}
