public class Valid Parentheses {
    //link https://leetcode.com/problems/valid-parentheses/
    class Solution {
    //this is brute force
    // public int push(char c, char[] arr,int idx ){
    //     arr[idx] = c;
    //     return ++idx;
    // }
    // public int pop(char[] arr, int idx ){
    //     arr[idx] = ' ';
    //     return --idx;
    // }
    public boolean isValid(String s) {
    //     if(s.length() % 2 != 0){
    //         return false;
    //     }
    //     char[] arr = new char[s.length()];
    //     int idx = 0;
    //     char c ;
    //     char p ;
    //     for(int i = 0; i < s.length(); i++){
    //         c = s.charAt(i);
    //         if(c == '(' || c == '[' || c=='{'){
    //             idx = push(c,arr,idx);
    //             continue;
    //         }
    //         if(idx == 0){
    //             return false;
    //         }
    //         p = arr[idx-1];
    //         if(p == '(' &&  c == ')' ){
    //             idx = pop(arr, idx);
    //         }else if(p == '{' &&  c == '}' ){
    //             idx = pop(arr, idx);
    //         }else if(p == '[' &&  c == ']' ){
    //             idx = pop(arr, idx);
    //         }else {
    //             return false;
    //         }
    //     }
    //     if(idx > 0){
    //         return false;
    //     }else{
    //         return true ;
    //     }
        //this is optimum approach

        int n = s.length();
        if(n % 2 != 0) return false;
        char[] arr = new char[n];
        int idx = 0;
        for (char c : s.toCharArray()){
            if(c == '('){
                arr[idx++] = ')';
            }else if(c == '['){
                arr[idx++] = ']';
            }else if(c == '{'){
                arr[idx++] = '}';
            }else{
                if(idx == 0 || c != arr[idx-1]){ return false;}
                else{
                    idx--;
                }
            }
        }
        
        return (idx == 0) ;
    }
}
}
