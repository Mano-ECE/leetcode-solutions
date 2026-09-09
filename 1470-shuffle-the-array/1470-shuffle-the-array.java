class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];

        int a=0,t=n;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i] = nums[a];
                a++;
            }
            else{
                res[i] = nums[t];
                t++;
            }
        }
        return res;
    }
}