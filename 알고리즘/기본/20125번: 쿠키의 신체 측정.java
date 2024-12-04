import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] board = new String[N];

        for(int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        int[] head = {-1, -1};
        for(int i = 0; i < N && head[0] == -1; i++) {
            for(int j = 1; j < N; j++) {
                if(board[i].charAt(j) == '*') {
                    head[0] = i;
                    head[1] = j;
                    break;
                }
            }
        }

        for(int i = head[0] + 1; i < N; i++) { // 심장
            if(board[i].charAt(head[1] + 1) == '*') {
                System.out.println((i + 1) + " " + (head[1] + 1));
                head[0] = i;
                break;
            }
        }

        boolean find = false;
        for(int i = head[1] - 1; i >= 0; i--) { // 왼쪽 팔
            if(board[head[0]].charAt(i) != '*') {
                System.out.print(head[1] - i - 1 + " ");
                find = true;
                break;
            }
        }
        if(!find) {
            System.out.print(head[1] + " ");
        }

        find = false;
        for(int i = head[1] + 1; i < N; i++) { // 오른쪽 팔
            if(board[head[0]].charAt(i) != '*') {
                System.out.print(i - head[1] - 1 + " ");
                find = true;
                break;
            }
        }
        if(!find) {
            System.out.print(N - head[1] - 1 + " ");
        }

        for(int i = head[0] + 1; i < N; i++) { // 허리
            if(board[i].charAt(head[1]) != '*') {
                System.out.print(i - head[0] - 1 + " ");
                head[0] = i - 1;
                break;
            }
        }

        find = false;
        for(int i = head[0] + 1, j = head[1] - 1; i < N; i++) { // 왼쪽 다리
            if(board[i].charAt(j) != '*') {
                System.out.print(i - head[0] - 1 + " ");
                find = true;
                break;
            }
        }
        if(!find) {
            System.out.print(N - head[0] - 1 + " ");
        }

        find = false;
        for(int i = head[0] + 1, j = head[1] + 1; i < N; i++) { // 오른쪽 다리
            if(board[i].charAt(j) != '*') {
                System.out.print(i - head[0] - 1);
                find = true;
                break;
            }
        }
        if(!find) {
            System.out.print(N - head[0] - 1);
        }

        br.close();
    }

}
