import java.io.*;

public class Main {
    private static String finish = "end";
    private static String[] result = {" is not acceptable.\n", " is acceptable.\n"};
    private static char[] aeious = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String now = br.readLine();
            if(now.equals(finish)) {
                break;
            }

            bw.write("<" + now + ">");
            bw.write(result[checkStr(now)]);
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static int checkStr(String s) {
        int aeiou = 0;
        int cntA = 0;
        int cntB = 0;
        char before = '-';

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == before && before != 'e' && before != 'o') {
                return 0;
            }

            boolean find = false;
            for(int a : aeious) {
                if(s.charAt(i) == a) {
                    aeiou = 1;
                    find = true;

                    if(++cntA == 3) {
                        return 0;
                    }

                    cntB = 0;
                    break;
                }
            }

            if(!find) {
                if(++cntB == 3) {
                    return 0;
                }

                cntA = 0;
            }

            before = s.charAt(i);
        }

        return aeiou;
    }

}
