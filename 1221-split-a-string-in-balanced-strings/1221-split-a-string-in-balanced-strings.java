import java.util.*;
class Solution {
    public int balancedStringSplit(String s) {
        // int Rcount = 0;
        // int Lcount = 0;
        // int split = 0;
        // for(int i = 0; i<s.length(); i++){
        //     if(s.charAt(i)=='R')
        //         Rcount++;
        //     else
        //         Lcount++;
        //     if(Rcount==Lcount){
        //         split++;
        //         Rcount = 0;
        //         Lcount = 0;
        //     }
        // }
        int count = 0; int split=0;
        for(int i=0; i<s.length();i++){
            count += s.charAt(i) == 'R' ? 1 : -1;
            if(count==0)
                split++;
        }
        return split;
    }
}