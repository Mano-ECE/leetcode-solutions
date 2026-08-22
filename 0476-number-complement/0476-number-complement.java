class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        int bits = binary.length();
        int mask = (1<<bits) - 1 ;

        return (num^mask);
    }
}