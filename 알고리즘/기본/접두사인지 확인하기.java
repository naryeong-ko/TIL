class Solution {
    public int solution(String my_string, String is_prefix) {
        if(my_string.length() >= is_prefix.length() && my_string.substring(0, is_prefix.length()).equals(is_prefix)) {
            return 1;
        }
        return 0;
    }
}
