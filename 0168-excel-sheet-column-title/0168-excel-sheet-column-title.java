class Solution {
    public String convertToTitle(int columnNumber) {
        String r = "";

        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber % 26;

            char c = (char) ('A' + rem);

            r = c + r;

            columnNumber = columnNumber/26;
 
        }

        return r;
    }
}