class RomanToInt {
    public int romanToInt(String s) {
        String[][] map = {
                {"I", "1"},
                {"V", "5"},
                {"X", "10"},
                {"L", "50"},
                {"C", "100"},
                {"D", "500"},
                {"M", "1000"}
        };
        int[] assign = new int[s.length()];
        int ans = 0;
        for(int i = 0; i<s.length();i++){
            for(int j = 0; j < map.length; j++){
                if((s.charAt(i)) == (map[j][0].charAt(0))){
                    assign[i] = Integer.parseInt(map[j][1]);
                    break;
                }
            }
        }
        if(s.length() == 1)
            ans =  assign[0]  ;

        for(int i = 1; i<assign.length ; i++){
            if(assign[i-1] < assign[i]){
                ans += (assign[i] - assign[i-1]);
                continue;
            }
            if(i == 1){
                ans = assign[0];
            }
            if(i<assign.length-1){
                if(assign[i] < assign[i+1]){
                    ans += (assign[i+1] - assign[i]);
                    i++;
                    continue;
                }
            }
            ans += assign[i];
        }
        return ans;
    }
}