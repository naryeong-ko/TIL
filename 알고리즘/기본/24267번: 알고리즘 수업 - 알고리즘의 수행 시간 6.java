import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(1l * n * (n - 1) * (n - 2) / 6 + "\n3");

        br.close();
    }

}