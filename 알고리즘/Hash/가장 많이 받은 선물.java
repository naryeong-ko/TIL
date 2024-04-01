import java.util.*;

class Solution {
    class Friend {
        int point; // 선물지수
        int[] pGiveList; // 과거 친구 별 내가 선물 준 개수
        int cnt; // 다음 달에 받을 선물 수
        
        public Friend (int point, int[] pGiveList, int cnt) {
            this.point = point;
            this.pGiveList = pGiveList;
            this.cnt = cnt;
        }
    }

    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> idxMap = new HashMap<>(); // idx
        int flen = friends.length;
        Friend[] friendList = new Friend[flen];
        
        for(int i = 0; i < flen; i++) {
            idxMap.put(friends[i], i);
            friendList[i] = new Friend(0, new int[flen], 0);
        }
        
        for(String gift : gifts) {
            String[] who = gift.split(" ");
            int friend1 = idxMap.get(who[0]);
            int friend2 = idxMap.get(who[1]);
            
            friendList[friend1].point++;
            friendList[friend1].pGiveList[friend2]++;
            friendList[friend2].point--;
        }
        
        for(int i = 0; i < flen; i++) {
            for(int j = i + 1; j < flen; j++) {
                if(friendList[i].pGiveList[j] == friendList[j].pGiveList[i]) {
                    if(friendList[i].point != friendList[j].point) {
                        friendList[friendList[i].point > friendList[j].point? i : j].cnt++;             
                    }
                }else {
                    friendList[friendList[i].pGiveList[j] > friendList[j].pGiveList[i]? i : j].cnt++;
                }
            }
            
            if(answer < friendList[i].cnt) {
                answer = friendList[i].cnt;
            }
        }
        
        return answer;
    }
}
