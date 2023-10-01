class Solution {
    public String largestOddNumber(String num) {
        int idx = -1;
        for (int  i =0; i<num.length(); i++) {
            int currvalue = num.charAt(i) - '0';
            if ( currvalue%2 !=0 ) {
                idx = i;
            } 
        }
            if ( idx == -1) {
                return "";
            }
           
    
         return num.substring(0,idx +1) ;
    }
}