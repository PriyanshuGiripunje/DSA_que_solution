public class IsPalindrome {
    //approach 1
    //where we check for every place using 2 pointer technique
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder();
        s.append(x);
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    //now the approach 2
    //in this instead of checking for each and every place
    // we will just reverse the number using digit seperator
    // and check whether they are equal or not
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int num = x;
        while(num > 0){
            rev = rev*10 + num % 10;
            num = num/10;
        }
        return (rev == x);
    }


}
