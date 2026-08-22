import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            if (set.contains(n)){
                return false;
            }
            set.add(n);

            int summ=0;
            while(n>0){
                int rem = n%10;
                summ = summ + rem*rem;
                n=n/10;
            }
            n=summ;
        }
        
        return true;
    }
}