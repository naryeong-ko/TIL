class Solution {
    /* 
    유클리드 호제법 사용해서 최대공약수와 최소공배수 구하기
    
    1. 최대공약수
     - 2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면, a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
     - O(logN)의 시간복잡도를 가진다.
    
    2. 최소공배수
     - a * b == 최대공약수 * 최소공배수
    */
    
    public int solution(int[] arr) {
        int answer = arr[0];
        int alen = arr.length;
        
        for(int i = 1; i < alen; i++){
            answer = lcm(answer, arr[i], gcd(answer, arr[i]));    
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){ // 최대공약수 구하기
        int remain = a % b;
        if(remain == 0){
            return b;
        }
        
        return gcd(b, remain);
    } 
    
    public int lcm(int a, int b, int gcd){ // 최소공배수 구하기
        return a * b / gcd;
    }
}
