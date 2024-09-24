class Solution {
    public int solution(int a, int b) {
        b /= getGcd(a, b);
        while(true) {
            if(b % 2 ==0) {
                b /=2;
                continue;
            }

            if(b % 5 == 0) {
                b /= 5;
                continue;
            }

            break;
        }

        if(b > 1) {
            return 2;
        }
        return 1;
    }

    public static int getGcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return getGcd(b, a % b);
    }
}
