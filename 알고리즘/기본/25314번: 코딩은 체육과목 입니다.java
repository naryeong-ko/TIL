import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int i = 0;
        while(i++ < N / 4) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.print(sb.toString());
    }

}
