import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        
        long ans = 1;
        
        while(N > 1) {
            ans *= N--;
        }

        System.out.print(ans);
    }
    
}
