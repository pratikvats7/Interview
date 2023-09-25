import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TechieDelight {

    private static int maze[][] = {{0, 0, 0}, {1, 0, 0}, {1, 0, 0}};
    private static boolean visitedAr[][] = {{false, false, false}, {false, false, false}, {false, false, false}};
    private static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        //equidistantCombination(7,1,"",freq);
        Integer[] a1r = {1, 2, 1, 2, 3, 4, 3};
        boolean[] used = new boolean[a1r.length];
        List<Integer> ar2 = Arrays.asList(a1r);
        List<Integer> ar1 = ar2.stream().collect(Collectors.toSet()).stream().sorted().collect(Collectors.toList());
        //distinctCombination(ar1,"",2,0);
        HashMap<Integer, Boolean> used1 = new HashMap<>();
        //distinctCombination2(ar1,"",3,0,used1);
        System.out.println();
        //distinctCombination3(ar1,"",3,0,used1);

        //sumCombination(5,"",0,1);

        // System.out.println(longestRoute(maze,0,0,0,visitedAr));

        //System.out.println(isRotatedPalindrome("CBAABCD",7)) ;

        //System.out.println(isRepeatedSubsequence("ABC",new ArrayList<String>(), ""));


        //interleaving("ABC","DCB","",6);
        //System.out.println(set);

        // nonOverlappingSubStrings("ABCD","");
        // System.out.println(removeDuplicates("AACCDDBEEBDD",""));

        //strictlyIncreasingNumbers(2,"",1);

        //ndigitNumbersSum(5,42 ,"");

        //lexicographic("ABC","");

        //reverse("Techie Delight  ","");

        //strstr("ABC ","NAZYADWABCNBM",0,0);

        String[] strar = {"1", "2", "3"};

        //subsets(Arrays.asList(strar), new ArrayList<String>());

        Integer[] a2r = {7, 3, 2, 1, 5, 4, 8};
        ArrayList<ArrayList<Integer>> ssf3 = new ArrayList<ArrayList<Integer>>();
        ssf3.add(new ArrayList<>());
        ssf3.add(new ArrayList<>());
        ssf3.add(new ArrayList<>());

        //patitionSumBruteForce(a2r,ssf3,0);

        //patitionequalSum(a2r,ssf3,0);

        char mat[][] =
                {
                        "DEMXB".toCharArray(),
                        "AOEPE".toCharArray(),
                        "DDCOD".toCharArray(),
                        "EBEDS".toCharArray(),
                        "CPYEN".toCharArray()

                };

        char mat2[][] =
                {
                        "ABC".toCharArray(),
                        "DEF".toCharArray(),
                        "GHI".toCharArray(),
                };

        String word = "CODE";
        boolean visitedAr2[][] = {{false, false, false, false, false}, {false, false, false, false, false}, {false, false, false, false, false}, {false, false, false, false, false}, {false, false, false, false, false}};

        //findAllOccurencesWrapper(mat, word,visitedAr2);

        char[][] board = {
                {'M', 'S', 'E', 'F'},
                {'R', 'A', 'T', 'D'},
                {'L', 'O', 'N', 'E'},
                {'K', 'A', 'F', 'B'}
        };

        Set<String> words = Stream.of("START", "NOTE", "SAND", "STONE")
                .collect(Collectors.toSet());

        //possibleWordsWrapper(board, words,visitedAr2);

        //generateAllPermutation("ABC","");

        Integer[] a3r = {1,2,3,4,5,6,7,8,9,10};
       // reverseConsequtiveMelements(Arrays.asList(a3r),0,9,4,0,4);

        Integer[] a4r = {2,7,4,0,9,5,1,3};

        //tripletSum(Arrays.asList(a4r),6,new ArrayList<Integer>(),0);


        int[][] mat3 =
                {
                        { 1, 2, 3, 4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}
                };

        boolean viited3[][] =
                {
                        { false, false, false, false, false},
                        { false, false, false, false, false},
                        { false, false, false, false, false},
                        { false, false, false, false, false},
                        { false, false, false, false, false}
                };

        int top = 0, bottom = mat3.length-1;
        int left = 0, right = 0;

        String X = "ABCBDAB", Y = "BDCABA";

//        System.out.println("The length of the LCS is "
//                + LCSLength(X, Y, X.length(), Y.length(),0,"",0));

        String X1 = "ABBDCACB";
        int n = X1.length();

//        System.out.print("The length of the longest palindromic subsequence is "
//                + findLongestPalindrome(X1, 0, n - 1));

        String X2 = "AABA";
        int m = X2.length();
        HashMap<String,Integer> mapcount = new HashMap<>();

        System.out.println("The length of the longest repeating subsequence is " +
                LRSLength(X2, 0, "",mapcount));
        System.out.println(mapcount);
        Map.Entry<String, Integer> l2 = mapcount.entrySet().stream().filter(x -> x.getValue() >= 2).sorted((x, y) -> y.getKey().length() - x.getKey().length()).findFirst().get();

        System.out.println(l2);

        //System.out.println(power(4,4));

        //System.out.println(multiply(4,4));

        //System.out.println(min(Arrays.asList(a4r)));

        //System.out.println(max(Arrays.asList(a4r)));

        int[][] mat5 =
                {
                        { -1, -9, 0, -1, 0 },
                        { -8, -3, -2, 9, -7 },
                        { 2, 0, 0, -6, 0 },
                        { 0, -7, -3, 5, -4 }
                };

        int pass = findMinPasses(mat);
        if (pass != -1) {
            System.out.print("The total number of passes required is " + pass);
        }
        else {
            System.out.print("Invalid Input");
        }
    }

    private static int findMinPasses(char[][] mat) {

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat.length; j++) {


            }
            }
        findMinPasses(mat);
        return 0;
    }


    private static int max(List<Integer> ar) {

        if(ar.size()==1){
            return ar.get(0);
        }

        return Math.max(ar.get(0),max(ar.subList(1,ar.size())));
    }

    private static int min(List<Integer> ar) {

        if(ar.size()==1){
            return ar.get(0);
        }

        return Math.min(ar.get(0),min(ar.subList(1,ar.size())));
    }


    private static int multiply(int a, int b) {

        if(b==1){
            return a;
        }

        return a+multiply(a,b-1);
    }

    private static int power(int x, int n) {

        if(n==0){
            return 1;
        }
       return x * power(x,n-1);
    }

    private static int LRSLength(String x, int m, String asf,HashMap<String,Integer> mapcount) {

        if(x.length()==0){
            return 0;
        }
        LRSLength(x.substring(1),m+1,asf,mapcount);
        asf = asf+x.charAt(0);
        LRSLength(x.substring(1),m+1,asf,mapcount);
        mapcount.put(asf,Optional.ofNullable(mapcount.get(asf)).orElse(0)+1);

        return 0;
    }

    private static int findLongestPalindrome(String str, int idx, int l) {


        if(idx>l){
            return 0;
        }
        if(idx==l){
            return 1;
        }
        if(str.charAt(idx)==str.charAt(l)) {
           return  findLongestPalindrome(str, idx + 1, l-1)+2;
        }
         return Math.max(findLongestPalindrome(str, idx + 1, l),findLongestPalindrome(str, idx, l-1));
    }

    private static int LCSLength(String x, String y,int l1, int l2,int count,String asf,int flag) {

        if(y.length()==0 || x.length()==0){
           // System.out.print(count);
            if(count==4)
             System.out.print(asf+" ");
            return count;
        }

        int idx = x.indexOf(y.charAt(0));
        if (x.indexOf(y.charAt(0))==-1){
            idx=0;
            flag =0;

        }
        else{
            count=count+1;
            asf=asf+y.charAt(0);
            idx=idx+1;
            flag = 1;
        }

        String str1 = x.substring(idx);
        String str2 = y.substring(1);

        int m1 = LCSLength(x.substring(idx),y.substring(1),l1,l2,count,asf,flag);
        if(asf.length()>=1 && flag==1) {
            asf = asf.substring(0, asf.length() - 1);
            count = count - 1;
        }
        int m2 = LCSLength(x,y.substring(1),l1,l2,count,asf,flag);
//
        return Math.max(m1,m2);
    }

    private static void replaceZeroes(int[][] mat4,int r,int c,boolean[][] visited) {

        //visited[r][c]=true;
        if(r<0 || c<0 ||r>=mat4.length || c>=mat4.length || visited[r][c]==true ){
            return;
        }
        if((r==0 || c==0 || r== mat4.length-1 || c== mat4.length-1 ) && mat4[r][c]==0){
            mat4[r][c]=1;
            //System.out.println("hi");
            return;
        }
            visited[r][c]=true;
        if(mat4[r][c]==0) {
            replaceZeroes(mat4, r, c + 1, visited);
            replaceZeroes(mat4, r + 1, c, visited);
            replaceZeroes(mat4, r + 1, c + 1, visited);
            replaceZeroes(mat4, r - 1, c - 1, visited);
        }
        else{
            if(c+1< mat4.length)
                replaceZeroes(mat4, r, c + 1, visited);
            else
                replaceZeroes(mat4, r + 1, 0, visited);
        }
        }



    private static void printSpiral(int[][] mat3, int top, int bottom, int left, int right, boolean[][] viited3) {

        if(top<0 || bottom>=mat3.length || left <0 || right>=mat3.length || left>=mat3.length || right<0 || viited3[left][right] == true){
            return;
        }
        System.out.print(mat3[left][right]+" ");
        viited3[left][right]=true;
        printSpiral(mat3, top, bottom, left, right+1, viited3);
        printSpiral(mat3, top, bottom, left+1, right, viited3);
        printSpiral(mat3, top, bottom, left, right-1, viited3);
        printSpiral(mat3, top, bottom, left-1, right, viited3);



    }

    private static void tripletSum(List<Integer> ar, int tgt, ArrayList<Integer> asf,int idx) {


        if(tgt==0 && asf.size()==4){
           //int sum = asf.stream().reduce((x,y)->x+y).get();
           //if(sum==tgt){
               System.out.println(asf);
          // }
           return;
        }
        if(ar.size()==0){
            return;
        }

            asf.add(ar.get(0));
            tripletSum(ar.subList(1,ar.size()),tgt-ar.get(0),asf,idx+1);
            asf.remove(asf.size()-1);
            tripletSum(ar.subList(1,ar.size()),tgt,asf,idx+1);


        }


    private static <T> void reverseConsequtiveMelements(List<Integer> asList, int begin, int end,int m,int idx,int m2) {

        if(begin>=end || begin+m>end){
            System.out.println(asList);
            return;
        }

            swap(asList,begin,begin+m-1);
            reverseConsequtiveMelements(asList, begin + idx, end,m,idx+1,m2);

    }

    private static <T> void swap(List<Integer> ar, int i, int j) {
            if(i<ar.size()&&j<ar.size()) {
                int temp = ar.get(j);
                ar.set(j, ar.get(i));
                ar.set(i, temp);
            }
    }


    private static void generateAllPermutation(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++) {
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            generateAllPermutation(left+right, asf+str.charAt(i));
        }
    }

    private static Set<String> possibleWordsWrapper(char[][] mat, Set<String> words, boolean[][] visitedAr2) {
        for (int i =0;i<mat.length;i++){
            for(int j=0;j< mat[0].length;j++){
                for (String word:words) {
                    possibleWords(mat,words,i,j,visitedAr2,"",0,word);
                }

            }
        }
        return words;
    }

    private static void possibleWords(char[][] mat, Set<String> words, int r, int c, boolean[][] visitedAr2, String asf, int idx, String word) {

        if(r>=0 && c>=0 && r<mat.length && c<mat[0].length && (asf+mat[r][c]).equals(word)){
            System.out.println(word);
            return;
        }
        if(r<0 || c<0 || r>=mat.length || c>=mat[0].length || visitedAr2[r][c]==true || idx>=word.length() || word.charAt(idx)!=mat[r][c]) {
            return;
        }
        else if(word.charAt(idx)==mat[r][c]){
            visitedAr2[r][c] = true;
            possibleWords(mat, words, r - 1, c - 1, visitedAr2, asf + mat[r][c],idx+1,word);
            possibleWords(mat, words, r - 1, c, visitedAr2, asf + mat[r][c],idx+1,word);
            possibleWords(mat, words, r - 1, c + 1, visitedAr2, asf + mat[r][c],idx+1,word);
            possibleWords(mat, words, r + 1, c - 1, visitedAr2, asf + mat[r][c],idx+1,word);
            possibleWords(mat, words, r + 1, c, visitedAr2, asf + mat[r][c],idx+1,word);
            possibleWords(mat, words, r + 1, c + 1, visitedAr2, asf + mat[r][c],idx+1,word);
            possibleWords(mat, words, r, c - 1, visitedAr2, asf + mat[r][c],idx+1,word);
            possibleWords(mat, words, r, c + 1, visitedAr2, asf + mat[r][c]  ,idx+1,word);
            visitedAr2[r][c] = false;
        }

    }

    private static void findAllOccurencesWrapper(char[][] mat, String word, boolean[][] visitedAr2) {
        for (int i =0;i<mat.length;i++){
            for(int j=0;j< mat[0].length;j++){
                findAllOccurences(mat,word,i,j,visitedAr2,"",0,"");
            }
        }
    }


    private static void findAllOccurences(char[][] mat, String word, int r, int c, boolean[][] visitedAr2,String asf,int idx,String rcc) {


        if(r>=0 && c>=0 && r<mat.length && c<mat[0].length && (asf+mat[r][c]).equals(word)){
            System.out.print(word+" ");
            System.out.println((rcc+" "+r+","+c));
            return;
        }
        if(r<0 || c<0 || r>=mat.length || c>=mat[0].length || visitedAr2[r][c]==true || idx>=word.length() || word.charAt(idx)!=mat[r][c]) {
            return;
        }
        else if(word.charAt(idx)==mat[r][c]){
            visitedAr2[r][c] = true;
            findAllOccurences(mat, word, r - 1, c - 1, visitedAr2, asf + mat[r][c],idx+1,(rcc+" "+r+","+c));
            findAllOccurences(mat, word, r - 1, c, visitedAr2, asf + mat[r][c],idx+1,(rcc+" "+r+","+c));
            findAllOccurences(mat, word, r - 1, c + 1, visitedAr2, asf + mat[r][c],idx+1,(rcc+" "+r+","+c));
            findAllOccurences(mat, word, r + 1, c - 1, visitedAr2, asf + mat[r][c],idx+1,(rcc+" "+r+","+c));
            findAllOccurences(mat, word, r + 1, c, visitedAr2, asf + mat[r][c],idx+1,(rcc+" "+r+","+c));
            findAllOccurences(mat, word, r + 1, c + 1, visitedAr2, asf + mat[r][c],idx+1,(rcc+" "+r+","+c));
            findAllOccurences(mat, word, r, c - 1, visitedAr2, asf + mat[r][c],idx+1,(rcc+" "+r+","+c));
            findAllOccurences(mat, word, r, c + 1, visitedAr2, asf + mat[r][c]  ,idx+1,(rcc+" "+r+","+c));
            visitedAr2[r][c] = false;
        }
//        else {
//            visitedAr2[r][c] = true;
//           // findAllOccurences(mat, word, r - 1, c - 1, visitedAr2, asf,idx);
//           // findAllOccurences(mat, word, r - 1, c, visitedAr2, asf,idx);
//            //findAllOccurences(mat, word, r - 1, c + 1, visitedAr2, asf,idx);
//            //findAllOccurences(mat, word, r + 1, c - 1, visitedAr2, asf,idx);
//            if(c+1>=mat.length) {
//                findAllOccurences(mat, word, r + 1, 0, visitedAr2, asf, 0);
//            }
//            else {
//                findAllOccurences(mat, word, r, c + 1, visitedAr2, asf, 0);
//            }
//            //findAllOccurences(mat, word, r + 1, c + 1, visitedAr2, asf,idx);
//            //findAllOccurences(mat, word, r, c - 1, visitedAr2, asf,idx);
//            //findAllOccurences(mat, word, r, c + 1, visitedAr2, asf,0);
//            visitedAr2[r][c] = false;
//        }
        //System.out.print(asf+" ");

    }

    private static boolean isValid(String asf, String word) {
        System.out.println(asf);
        for(int i=0;i<word.length() && i<asf.length();i++){
            if(asf.charAt(i)!=word.charAt(i)){
                return false;
            }
        }
        System.out.println(asf+"o ");
        return true;
    }

    private static void patitionequalSum(Integer[] a2r, ArrayList<ArrayList<Integer>> set,int idx) {

        if(idx >= a2r.length){
            Set<Optional<Integer>> test = set.stream().map(ar -> ar.stream().reduce((x, y) -> x + y)).collect(Collectors.toSet());
            if(test.size()==1){
                System.out.println(set);
            }
            return;
        }
        for (ArrayList<Integer> ar : set) {
            if (ar.size() > 0) {
                ar.add(a2r[idx]);
                patitionequalSum(a2r,set,idx+1);
                ar.remove(ar.size()-1);
            }
            else{
                ar.add(a2r[idx]);
                patitionequalSum(a2r,set,idx+1);
                ar.remove(ar.size()-1);
                break;
            }
        }

    }

    private static void patitionSumBruteForce(Integer[] a2r, ArrayList<ArrayList<Integer>> set, int idx) {

        if(idx >= a2r.length){
            Set<Optional<Integer>> test = set.stream().map(ar -> ar.stream().reduce((x, y) -> x + y)).collect(Collectors.toSet());
            if(test.size()==1){
                System.out.println(set);
            }
            return;
        }

        if(set.get(0).size()==0){
            set.get(0).add(a2r[idx]);
            patitionSumBruteForce(a2r,set,idx+1);
            set.get(0).remove(a2r[idx]);
            return;
        }
        else{
            set.get(0).add(a2r[idx]);
            patitionSumBruteForce(a2r,set,idx+1);
            set.get(0).remove(a2r[idx]);
        }
        if(set.get(1).size()==0){
            set.get(1).add(a2r[idx]);
            patitionSumBruteForce(a2r,set,idx+1);
            set.get(1).remove(a2r[idx]);
            return;
        }
        else{
            set.get(1).add(a2r[idx]);
            patitionSumBruteForce(a2r,set,idx+1);
            set.get(1).remove(a2r[idx]);
        }
        if(set.get(2).size()==0){
            set.get(2).add(a2r[idx]);
            patitionSumBruteForce(a2r,set,idx+1);
            set.get(2).remove(a2r[idx]);
            return;
        }
        else{
            set.get(2).add(a2r[idx]);
            patitionSumBruteForce(a2r,set,idx+1);
            set.get(2).remove(a2r[idx]);
        }
        //1st set
//        set.get(0).add(a2r[idx]);
//        patitionSumBruteForce(a2r,set,idx+1);
//        set.get(0).remove(a2r[idx]);
//        //2nd set
//        set.get(1).add(a2r[idx]);
//        patitionSumBruteForce(a2r,set,idx+1);
//        set.get(1).remove(a2r[idx]);
//        //3rd set
//        set.get(2).add(a2r[idx]);
//        patitionSumBruteForce(a2r,set,idx+1);
//        set.get(2).remove(a2r[idx]);
    }

    private static void subsets(List<String> strList, ArrayList<String> ssf) {

        if(strList.size()==0){
            System.out.print(ssf+" ");
            return;
        }

        ssf.add(strList.get(0));
        subsets(strList.subList(1, strList.size()),ssf);
        ssf.remove(ssf.size()-1);
        subsets(strList.subList(1, strList.size()),ssf);

    }

    private static void strstr(String tgt, String str,int asf,int idx) {

        if(str.length()==0){
            System.out.println("-1");
            return;
        }

        if(idx==tgt.length()){
            System.out.println("found");
            System.out.println(asf-tgt.length());
            return;
        }
       if(str.charAt(0)!=tgt.charAt(idx)){
           strstr(tgt,str.substring(1),asf+1,0);
        }
        else {
            strstr(tgt, str.substring(1), asf+1, idx + 1);
        }
    }

    private static void reverse(String str, String asf) {

        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        reverse(str.substring(1),str.charAt(0)+asf);
    }

    private static void lexicographic(String str, String asf) {

        if(asf.length()==str.length()){
            System.out.print(asf+" ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            lexicographic(str,asf+str.charAt(i));
        }
    }

    private static void ndigitNumbersSum(int n, int tgt,String asf) {

        if(n==0){
            if(asf.charAt(0)=='0'){
                return ;
            }
            int sum = Arrays.stream(asf.split("")).map(x->Integer.parseInt(x+"")).reduce((x,y)->x+y).get();
            if(sum ==tgt){
                System.out.print(asf+" ");
            }
            return;
        }
        for(int i=0;i<=9;i++) {
            ndigitNumbersSum(n - 1, tgt,asf+i);
        }
    }
    private static void strictlyIncreasingNumbers(int n,String asf,int idx) {

        if(n==0){
            System.out.print(asf+" ");
            return;
        }
        for(int i = idx;i<=3;i++) {
                strictlyIncreasingNumbers(n-1, asf + (i),idx+1);
                idx=idx+1;
        }
    }

    private static String removeDuplicates(String str,String asf) {

        if(str.length()==1){
            return asf+str;
        }
       else if(str.charAt(0)==str.charAt(1)) {
           return removeDuplicates(str.substring(1),asf);
        }
        else{
            return removeDuplicates(str.substring(1),asf+str.charAt(0));
        }
    }

    private static void nonOverlappingSubStrings(String str,String asf) {
        if(str.length()==0){
            System.out.print(asf+"    ");
            return ;
        }

        if(str.length()==1){
            nonOverlappingSubStrings(str.substring(1), asf+str.charAt(0));
        }
        else {
            nonOverlappingSubStrings(str.substring(1), asf + str.charAt(0) + "|");
            nonOverlappingSubStrings(str.substring(1), asf + str.charAt(0));
        }
    }

    private static void interleaving(String str1, String str2,String asf) {

        if (str1.length()==0 && str2.length()==0){
           set.add(asf);
            return;
        }
            if(str1.length()>0) {
                interleaving(str1.substring(1), str2, asf + str1.charAt(0));
            }
            if(str2.length()>0) {
                interleaving(str2.substring(1), str1, asf + str2.charAt(0));
            }

    }

    private static boolean isRepeatedSubsequence(String str, ArrayList<String> asf,String ssf) {

        if(str.length()==0){
            asf.add(ssf);
            System.out.println(ssf);
            return false;
        }

        isRepeatedSubsequence(str.substring(1),asf,ssf+str.charAt(0));
        isRepeatedSubsequence(str.substring(1),asf,ssf);

        return false;
    }

    private static boolean isRotatedPalindrome(String str, int len) {

        if(len<0){
            return false;
        }
        StringBuilder str2 = new StringBuilder(str);
        if(str2.reverse().toString().equals(str)){
            System.out.println(str);
            return true;
        }

        return isRotatedPalindrome(str.substring(1)+str.charAt(0), len-1);
    }

    private static int longestRoute(int[][] maze, int r, int c, int msf, boolean[][] visitedAr) {

       if(r<0 || c<0 || r >= maze.length || c>= maze.length || visitedAr[r][c]==false){
           return msf;
       }

        visitedAr[r][c]=true;
        //up
        int max1 = longestRoute(maze,r-1,c,msf+1, visitedAr);
        //down
       int max2 =  longestRoute(maze,r+1,c,msf+1, visitedAr);
        //right
        int max3 = longestRoute(maze,r,c+1,msf+1, visitedAr);
        //left
        int max4 = longestRoute(maze,r,c-1,msf+1, visitedAr);

        visitedAr[r][c]=false;

        return Math.max(Math.max(max1,max2),Math.max(max3,max4));
    }

    private static void sumCombination(int n, String asf,int ssf,int index) {

        if(ssf==n){
            System.out.println(asf);
            return;
        }
        else if(ssf>n){
            return;
        }

        for(int i = index;i<=n;i++) {
            sumCombination(n, asf+i,ssf+i,index++);
        }
    }

    private static void distinctCombination3(List<Integer> ar, String asf, int k, int start, HashMap<Integer, Boolean> used1) {
        if (k == 0) {
            System.out.print(asf + " ");
            return;
        }
        for (int i = start; i < ar.size(); i++) {
            distinctCombination3(ar, asf + ar.get(i), k - 1, start++, used1);
        }

    }

    private static void distinctCombination2(List<Integer> ar, String asf, int k, int start, HashMap<Integer, Boolean> used1) {
        if (k == 0) {
            System.out.print(asf + " ");
            return;
        }
            HashMap <Integer,Boolean> used2 = new HashMap<>();
            for (int i = start; i < ar.size(); i++) {
                if(!(used1.getOrDefault(ar.get(i),false) || used2.getOrDefault(ar.get(i),false))) {
                    used2.put(ar.get(i),true);
                    distinctCombination2(ar, asf + ar.get(i), k - 1, start++, used1);
                    used1.put(Integer.parseInt(asf.length() == 0 ? "0" : asf.charAt(0) + ""), true);
                }
            }

    }

    private static void distinctCombination(List<Integer> ar, String asf,int k,int start) {
        if(k==0){
            System.out.print(asf+" ");
            return;
        }
        for (int i=start;i<ar.size();i++) {
            distinctCombination(ar,asf+ar.get(i),k-1,start++);
        }
    }


    private static void equidistantCombination(int n, int x, String asf, HashMap<Integer, Integer> freq) {

        if(x>2*n){
            System.out.println(asf +" ");
            return;
        }
        for(int i =1 ;i<=n;i++) {
            int i2 = i;
              if (!(asf.length() > 0 && Integer.parseInt(asf.charAt(asf.length() - 1) + "") == i2)) {
                  //System.out.println(asf + (i2));
                  if(Optional.ofNullable(freq.get(i)).orElse(0)<2) {
                      freq.put(i, Optional.ofNullable(freq.get(i)).orElse(0)+1);
                      String asf2 = asf+i2;
                      if(asf.indexOf(i2+"")==-1 || asf2.lastIndexOf(i2+"")-asf.indexOf(i2+"") == 1 || asf2.lastIndexOf(i2+"")-asf.indexOf(i2+"")==i2+1)
                         equidistantCombination(n, x + 1, asf + (i2), freq);
                      freq.put(i, freq.get(i)-1);
                  }
            }
        }

    }
}
