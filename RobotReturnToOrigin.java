class Solution {
    public boolean judgeCircle(String moves) {
        int UD=0;
        int LR=0;
        for(char move: moves.toCharArray()) {
            if(move=='U') UD++;
            if(move=='D') UD--;            
            if(move=='L') LR++;            
            if(move=='R') LR--;            
        }
        
        return UD==0 && LR==0;
        
    }
}
