class Solution {
    public int findNumbers(int[] nums) {
        int result_count = 0;

        for (int i=0;i<nums.length;i++){
            int digit_count = 0;
            int n = nums[i];

            while(n!=0){
                n/=10;
                digit_count++;
            }

            if (digit_count%2==0){
                result_count++;
            }
        }
        return result_count;
    }
}