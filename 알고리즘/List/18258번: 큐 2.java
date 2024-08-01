import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push" :
                    list.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if(list.size() == 0) {
                        bw.write("-1\n");
                    }else {
                        bw.write(list.remove(0) + "\n");
                    }
                    break;
                case "size" :
                    bw.write(list.size() + "\n");
                    break;
                case "empty" :
                    if(list.size() == 0) {
                        bw.write("1\n");
                    }else {
                        bw.write("0\n");
                    }
                    break;
                case "front" :
                    if(list.size() == 0) {
                        bw.write("-1\n");
                    }else {
                        bw.write(list.get(0) + "\n");
                    }
                    break;
                case "back" :
                    if(list.size() == 0) {
                        bw.write("-1\n");
                    }else {
                        bw.write(list.get(list.size() - 1) + "\n");
                    }
                    break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
