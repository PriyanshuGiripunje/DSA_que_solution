public class PlusOneHardWay {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        long number=0L;
        for(int i = 0, j = digits.length-1; i < digits.length ; i++,j--){
            number = number + (long) (digits[i] * Math.pow(10,j));
        }

        //increment
        number+=1L;

        int count = 0;
        for( count = 0; (number / ((int) Math.pow(10,count))) != 0 ; count++){
        }
        if(count == size){
            for(int i = size-1, j=0; i>=0 ; i--,j++){
                digits[j] =(int) (number / ((long) Math.pow(10,i)));
                number -= digits[j] * ((long) Math.pow(10,i));
            }
            return digits;
        }else {
            int [] arr = new int[count];
            for(int i = count-1, j=0; i>=0 ; i--,j++){
                arr[j] = (int) (number / ((long) Math.pow(10,i)));
                number = number - arr[j] * ((long) Math.pow(10,i)) ;
            }
            return arr;
        }
        // return ;
    }
}
