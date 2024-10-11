class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for(int i = 0; i < picture.length; i++) {
            String s = makeR(picture[i], k);

            for(int j = 0; j < k; j++) {
                answer[i * k + j] = s;
            }
        }

        return answer;
    }

    public String makeR(String p, int k) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < p.length(); i++) {
            for(int j = 0; j < k; j++) {
                sb.append(p.charAt(i));
            }
        }

        return sb.toString();
    }
}
