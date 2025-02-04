class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length) {
            return 1;
        }

        if(arr1.length < arr2.length) {
            return -1;
        }

        int sum1 = calSum(arr1);
        int sum2 = calSum(arr2);

        if(sum1 == sum2) {
            return 0;
        } else if(sum1 > sum2) {
            return 1;
        }
        return -1;
    }

    public int calSum(int[] arr) {
        int ret = 0;
        for(int a: arr) {
            ret += a;
        }
        return ret;
    }
}
