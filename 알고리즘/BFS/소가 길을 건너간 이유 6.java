import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static class Pos {
		int r;
		int c;

		public Pos(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	private static int[] dr = { -1, 0, 1, 0 }; // 상좌하우
	private static int[] dc = { 0, -1, 0, 1 };
	private static boolean[][] mapK; // 소 위치 기록
	private static boolean[][][] mapR; // 길 위치 기록

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 맵 한 변 길이
		int K = Integer.parseInt(st.nextToken()); // 소 마릿수
		int R = Integer.parseInt(st.nextToken()); // 길 개수

		mapK = new boolean[N + 1][N + 1];
		mapR = new boolean[N + 1][N + 1][4];
		Pos[] cows = new Pos[K]; // bfs 호출하기 위한 소 위치 저장

		for (int i = 0; i < R; i++) { // 길 입력
			st = new StringTokenizer(br.readLine());
			int r1 = Integer.parseInt(st.nextToken());
			int c1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());

			for (int d = 0; d < 4; d++) {
				if (r1 + dr[d] == r2 && c1 + dc[d] == c2) {
					mapR[r1][c1][d] = true;
					mapR[r2][c2][(d + 2) % 4] = true;
					break;
				}
			}
		}

		for (int i = 0; i < K; i++) { // 소 입력
			st = new StringTokenizer(br.readLine());
			cows[i] = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			mapK[cows[i].r][cows[i].c] = true;
		}

		int ans = 0;
		for (int i = 0; i < K; i++) {
			ans += bfs(cows[i], N, K);
		}

		System.out.print(ans / 2);
	}

	public static int bfs(Pos cow, int N, int K) {
		int ret = 0;
		boolean[][] visited = new boolean[N + 1][N + 1];
		Queue<Pos> q = new LinkedList<Main.Pos>();

		q.add(new Pos(cow.r, cow.c));
		visited[cow.r][cow.c] = true;

		while (!q.isEmpty()) {
			Pos nPos = q.poll();

			for (int d = 0; d < 4; d++) {
				if (mapR[nPos.r][nPos.c][d]) { // 길 여부 확인
					continue;
				}

				int nextR = nPos.r + dr[d];
				int nextC = nPos.c + dc[d];

				if (nextR < 1 || nextR > N || nextC < 1 || nextC > N || visited[nextR][nextC]) { // 맵 범위, 방문 여부 확인
					continue;
				}

				if (mapK[nextR][nextC]) { // 소 유무 확인
					ret++;
				}

				visited[nextR][nextC] = true;
				q.add(new Pos(nextR, nextC));
			}
		}

		return K - 1 - ret; // 못 만난 소 마릿수
	}

}
