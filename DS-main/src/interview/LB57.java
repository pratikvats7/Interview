package interview;

import java.util.ArrayList;
import java.util.List;

public class LB57 {
    public static void main(String[] args) {
        find_permutation("ABC");
    }
    public static List<String> find_permutation(String S) {
        // Code here
        //for(int i =0;i<S.length();i++) {
        List<String> ans = new ArrayList<>();
            find_permutation(S,0, "",ans);
        //}
        System.out.println(ans);
        return ans;
    }

    private static void find_permutation(String s, int k, String asf, List<String> ans) {
        //System.out.println(s);
        if(s.length()==0){
            ans.add(asf);
            return;
        }
        for(int i = 0;i<s.length();i++) {
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            find_permutation(left + right, i, asf+s.charAt(i), ans);
        }
    }
}
