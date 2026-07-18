class Solution {
    public boolean isPalindrome(int x) {
        int temp;
        temp = x;
        int r = 0;
        if (x<0) {
            return false;
         }
        do {
            r = r*10+(temp%10);       // to store the digit again from back, while multiply by 10 define its place
            temp = temp/10;      //to remove the last digit each time the loop runs

            
            
        } while(temp!=0);
         if (r==x) {
            return true;
         }
         
        
        return false;
    }

}