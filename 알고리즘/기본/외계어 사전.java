class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String d : dic) {
            if(d.length() == spell.length) {
                boolean find = true;
                for(String s : spell) {
                    if(!d.contains(s)) {
                        find = false;
                        break;
                    }
                }

                if(find) {
                    return 1;
                }
            }
        }

        return 2;
    }
}
