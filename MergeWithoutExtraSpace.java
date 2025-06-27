//this 1st is brute force
import java.util.*;
class Solution {
    public void MergeWithoutExtraSpace(int a[], int b[]) {
        // code here
        int ia = 0;
        int i = 0;
        boolean status = false;
        while(i<a.length){
            ia = i;
            while(ia<a.length ){
                if(a[ia] > b[0]) {
                    // swap(a, ia, b, 0);
                    int temp = a[ia];
                    a[ia] = b[0];
                    b[0] = temp;
                    status = true;
                    i++;
                }
                ia++;
            }
            Arrays.sort(b);
            if(status == false){
                break;
            }
            i=0;
            status = false;
        }
        Arrays.sort(b);
    }
}


//optimum solution 2nd attempt (took a little help, but did it)
// User function Template for Java
import java.util.*;
class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int ia = a.length-1;
        int ib = 0;
        boolean status = false;
        while(ia>=0 && ib <b.length){
            if(a[ia] > b[ib]) {
                int temp = a[ia];
                a[ia] = b[ib];
                b[ib] = temp;
                status = true;
            }
            ia--;
            ib++;
            if(status == false){
                break;
            }
            status = false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
