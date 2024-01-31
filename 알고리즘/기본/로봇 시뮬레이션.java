import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	private static class Robot {
		int c;
		int r;
		int dir;

		public Robot(int r, int c, int dir) {
			this.c = c;
			this.r = r;
			this.dir = dir;
		}
	}

	// dir 왼쪽으로 회전
	private static int[] dc = { 0, 1, 0, -1 }; // 왼쪽으로 회전 0(E 우) 1 (N 상) 2 (W 좌) 3 (S 하)
	private static int[] dr = { 1, 0, -1, 0 };
	private static boolean[][] mapR; // 로봇 위치 기록
	private static Robot[] robots; // 로봇 기록
	private static int N; // 로봇 개수
	private static int A; // 가로 길이
	private static int B; // 세로 길이

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] ans = new int[3]; // 성공 여부(0:성공 , 1: 벽, 2: 충돌), 실패한 로봇, 충돌된 로봇 아이디

		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()); // 명령 개수

		mapR = new boolean[B + 1][A + 1];
		robots = new Robot[N + 1];
		Map<String, Integer> map = new HashMap<>();
		map.put("E", 0);
		map.put("N", 1);
		map.put("W", 2);
		map.put("S", 3);

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			robots[i] = new Robot(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					map.get(st.nextToken()));
			mapR[robots[i].c][robots[i].r] = true;
		}

		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());

			if (ans[0] != 0) {
				continue;
			}

			int robotId = Integer.parseInt(st.nextToken());
			String todo = st.nextToken(); // 명령
			int cnt = Integer.parseInt(st.nextToken());

			if (todo.equals("L")) { // 명령 L
				turnLeft(robotId, cnt);
			} else if (todo.equals("R")) { // 명령 R
				turnRight(robotId, cnt);
			} else { // 명령 F
				int[] goStraightResult = goStraight(robotId, cnt);
				ans[0] = goStraightResult[0];
				ans[1] = robotId;
				ans[2] = goStraightResult[1];
			}

		}

		if (ans[0] == 0) {
			System.out.print("OK");
		} else if (ans[0] == 1) {
			System.out.print("Robot " + ans[1] + " crashes into the wall");
		} else {
			System.out.print("Robot " + ans[1] + " crashes into robot " + ans[2]);
		}
	}

	public static void turnLeft(int robotId, int cnt) { // 좌측 방향 회전
		robots[robotId].dir = (robots[robotId].dir + cnt) % 4;
	}

	public static void turnRight(int robotId, int cnt) { // 우측 방향 회전
		cnt %= 4;
		robots[robotId].dir = (4 + robots[robotId].dir - cnt) % 4;
	}

	public static int[] goStraight(int robotId, int cnt) {
		int[] ret = new int[2]; // 성공여부(0:성공 , 1: 벽, 2: 충돌), 충돌실패시 만난 로봇 번호
		Robot nRobot = robots[robotId];
		int nextR = nRobot.r;
		int nextC = nRobot.c;

		for (int i = 0; i < cnt; i++) {
			nextR += dr[nRobot.dir];
			nextC += dc[nRobot.dir];

			if (nextR > A || nextR <= 0 || nextC > B || nextC <= 0) { // 벽
				ret[0] = 1;
				return ret;
			}

			if (mapR[nextC][nextR]) { // 다른 로봇 충돌
				ret[0] = 2;
				ret[1] = findCrashedRobot(nextR, nextC);
				return ret;
			}
		}

		// 성공
		mapR[nRobot.c][nRobot.r] = false;
		robots[robotId].r = nextR;
		robots[robotId].c = nextC;
		mapR[nextC][nextR] = true;

		return ret;
	}

	public static int findCrashedRobot(int r, int c) { // 부딪힌 로봇 번호
		for (int i = 1; i <= N; i++) {
			if (robots[i].r == r && robots[i].c == c) {
				return i;
			}
		}

		return 0;
	}
}
