import java.util.*;
public class WordBreak {
    //tc = O(n^3)
    //sc = O(n) + O(m*l)
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> words = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && words.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
