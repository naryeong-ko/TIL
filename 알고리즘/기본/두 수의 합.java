class Solution {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        a = sb.reverse().toString();
        sb = new StringBuilder(b);
        b = sb.reverse().toString();

        if(a.length() < b.length()) {
            String tmp = "";
            tmp = a;
            a = b;
            b = tmp;
        }

        return cal(a, b);
    }


    public String cal(String a, String b) {
        int last = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < b.length(); i++) {
            int na = a.charAt(i) - '0';
            int nb = b.charAt(i) - '0';
            last += na + nb;
            sb.insert(0, last % 10);
            last /= 10;
        }

        for(int i = b.length(); i < a.length(); i++) {
            int na = a.charAt(i) - '0';
            last += na;
            sb.insert(0, last % 10);
            last /= 10;
        }

        while(last > 0) {
            sb.insert(0, last % 10);
            last /= 10;
        }

        return sb.toString();
    }

}
