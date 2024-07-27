import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(st.nextToken().equals("leave")) {
                set.remove(name);
            } else {
                set.add(name);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = set.size();
        int idx = 0;
        String[] arr = new String[size];
        for(String s : set) {
            arr[idx++] = s;
        }

        Arrays.sort(arr);
        while(idx-- > 0) {
            bw.write(arr[idx] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
