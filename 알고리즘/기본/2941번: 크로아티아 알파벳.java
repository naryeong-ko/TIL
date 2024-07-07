import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            ans++;

            if(i < str.length() - 1) {
                if(str.charAt(i) == 'c') {
                    if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                        i++;
                    }
                } else if(str.charAt(i) == 'd') {
                    if(str.charAt(i + 1) == '-') {
                        i++;
                    } else if(i < str.length() - 2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                        i += 2;
                    }
                } else if(str.charAt(i) == 'l' && str.charAt(i + 1) == 'j' || str.charAt(i) == 'n' && str.charAt(i + 1) == 'j' || str.charAt(i) == 's' && str.charAt(i + 1) == '=' || str.charAt(i) == 'z' && str.charAt(i + 1) == '=') {
                    i++;
                }
            }
        }

        System.out.print(ans);
    }
}
