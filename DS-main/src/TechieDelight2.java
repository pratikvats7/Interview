import java.util.*;

public class TechieDelight2 {

    private static int paths[][] =
            {
                    {2, 8, 4, 1, 6, 4, 2},
                    {6, 0, 9, 5, 3, 8, 5},
                    {1, 4, 3, 4, 0, 6, 5},
                    {6, 4, 7, 2, 4, 6, 1},
                    {1, 0, 3, 7, 1, 2, 7},
                    {1, 5, 3, 2, 3, 0, 9},
                    {2, 2, 5, 1, 9, 8, 2}
            };
    public static void main(String[] args) {

        //System.out.println(strlength("ABCF"));

        String X2 = "AABA";
        int m = X2.length();
        HashMap<String,Integer> mapcount = new HashMap<>();

//        System.out.println("The length of the longest repeating subsequence is " +
//                LRSLength(X2, 0, "",mapcount));
//        System.out.println(mapcount);
//        Map.Entry<String, Integer> l2 = mapcount.entrySet().stream().filter(x -> x.getValue() >= 2).sorted((x, y) -> y.getKey().length() - x.getKey().length()).findFirst().get();
//
//        System.out.println(l2);


        //System.out.println(fib(5));

        //System.out.println(minimumcostPath(paths,0,0,0)+"   yu");

        int gold[][] =
                {
                        {0, 1, 4, 2, 8, 2},
                        {4, 3, 6, 5, 0, 4},
                        {1, 2, 4, 1, 4, 6},
                        {2, 0, 7, 3, 2, 2},
                        {3, 1, 5, 9, 2, 4},
                        {2, 7, 0, 8, 5, 1}
                };

        //  System.out.println(maximumGold(gold,0,0,0));
//        int max=0;
//        for(int i=0;i<gold.length;i++){
//            max=Math.max(max,maximumGold(gold,i,0,0));
//        }
//        System.out.println(max);

        Integer[] arset = {2,3,5,6,4,1,7};

//        targetSumSubset(Arrays.asList(arset),10,new ArrayList<Integer>());
        //coinChange(Arrays.asList(arset),7,new ArrayList<Integer>());

       // coinChangeRepeat(Arrays.asList(arset),7,new ArrayList<Integer>(),0,false);

        Integer[] weight = {2,5,1,3,4};
        Integer[] price = {15,14,10,45,30};

        //System.out.println("Knapsack :"+ KnapSack01(weight,price,7,0,0));

        //System.out.println("KnapsackUnbounded :"+ KnapsackUnbounded(weight,price,7,0,0));

        //System.out.println(countBinaryStrings(4,""));

        //System.out.println(countEncodings("21121","",0));
        Integer[] maxSumNonAdjacentAr = {5,10,10,100,5,6};
        //System.out.println(maxSumNonAdjacentElements(Arrays.asList(maxSumNonAdjacentAr),new ArrayList<Integer>()));

        int paintHouse[][] =
                {
                        {1,5,7},
                        {1,8,4},
                        {1,2,9},
                        {1,2,4}
                };

        //System.out.println(paintHouse(paintHouse,0));
        //W  W

        pattern(6);
    }

    private static void pattern(int n) {
        int pos = n/2;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1 || j==n){
                    System.out.print("*");
                }
                else if(i > n/2 && (j==pos || j == n-pos)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i>n/2)
                pos--;

