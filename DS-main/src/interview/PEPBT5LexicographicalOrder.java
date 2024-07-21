package interview;

import java.util.ArrayList;
import java.util.List;

public class PEPBT5LexicographicalOrder {
    public static void main(String[] args) {

        System.out.println(lexicalOrder(100));
    }

    public static List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i =1;i<=9;i++) {
            lexicalOrder(n, i, res);
        }
        return res;
    }

    private static void lexicalOrder(int n, int n1, List<Integer> res) {
        if(n1>n){
            return;
        }
        lexicalOrder(n,n1*10,res);
        for(int i=0;i<=9;i++) {
           if(n1+i<=n)
                res.add(n1+i);
        }
    }
}
