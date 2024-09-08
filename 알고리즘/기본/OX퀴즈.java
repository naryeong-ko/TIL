class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].split(" ");

            int c = q[1].equals("-") ? -1 : 1;
            answer[i] = Integer.parseInt(q[0]) + Integer.parseInt(q[2]) * c == Integer.parseInt(q[4])? "O" : "X";
        }

        return answer;
    }
}
