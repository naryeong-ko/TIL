import java.util.*;
import java.io.*;

public class Main {
	private static class Tomato {
		int r;
		int c;
		int day;

		public Tomato(int r, int c, int day) {
			this.r = r;
			this.c = c;
			this.day = day;
		}
	}

	private static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	private static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		int ans = 0; // 처음부터 모두 익은 토마토일 경우로 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		boolean[][] visited = new boolean[N][M]; // 안 익은 토마토만 false
		Queue<Tomato> q = new LinkedList<>(); // 익은 토마토 큐
		int cntYet = 0; // 안 익은 토마토 개수

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int now = Integer.parseInt(st.nextToken());
				if (now != 0) { // 익은 토마토거나 빈 상자일 때
					visited[i][j] = true;
					if (now == 1) { // 익은 토마토인 경우
						q.add(new Tomato(i, j, 0));
					}
				} else {
					cntYet++;
				}
			}
		}

		if (q.size() != N * M) { // 모두 익은 토마토가 아니면
			ans = yetToWellTomato(q, visited, N, M, cntYet);
		}

		System.out.print(ans);

	}

	public static int yetToWellTomato(Queue<Tomato> q, boolean[][] visited, int N, int M, int cntYet) {
		int ret = 0;// 지난 날짜 최댓값
		int cntWell = q.size(); // 익은 토마토 수
		int cntNo = N * M - cntWell - cntYet; // 빈 칸 수

		while (!q.isEmpty()) {
			Tomato now = q.poll();
			ret = Math.max(ret, now.day);

			for (int d = 0; d < 4; d++) {
				int nextR = now.r + dr[d];
				int nextC = now.c + dc[d];

				if (nextR < 0 || nextR >= N || nextC < 0 || nextC >= M || visited[nextR][nextC]) {
					continue;
				}

				cntWell++;
				q.add(new Tomato(nextR, nextC, now.day + 1));
				visited[nextR][nextC] = true;
			}
		}

		if (cntWell + cntNo != N * M) { // 다 익지 못 했다면
			return -1;
		}
		return ret;
	}

}
