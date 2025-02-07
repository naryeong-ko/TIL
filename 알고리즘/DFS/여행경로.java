import java.util.*;

class Solution {
    List<String> result;
    boolean[] visited;

    public String[] solution(String[][] tickets) {
        result = new ArrayList<>();
        visited = new boolean[tickets.length];

        getResult(tickets, "ICN", "ICN", 0);

        Collections.sort(result);
        String[] answer = result.get(0).split(",");
        return answer;
    }

    public void getResult(String[][] tickets, String now, String route, int cnt) {
        if(cnt == tickets.length) {
            result.add(route);
            return;
        }

        for(int i = 0; i < tickets.length; i++) {
            if(!visited[i] && now.equals(tickets[i][0])) {
                visited[i] = true;
                getResult(tickets, tickets[i][1], route + "," + tickets[i][1], cnt + 1);
                visited[i] = false;
            }
        }
    }
}
