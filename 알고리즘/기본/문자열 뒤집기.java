class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();

        answer.append(my_string.substring(s, e + 1));
        answer.reverse();

        answer.insert(0, my_string.substring(0, s));
        answer.append(my_string.substring(e + 1));

        return answer.toString();
    }
}
