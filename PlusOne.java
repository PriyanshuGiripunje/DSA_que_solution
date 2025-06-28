class PlusOne {
    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        int i = last;
        if(last == 0){
            if(digits[0] == 9){
                digits = new int[2];
                digits[0] = 1;
            }else{
                digits[0]++;
            }
            return digits;
        }

        int count=0;
        while(i>=0){
            if(digits[i] == 9){
                digits[i] = 0;
                count++;
                i--;
                continue;
            }else{
                digits[i]++;
                return digits;
                // break;
            }
        }
        if(count == last+1){
            digits = new int[last+2];
            digits[0] = 1;
        }
        return digits;
    }
}