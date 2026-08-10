class Solution {
    public boolean isPalindrome(int x) {
        int o = x;
        int rev = 0;
        while(o>0){
            int rem = o%10;
            rev  = rev*10 + rem;
            o = o/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}