class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
str = str.replaceAll("[^a-z0-9]", "");
        int n=str.length();
        int i=0,j=n-1;
        int count=0;
        while(i<n/2&&j>=n/2){

           if( str.charAt(i)==str.charAt(j)){
            count++;
           }
           i++;
           j--;
        }
        if(count==n/2){
            return true;
        }
        return false;
    }
}
