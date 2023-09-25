import java.util.*;

public class Practice {
    private final static Map<String, String> keypadmap = new HashMap<>() {
        {
            put("1", "abc");
            put("2", "def");
            put("3", "ghi");
            put("4", "jkl");
            put("5", "mnop");
            put("6", "qrst");
            put("7", "uv");
            put("8", "wxyz");
            put("9", ".");
        }  };

    private final static Map<String, String> CharacterMap = new HashMap<>() {
        {
            put("1", "a");
            put("2", "b");
            put("3", "c");
            put("4", "d");
            put("5", "e");
            put("6", "f");
            put("7", "g");
            put("8", "h");
            put("9", "i");
            put("10", "j");
            put("11", "k");
            put("12", "l");
            put("13", "m");
            put("14", "n");
            put("15", "o");
            put("16", "p");
            put("17", "q");
            put("18", "r");
            put("19", "s");
            put("20", "t");

            put("22", "v");
            put("23", "w");
            put("24", "x");
            put("25", "y");
            put("26", "z");
        }  };

    private static int maze[][] = {{0, 0, 0}, {1, 0, 0}, {1, 0, 0}};
    private static boolean visitedAr[][] = {{false, false, false}, {false, false, false}, {false, false, false}};
    private static int chess[][] = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};

    public static void main(String[] args) {
        // printIncreasingDecreasing(5);
        //System.out.println(factorial(5));
        //System.out.println(powerLinear(2,4));
        pzz(3);
        List<Integer> ar = Arrays.asList(new Integer[]{10, 20, 14, 30, 23, 245, 14, 16, 7, 70, 50, 125});
        //displayArr(ar,0);
        //System.out.println(maxArray(ar,0));
        //System.out.println(firstOccurance(ar,0,14));
        //System.out.println(lastOccurance(ar,0,14));
        //display(allIndices(ar,0,14,0));
        //System.out.println(getSubsequence("abc"));
        System.out.println(keyPadCombination("573"));
        //System.out.println(getStairsPath(3));

        //System.out.println(getMazePaths(1,1,3,3));
        // System.out.println(getMazePathsJump(1,1,3,3));

        //printSubsequences("abc","");
        ArrayList<String> rsf1 = new ArrayList<String>();
        rsf1.add("");
//        printKeypadCombinations("573",rsf1);
        //printStairPaths(3,"");
        // printMazePaths(1,1,3,3,"");
        //printMazePathsJump(1, 1, 3, 3, "");

        //permutations("abcd","");
        //encodings("123","");
       // floodFill(maze,0,0,"",visitedAr);
        //targetSubsets(ar,0,80,"",0);

        //printNQueens(chess,"",0);
        //KnightsTour(chess,4,1,0);
        List<String> strAr = Arrays.asList(new String[]{"dog", "cat", "dad", "good"});
        List<String> letters = Arrays.asList(new String[]{"a", "a", "c", "d", "d", "d", "g", "o", "o"});
        List<Integer> score = Arrays.asList(new Integer[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});


        //abbreviations("p ep","",0,0);
        //System.out.println(maxScore(strAr,new ArrayList<String>(),0,letters,score)+" res");
        //System.out.println(josephusProlem(8,3));
//        for(int i=1;i<=9;i++) {
//            lexicographical(i, 100);
//        }

        boolean[] used= new boolean[4];
        //friendsPairing(1,3,used,"");
        friendsPairingretry(1,3,used,"");
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        for(int i =0;i<3;i++){
//            ans.add(new ArrayList<Integer>());
//        }
//
//        kPartition(1,4,3,0,ans);

    }

    private static void friendsPairingretry(int i, int n, boolean[] used, String asf) {

        if(i>n){
            //System.out.println(asf);
            return;
        }

        friendsPairingretry(i+1,n,used,asf + "(" + i + ")");
        System.out.println(asf+" "+i);
    }

    private static void kPartition(int i, int n, int k,int nos, ArrayList<ArrayList<Integer>> ans) {

        if(nos==ans.size() || i>n){
            System.out.println(ans);
            return;
        }

        ArrayList<Integer> tes = new ArrayList<>();
        tes.add(i);
        ans.set(nos,tes);
        kPartition(i+1,n,k-1,nos+1,ans);
        ans.get(nos).remove(i);
        for(int j=i+1;j<=n;j++){
            ans.get(nos).add(j);
        }
        kPartition(i+1,n,k-1,nos+1,ans);
    }

    private static void friendsPairing(int i, int n, boolean[] used, String asf) {

        if (i > n) {
            System.out.println(asf);
            return;
        }
        if(used[i]==true){
            friendsPairing(i + 1, n, used, asf);
        }
        else {
            used[i] = true;
            friendsPairing(i + 1, n, used, asf + "(" + i + ")");
            for(int num=i+1;num<=n;num++){
                     friendsPairing(i + 1, n, used, asf + "(" + i + "" + num + ")");
                    used[num]=false;
                }
                used[i] = false;
            }
    }


    private static void lexicographical(int i, int n) {

        if(i>n){
            return;
        }
        System.out.println(i);
        for(int j=0;j<=9;j++) {
           lexicographical(10*i+j, n);
       }
    }
    private static int josephusProlem(int n, int k) {

        if(n==1){
            return 0;
        }
        int x = josephusProlem(n-1,k);
        int y = (x+k)%n;
        return y;
    }

    private static int maxScore(List<String> strAr,List<String> asf,int pos,List<String> letters,List<Integer> score) {

        if(pos>=strAr.size()){
            System.out.println(asf);
            int sum =0;
            Map<String,Integer> freqMap = new HashMap<>();
            for (String letter : letters) {
                if (freqMap.get(letter) != null)
                    freqMap.put(letter, freqMap.get(letter) + 1);
                else {
                    freqMap.put(letter, 1);
                }
            }
            int flag =0;
            for (String str:asf) {
                for (int i = 0; i < str.length(); i++) {
                    if(freqMap.get(str.charAt(i)+"")==null){
                        sum=0;
                        flag =1;
                    }
                    else if(freqMap.get(str.charAt(i)+"")>0) {
                        if(flag==0)
                            sum += score.get(str.charAt(i) - 'a');
                        freqMap.put(str.charAt(i)+"", freqMap.get(str.charAt(i)+"") - 1);
                    }
                    else{
                        sum = 0;
                        flag =1;
                    }
                }
            }
            for (String str:asf) {
                for (int i = 0; i < str.length(); i++) {
                    if(freqMap.get(str.charAt(i)+"")!=null)
                        freqMap.put(str.charAt(i)+"", freqMap.get(str.charAt(i)+"")+1);
                }
            }
            System.out.println(sum);
            return sum;
        }
        asf.add(strAr.get(pos));
        int maxwithincl = maxScore(strAr,asf,pos+1,letters,score);
        asf.remove(strAr.get(pos));
        int maxWoincl = maxScore(strAr,asf,pos+1,letters,score);
        return Math.max(maxwithincl,maxWoincl);
    }


        private static void abbreviations(String str, String asf, int count, int pos) {

        if(str.length()==pos){
            if(count==0){
                System.out.println(asf);}
            else{
                System.out.println(asf+count);
            }
            return;
        }
        if(count>0)
            abbreviations(str,asf+count+str.charAt(pos),0,pos+1);
        else
            abbreviations(str,asf+str.charAt(pos),0,pos+1);

        abbreviations(str,asf,count+1,pos+1);
    }


    private static void KnightsTour(int[][] chess, int row, int col,int move) {


        if((row<0 || col<0 || row >= chess.length || col>=chess[0].length || chess[row][col]>0)) {
            return;
        }
        if(move==chess.length*chess.length){
            chess[row][col]=move;
            displayBoard(chess);
            return;
        }
            chess[row][col] = move;
            KnightsTour(chess, row + 1, col + 2, move + 1);
            KnightsTour(chess, row - 1, col + 2, move + 1);
            KnightsTour(chess, row + 1, col - 2, move + 1);
            KnightsTour(chess, row - 1, col - 2, move + 1);
            KnightsTour(chess, row + 2, col + 1, move + 1);
            KnightsTour(chess, row + 2, col - 1, move + 1);
            KnightsTour(chess, row - 2, col - 1, move + 1);
            KnightsTour(chess, row - 2, col + 1, move + 1);
            chess[row][col] = 0;
    }

    private static void displayBoard(int[][] chess) {
        for (int row=0;row<chess.length;row++){
            for(int col=0;col<chess[0].length;col++){
                System.out.print(chess[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void printNQueens(int[][] chess, String qsf, int row) {

        if(row==chess.length){
            System.out.println(qsf);
            return;
        }

        for(int col=0;col<chess.length;col++){
            chess[row][col]=1;
            if(isQueensafe(chess,row,col)) {
                printNQueens(chess, qsf + row + "" + col + " ", row + 1);
            }
            chess[row][col]=0;
        }


    }

    private static boolean isQueensafe(int[][] chess, int row, int col) {
        for (int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for (int i=row-1,j=col+1;i>=0 && j< chess.length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }

        return true;
    }

    private static void targetSubsets(List<Integer> ar,int index, int target,String set,int sumSoFar) {

        if(sumSoFar==target){
            System.out.println(set);
            return;
        }
        else if(sumSoFar>target || ar.size()==0){
            return;
        }
        targetSubsets(ar.subList(1,ar.size()),index+1,target,ar.get(0)+" , "+set,sumSoFar+ar.get(0));
        targetSubsets(ar.subList(1,ar.size()),index+1,target,set,sumSoFar);

    }

    private static void floodFill(int[][] maze, int sr, int sc, String asf,boolean[][] visited) {

        if(sr==maze.length-1 && sc==maze[0].length-1){
            System.out.print(asf+" ");
            return;
        }
        else if(sr<0 || sc<0 || sr>=maze.length || sc>=maze.length || visited[sr][sc]==true || maze[sr][sc]==1 ){
            return;
        }
            visited[sr][sc] = true;
            floodFill(maze, sr, sc + 1, "r"+asf, visited);
            floodFill(maze, sr + 1, sc, "d"+asf, visited);
            floodFill(maze, sr - 1, sc, "t"+asf, visited);
            floodFill(maze, sr, sc - 1, "l"+asf, visited);
            visited[sr][sc] = false;
    }
    private static void encodings(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            System.out.println();
            return;
        }
        if(CharacterMap.get(str.charAt(0)+"")!=null) {
            encodings(str.substring(1), asf + CharacterMap.get(str.charAt(0) + ""));
        }
        if(str.length()>=2 && CharacterMap.get(str.substring(0,2))!=null) {
            encodings(str.substring(2), asf + CharacterMap.get(str.substring(0, 2)));
        }

    }
    private static void permutations(String str, String ans){

        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }

        for(int i=0;i<str.length();i++) {
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            permutations(left+right, ans + str.charAt(i));
        }
    }
    private static void printMazePathsJump(int sr, int sc, int dr, int dc, String ans) {

        if(sr==dr && sc == dc){
            System.out.println(ans);
            return;
        }
        for(int ms=1;ms<=dc-sc;ms++){
            printMazePathsJump(sr, sc+1, dr, dc, "h"+ms+ans);
        }

        for(int ms=1;ms<=dr-sr;ms++){
            printMazePathsJump(sr+1, sc, dr, dc, "v"+ms+ans);
        }

        for(int ms=1;ms<=dr-sr&&ms<=dc-sc;ms++){
            printMazePathsJump(sr+1, sc+1, dr, dc, "d"+ms+ans);
        }
    }


    private static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {

        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        if(sc<=dc)
            printMazePaths(sr,sc+1,dr,dc,ans+"h");
        if(sr<=dr)
            printMazePaths(sr+1,sc,dr,dc,ans+"v");
    }

    private static void printStairPaths(int n, String res) {

        if(n==0){
            System.out.println(res);
            return;
        }
        if(n-1>=0) {
            printStairPaths(n - 1, "1"+res);
        }
        if(n-2>=0) {
            printStairPaths(n - 2, "2"+res);
        }
        if(n-3>=0) {
            printStairPaths(n - 3, "3"+res);
        }
    }

    private static void printKeypadCombinations(String str, ArrayList<String> rsf) {

        if(str.length()==0){
            System.out.println(rsf);
            return;
        }
        String str2 = keypadmap.get(str.charAt(0) + "");
        ArrayList<String> res = new ArrayList<String>();
        for (int i=0;i<rsf.size();i++) {
            for (int j = 0; j < str2.length(); j++) {
                res.add(rsf.get(i)+str2.charAt(j));
            }
        }
        printKeypadCombinations(str.substring(1),res);

    }

    private static void printSubsequences(String str,String asf) {

        if(str.length()==0){
            System.out.print(asf+" ");
            return;
        }

        printSubsequences(str.substring(0,str.length()-1),asf);
        printSubsequences(str.substring(0,str.length()-1),str.charAt(str.length()-1)+asf);

    }

    private static  List<String> getMazePathsJump(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> res = new ArrayList<>();

        for(int ms = 1;ms<=dc-sc;ms++) {
            List<String> hpaths= getMazePathsJump(sr, sc + ms, dr, dc);
            for (String hrz : hpaths) {
                res.add(ms+"h" + hrz);
            }
        }
        for(int ms =1;ms<=dr-sr;ms++) {
            List<String> vpaths = getMazePathsJump(sr+ms, sc, dr, dc);
            for (String hrz : vpaths) {
                res.add(ms+"v" + hrz);
            }
        }
        for(int ms =1;ms<=dc-sc&&ms<=dr-sr;ms++) {
            List<String> dpaths = getMazePathsJump(sr+ms, sc + ms, dr, dc);
            for (String hrz : dpaths) {
                res.add(ms+"d" + hrz);
            }
        }
        return res;
    }

    public static ArrayList< String> getMazePaths(int sr, int sc, int dr, int dc) {


        if (sr == dr && sc == dc) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        ArrayList<String> res = new ArrayList<>();


        //horizontal
        if (sc < dc) {
            ArrayList<String> hres = getMazePaths(sr, sc + 1, dr, dc);
            for (String hrz : hres) {
                res.add("h" + hrz);
            }
        }

        //vertical
        if (sr < dr) {
            ArrayList<String> vres = getMazePaths(sr + 1, sc, dr, dc);
            for (String ver : vres) {
                res.add("v" + ver);
            }
        }

        return res;
    }

    private static List<String> getStairsPath(int n) {

        if(n==0){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        else if(n<0){
            return new ArrayList<String>();
        }
        List<String> res1 = getStairsPath(n - 1);
        List<String> res2 = getStairsPath(n - 2);
        List<String> res3 = getStairsPath(n - 3);

        ArrayList<String> ar = new ArrayList<>();

        for (int i=0;i<res1.size();i++) {
            ar.add("1"+ res1.get(i));
        }
        for (int i=0;i<res2.size();i++) {
            ar.add("2"+ res2.get(i));
        }
        for (int i=0;i<res3.size();i++) {
            ar.add("3"+ res3.get(i));
        }

        return ar;
    }

    private static List<String> keyPadCombination(String str) {

        if(str.length()==0){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }

        List<String> res = keyPadCombination(str.substring(1));
        List<String> result = new ArrayList<>();
        String str2 = keypadmap.get(str.charAt(0)+"");
        for(int i=0 ;i<str2.length();i++){
            for (int j =0;j<res.size();j++) {
                result.add(str2.charAt(i)+res.get(j));
            }
        }
        return result;
    }

    private static ArrayList<String> getSubsequence(String str) {

        if(str.length()==0){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }

        ArrayList<String> res = getSubsequence(str.substring(1));
        ArrayList<String> ar = new ArrayList<>();
        ar.addAll(res);
        for (int i=0;i<res.size();i++) {
            ar.add(res.get(i)+str.charAt(0));
        }
        return ar;
    }

    private static void display(int[] allIndices) {
        for (int i = 0; i < allIndices.length; i++) {
            System.out.print(allIndices[i]+" ");
        }
    }

    private static int[] allIndices(List<Integer> ar, int idx,int tgt,int fsf) {

        if(idx==ar.size()){
            return new int [fsf];
        }
        else if(ar.get(idx)==tgt) {
           int arr[] = allIndices(ar,idx+1,tgt,fsf+1);
           arr[fsf] = idx;
           return arr;
        }
        else {
            int arr[]= allIndices(ar, idx + 1, tgt, fsf);
            return arr;
        }
    }

    private static int lastOccurance(List<Integer> ar, int idx,int tgt) {


        if(idx==ar.size()){
            return -1;
        }
        if(ar.get(ar.size()-1-idx)==tgt) {
            return ar.size()-1-idx;
        }

        int res =  lastOccurance(ar,idx+1,tgt);

        return res;
    }

    private static int firstOccurance(List<Integer> ar, int idx,int tgt) {


       if(idx==ar.size()){
            return -1;
        }
        if(ar.get(idx)==tgt) {
            return idx;
        }

        int res =  firstOccurance(ar,idx+1,tgt);

        return res;
    }

    private static int maxArray(List<Integer> ar,int idx) {

        if(idx==ar.size()-1){
            return ar.get(ar.size()-1);
        }
        int min = maxArray(ar,idx+1);

        return Math.min(min,ar.get(idx));
    }

    private static void displayArr(List<Integer> ar, int i) {

        if(i==ar.size())
            return;
        displayArr(ar,i+1);
        System.out.print(ar.get(i)+" ,");


    }

    private static void pzz(int n) {

        if(n==0){
            return;
        }
        System.out.println("pre " + n);
        pzz(n-1);
        System.out.println("In " +n);
        pzz(n-1);
        System.out.println("Post " +n);

    }


    private static int powerLinear(int x, int n) {

        if(n==0){
            return 1;
        }
        return x*powerLinear(x,n-1);
    }

    private static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    private static void printIncreasingDecreasing(int n) {

        if(n==0){
            return;
        }
        System.out.println(n);
        printIncreasingDecreasing(n-1);
        System.out.println(n);
    }
}