            System.out.println();
        }
    }

    private static int paintHouse(int[][] paintHouse,int r) {

        if(r>=paintHouse.length)
        {
            return 0;
        }
        int min=0;
        if(r<paintHouse.length) {
            int m1 = paintHouse[r][0] + paintHouse(paintHouse, r + 1);
            int m2 = paintHouse[r][1] + paintHouse(paintHouse, r + 1);
            int m3 = paintHouse[r][2] + paintHouse(paintHouse, r + 1);
            min = Math.min(Math.min(m1, m2), m3);
        }

        return min;
    }

    private static int maxSumNonAdjacentElements(List<Integer> maxSumNonAdjacentAr,List<Integer> asf) {

        if(maxSumNonAdjacentAr.size()==0){
            System.out.println(asf);
            return 0;
        }
        asf.add(maxSumNonAdjacentAr.get(0));
        int m1=0;
        if(maxSumNonAdjacentAr.size()>1) {
            m1 = maxSumNonAdjacentElements(maxSumNonAdjacentAr.subList(2, maxSumNonAdjacentAr.size()), asf);
        }
        else if(maxSumNonAdjacentAr.size()==1){
            System.out.println(asf);
        }
        asf.remove(asf.size()-1);
        int m2 = maxSumNonAdjacentElements(maxSumNonAdjacentAr.subList(1,maxSumNonAdjacentAr.size()),asf);

        return Math.max(m1,m2);
    }

    private static int countEncodings(String str,String asf,int count) {

        if(str.length()==0){
            int con = (int) Arrays.stream(asf.split(" ")).filter(x->x.charAt(0)=='0' || Integer.parseInt(x)>26 || Integer.parseInt(x)==0).count();
            if(con==0){
                System.out.println(asf);
                count++;
            }
            return count;
        }
        countEncodings(str.substring(1),asf+str.charAt(0)+" ",count);
        if(str.length()>=2) {
            countEncodings(str.substring(2), asf + str.charAt(0) + str.charAt(1)+" ",count);
        }

        return count;
    }

    private static int countBinaryStrings(int n,String asf) {

        if(n==0){
            System.out.print(asf+" ");
            return 1;
        }
        if(n<0){
            return 0;
        }

        int c1 = countBinaryStrings(n-1,asf+"1");
        int c2 =0;
        if(asf.length() == 0 || asf.charAt(asf.length()-1)=='1'){
            c2 =  countBinaryStrings(n-1,asf+"0");
        }

        return c1+c2;
    }

    private static int KnapsackUnbounded(Integer[] weight, Integer[] price, int tgt,int ssf,int idx) {

        if(idx>=price.length){
            return ssf;
        }
        if(tgt<0 ){
            return ssf;
        }
        if(tgt==0){
            System.out.println(ssf);
            return ssf;
        }

        int withincl=0;
        if(tgt - weight[idx]>=0) {
            withincl = KnapsackUnbounded(weight, price, tgt - weight[idx], ssf + price[idx], idx);
        }
        int withexcl = KnapsackUnbounded(weight, price, tgt, ssf, idx +1);

        return Math.max(withincl,withexcl);
    }

    private static int KnapSack01(Integer[] weight, Integer[] price, int tgt,int ssf,int idx) {

        if(idx>=price.length){
            return ssf;
        }
        if(tgt<0 ){
            return ssf;
        }
        if(tgt==0){
            System.out.println(ssf);
            return ssf;
        }

        int withincl=0;
        if(tgt - weight[idx]>=0) {
                withincl = KnapSack01(weight, price, tgt - weight[idx], ssf + price[idx], idx + 1);
            }
        int withexcl = KnapSack01(weight, price, tgt, ssf, idx + 1);

        return Math.max(withincl,withexcl);
    }

    private static void coinChangeRepeat(List<Integer> arset, int tgt, ArrayList<Integer> asf, int idx, boolean flag) {

        if(tgt<0 || idx>=arset.size()){
            return;
        }
        if(tgt == 0 && flag){
            System.out.println(asf);
        }
            asf.add(arset.get(idx));
            coinChangeRepeat(arset, tgt-arset.get(idx), asf,idx++, true);
            if (asf.size() >= 1) {
                asf.remove(asf.size() - 1);
            }
            coinChangeRepeat(arset, tgt, asf,idx++, false);
    }

    private static void coinChange(List<Integer> arset, int tgt, ArrayList<Integer> asf) {

        if(arset.size()==0){
            int sum = Integer.MIN_VALUE;

            if(asf.size()==1){
                sum = asf.get(0);
            }
            else if(asf.size()>1)
                sum = asf.stream().reduce((x,y)->x+y).get();
            if(sum==tgt){
                System.out.println(asf);
            }
            return;
        }
        asf.add(arset.get(0));
        coinChange(arset.subList(1,arset.size()),tgt,asf);
        if(asf.size()>=1)
            asf.remove(asf.size()-1);
        coinChange(arset.subList(1,arset.size()),tgt,asf);
    }

    private static void targetSumSubset(List<Integer> arset, int tgt, ArrayList<Integer> asf) {

        if(arset.size()==0){
            int sum = Integer.MIN_VALUE;

            if(asf.size()==1){
                sum = asf.get(0);
            }
            else if(asf.size()>1)
               sum = asf.stream().reduce((x,y)->x+y).get();
            if(sum==tgt){
                System.out.println(asf);
            }
            return;
        }
        asf.add(arset.get(0));
        targetSumSubset(arset.subList(1,arset.size()),tgt,asf);
        if(asf.size()>=1)
            asf.remove(asf.size()-1);
        targetSumSubset(arset.subList(1,arset.size()),tgt,asf);
    }

    private static int maximumGold(int[][] gold,int r,int c,int msf) {

        if(r>=gold.length || c>=gold.length || c<0 || r<0){
            return 0;
        }
        if(c==gold.length-1 && r<=gold.length-1){
            //System.out.print(msf+gold[r][c]+" fh  ");
            return msf+gold[r][c];
        }
        int m1=maximumGold(gold,r,c+1,msf+gold[r][c]);
        int m2 = maximumGold(gold,r-1,c+1,msf+gold[r][c]);
        int m3 = maximumGold(gold,r+1,c+1,msf+gold[r][c]);

        return Math.max(Math.max(m1,m2),m3);
    }

    private static int minimumcostPath(int[][] paths,int r,int c,int msf){

        if(r>=paths.length || c>=paths.length){
            return Integer.MAX_VALUE;
        }
        if(r==paths.length-1 && c==paths.length-1){
            System.out.print(msf+paths[r][c] +"res  ");
            return msf+paths[r][c];
        }
        int m2 = minimumcostPath(paths,r,c+1,msf+paths[r][c]);
        int m1 = minimumcostPath(paths,r+1,c,msf+paths[r][c]);
        return Math.min(m1,m2);
    }
    private static int fib(int n) {

        if(n==0 || n==1){
            return 1;
        }
        else if(n<0){
            return 0;
        }

        return fib(n-1)+fib(n-2);
    }

    private static int LRSLength(String str, int idx, String asf, HashMap<String, Integer> mapcount) {

        if(str.length()==0){
            return 0;
        }
        mapcount.put(asf, Optional.ofNullable(mapcount.get(asf)).orElse(0)+1);
        LRSLength(str.substring(1),idx+1,asf+str.charAt(0),mapcount);
        LRSLength(str.substring(1),idx+1,asf,mapcount);


        return 0;
    }

    private static int strlength(String str) {

        if(str.equals("")){
            return 0;
        }
        return 1+strlength(str.substring(1));
    }
}
