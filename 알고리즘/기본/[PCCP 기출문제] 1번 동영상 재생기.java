class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        StringBuilder answer = new StringBuilder();
        int vlen = clockToNum(video_len);
        int ops = clockToNum(op_start);
        int ope = clockToNum(op_end);
        int p = clockToNum(pos);

        if(p >= ops && p <= ope) {
            p = ope;
        }

        for(String c : commands) {
            if(c.equals("prev")) {
                p -= 10;
                if(p < 0) {
                    p = 0;
                }
            } else {
                p += 10;
                if(p > vlen) {
                    p = vlen;
                }
            }

            if(p >= ops && p <= ope) {
                p = ope;
            }
        }

        int m = p / 60;
        if(m < 10) {
            answer.append(0);
        }
        answer.append(m).append(":");

        int s = p % 60;
        if(s < 10) {
            answer.append(0);
        }
        answer.append(s);

        return answer.toString();
    }

    public int clockToNum(String clock) {
        return Integer.parseInt(clock.substring(0,2)) * 60 + Integer.parseInt(clock.substring(3));
    }
}
