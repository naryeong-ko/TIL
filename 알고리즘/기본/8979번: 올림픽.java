import java.io.*;
import java.util.*;

public class Main {
    private static class State {
        int n; // 국가 번호
        int g; // 금메달 개수
        int s; // 은메달 개수
        int b; // 동메달 개수

        public State(int n, int g, int s, int b) {
            this.n = n;
            this.g = g;
            this.s = s;
            this.b = b;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        int gState = -1;
        State[] states = new State[cnt];

        for(int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            states[i] = new State(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            if(states[i].n == goal) {
                gState = i;
            }
        }

        int answer = 1;
        for(int i = 0; i < cnt; i++) {
            if(states[i].g != states[gState].g) {
                if(states[i].g > states[gState].g) {
                    answer++;
                }

                continue;
            }

            if(states[i].s != states[gState].s) {
                if(states[i].s > states[gState].s) {
                    answer++;
                }

                continue;
            }

            if(states[i].b != states[gState].b && states[i].b > states[gState].b) {
                answer++;
            }
        }

        System.out.print(answer);
    }

}
