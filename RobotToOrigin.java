class RobotToOrigin {
    static int i = 0, j = 1;
    static int[] initPos = {0,0};
    static int[] afterOperation = {0,0};
    public static void up(int[] a ){
        a[i] = a[i] - 1;
    }
    public static void down(int[] a){
        a[i] = a[i] + 1; 
    }
    public static void right(int[] a){
        a[j] = a[j] + 1;
    }
    public static void left(int[] a){
        a[j] = a[j] - 1;
    }
    public static boolean judgeCircle(String moves) {
        for(int z= 0; z<moves.length(); z++){
            char temp = moves.charAt(z);
            switch (temp) {
                case 'R':
                    right(afterOperation);
                    break;
                
                    case 'U':
                    up(afterOperation);
                    break;
                
                    case 'L':
                    left(afterOperation);
                    break;
                
                    case 'D':
                    down(afterOperation);
                    break;
                
            
                default:
                    break;
            }
        }
        if(  initPos[i] == afterOperation[i]  && initPos[j] == afterOperation[j]  ){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String moves = "RLUURDDDLU";
        System.out.println(judgeCircle(moves));
    }
}