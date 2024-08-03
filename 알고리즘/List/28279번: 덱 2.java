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
            switch (Integer.parseInt(st.nextToken())) {
                case 1 :
                    list.add(0, Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    list.add(Integer.parseInt(st.nextToken()));
                    break;
                case 3 :
                    if(list.size() == 0) {
                        bw.write("-1\n");
                    }else {
                        bw.write(list.remove(0) + "\n");
                    }
                    break;
                case 4 :
                    if(list.size() == 0) {
                        bw.write("-1\n");
                    }else {
                        bw.write(list.remove(list.size() - 1) + "\n");
                    }
                    break;
                case 5 :
                    bw.write(list.size() + "\n");
                    break;
                case 6 :
                    if(list.size() == 0) {
                        bw.write("1\n");
                    }else {
                        bw.write("0\n");
                    }
                    break;
                case 7 :
                    if(list.size() == 0) {
                        bw.write("-1\n");
                    }else {
                        bw.write(list.get(0) + "\n");
                    }
                    break;
                case 8 :
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
