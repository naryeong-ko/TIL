import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int nIdx = 0;

        for(int i = 0; i < 3; i++) {
            String s = br.readLine();
            if(s.charAt(0) != 'F' && s.charAt(0) != 'B') {
                num = Integer.parseInt(s);
                nIdx = i;
            }
        }

        int ansNum = num + 3 - nIdx;
        String ans = "";
        if(ansNum % 3 == 0) {
            ans = "Fizz";
            if(ansNum % 5 == 0) {
                ans = "FizzBuzz";
            }
        } else if (ansNum % 5 == 0) {
            ans = "Buzz";
        }

        if(ans.length() == 0) {
            System.out.print(ansNum);
        } else {
            System.out.print(ans);
        }
    }

}
