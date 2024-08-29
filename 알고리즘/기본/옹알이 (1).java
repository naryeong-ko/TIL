class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String b : babbling) {
            int blen = b.length();
            boolean ok = true;

            for(int i = 0; i < blen && ok; i++) {
                switch (b.charAt(i)) {
                    case 'a':
                        if(i + 2 < blen && b.charAt(i + 1) == 'y' && b.charAt(i + 2) == 'a') {
                            i += 2;
                        } else {
                            ok = false;
                        }
                        break;
                    case 'y':
                        if(i + 1 < blen && b.charAt(i + 1) == 'e') {
                            i++;
                        } else {
                            ok = false;
                        }
                        break;
                    case 'w':
                        if(i + 2 < blen && b.charAt(i + 1) == 'o' && b.charAt(i + 2) == 'o') {
                            i += 2;
                        } else {
                            ok = false;
                        }
                        break;
                    case 'm':
                        if(i + 1 < blen && b.charAt(i + 1) == 'a') {
                            i++;
                        } else {
                            ok = false;
                        }
                        break;
                    default :
                        ok = false;
                }
            }

            if(ok) {
                answer++;
            }
        }

        return answer;
    }
}
