import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayGround {
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
        }
    };
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
            put("21", "u");
            put("22", "v");
            put("23", "w");
            put("24", "x");
            put("25", "y");
            put("26", "z");
        }
    };
    private static int maze[][] = {{0, 0, 0}, {1, 0, 0}, {1, 0, 0}};
    private static boolean visitedAr[][] = {{false, false, false}, {false, false, false}, {false, false, false}};

    public static void main(String[] args) {
        //System.out.println(printSubsequence("abc", 0, "",new ArrayList<String>()));
        //System.out.println(keyPadCombination("543"));
        //System.out.println(getMazePaths(1,1,3,3));
        //System.out.println(getMazePathsJump(1,1,3,3));
        //printStairPaths(5,"");
        //printMazePaths(1,1,3,3,"");
        //printMazePathsJump(1,1,3,3,"");
        //permutations("abc","");
        //encodings("193","");

        //floodFill(maze,0,0,"",visitedAr);
//        int ar20[] = {10,20,30,40,50};
//        targetSumSubsets(ar20,70,0,"");
        //printNQueens(RecursionAndBackTracking.chess, "", 0);
        //KnightsTour(RecursionAndBackTracking.chess,4,1,0);
        //printEncodings("pep",0);

//        for(int i=1;i<=9;i++) {
//            lexicographical(i, 100);
//        }
        //System.out.println(goldMine2(RecursionAndBackTracking.goldMine));

        //sudoku(RecursionAndBackTracking.sudoku,0,0);

        List<String> words = new ArrayList<>(){{add("LONDON");add("DELHI");add("ICELAND");add("ANKARA");}};
        crossword(RecursionAndBackTracking.crossword,words,0);

    }

    private static void crossword(String[][] crossword, List<String> words, int vidx) {
        if(vidx==words.size()){
            RecursionAndBackTracking.displayBoardString(crossword);
            return;
        }
        String word = words.get(vidx);
        for(int i= 0;i<crossword.length;i++){
            for(int j=0;j< crossword[0].length;j++){
                if(crossword[i][j]=="_"||crossword[i][j].equals(word.charAt(0)+"")){
                    if(canPlaceWordHorizontally(crossword,word,i,j)){
                        boolean[] wePlaced = placeWordHorizontally(crossword, word, i, j);
                        crossword(crossword,words,vidx+1);
                        unplaceWordHorizontally(crossword,wePlaced,i,j);
                    }
                    if(canPlaceWordVertically(crossword,word,i,j)){
                        boolean[] wePlaced = placeWordVertically(crossword, word, i, j);
                        crossword(crossword,words,vidx+1);
                        unplaceWordVertically(crossword,wePlaced,i,j);
                    }
                }
            }
        }
    }

    private static void unplaceWordVertically(String[][] crossword, boolean[] weplaced, int i, int j) {

        for (int ii = 0; ii < weplaced.length; ii++) {
            if(weplaced[ii]==true) {
                crossword[i+ii][j] = "_";
            }
        }
    }

    private static boolean[] placeWordVertically(String[][] crossword, String word, int i, int j) {
        boolean[] weplaced = new boolean[word.length()];
        for(int ii=0;ii<word.length();ii++){
            if(crossword[i+ii][j].equals("_")){
                crossword[i+ii][j]=word.charAt(ii)+"";
                weplaced[ii]=true;
            }
        }
        return weplaced;
    }

    private static boolean canPlaceWordVertically(String[][] crossword, String word, int i, int j) {
        if(i-1>=0 && crossword[i-1][j]!="+"){
            return false;
        }
        else if(i+word.length()<crossword.length && crossword[i+word.length()][j]!="+"){
            return false;
        }
        for(int ii =0;ii<word.length();ii++){
            if(i+ii>=crossword[0].length){
                return false;
            }
            if(crossword[i+ii][j].equals("_")|| crossword[i+ii][j].equals(word.charAt(ii)+"")){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    static boolean[] placeWordHorizontally(String[][] crossword, String word, int i, int j) {
        boolean[] weplaced = new boolean[word.length()];
        for(int jj=0;jj<word.length();jj++){
            if(crossword[i][j+jj].equals("_")){
                crossword[i][j+jj]=word.charAt(jj)+"";
                weplaced[jj]=true;
            }
        }
        return weplaced;
    }

    private static void unplaceWordHorizontally(String[][] crossword, boolean[] weplaced, int i, int j) {
        for (int jj = 0; jj < weplaced.length; jj++) {
            if(weplaced[jj]==true) {
                crossword[i][j + jj] = "_";
            }
        }
    }

    static boolean canPlaceWordHorizontally(String[][] crossword, String word, int i, int j) {
        if(j-1>=0 && crossword[i][j-1]!="+"){
            return false;
        }
        else if(j+word.length()<crossword[0].length && crossword[i][j+word.length()]!="+"){
            return false;
        }
        for(int jj =0;jj<word.length();jj++){
            if(j+jj>=crossword[0].length){
                return false;
            }
            if(crossword[i][j+jj].equals("_")|| crossword[i][j+jj].equals(word.charAt(jj)+"")){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    private static void sudoku(int[][] sudoku, int row, int col) {
        for(int i=1;i<=9;i++) {
            //is vacant and can be filled with i
            sudoku[row][col]=i;
            sudoku(sudoku, row, col + 1);
        }
    }

    private static int goldMine2(int[][] goldMine) {
        boolean visited[][] = new boolean[RecursionAndBackTracking.goldMine.length][RecursionAndBackTracking.goldMine[0].length];
        int max = 0;
        ArrayList<Integer> bag = new ArrayList<>();
        for(int i=0;i<goldMine.length;i++){
            for(int j =0;j<goldMine[0].length;j++){
               travelAndCollectGold(goldMine,visited,i,j,bag);
            }
        }
        Integer result = bag.stream().reduce((x, y) -> x + y).get();
        return Math.max(result,max);
    }

    private static void travelAndCollectGold(int[][] goldMine, boolean[][] visited, int i, int j, ArrayList<Integer> bag) {
        if(i>=goldMine.length || j>=goldMine[0].length || i<0 || j<0 || goldMine[i][j]==0 || visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        bag.add(goldMine[i][j]);
        travelAndCollectGold(goldMine,visited,i,j+1,bag);
        travelAndCollectGold(goldMine,visited,i+1,j,bag);
        travelAndCollectGold(goldMine,visited,i-1,j,bag);
        travelAndCollectGold(goldMine,visited,i,j-1,bag);
    }

    private static void lexicographical(int x, int n) {
        if(x> n){
            return;
        }
        System.out.print(x+",");
        for(int i=0;i<=9;i++){
            lexicographical((x * 10)+i, n);
        }
    }


    private static void printEncodings(String str,int i) {
        if(i>=str.length()){
            System.out.println(str);
            return;
        }
        String left = str.substring(0,i);
        String right = str.substring(i+1);
        int count = 1;
        if(i-1>=0&&"1234567890".contains(str.charAt(i-1)+"")){
            count=count+Integer.parseInt(str.charAt(i-1)+"");
        }
        printEncodings(left+count+right,i+1);
        printEncodings(str,i+1);
    }

    private static void KnightsTour(int[][] chess, int row, int col,int move) {
        if(row>=chess.length||col>=chess.length||row<0||col<0||chess[row][col]!=0){
            return;
        }
        if(move==chess.length*chess.length){
            chess[row][col]=move;
            RecursionAndBackTracking.displayBoard(chess);
        }
        chess[row][col]=move;
        KnightsTour(chess, row+2, col+1, move+1);
        KnightsTour(chess, row+2, col-1, move+1);
        KnightsTour(chess, row-2, col+1, move+1);
        KnightsTour(chess, row-2, col-1, move+1);
        KnightsTour(chess, row+1, col+2, move+1);
        KnightsTour(chess, row-1, col+2, move+1);
        KnightsTour(chess, row+1, col-2, move+1);
        KnightsTour(chess, row-1, col-2, move+1);
        chess[row][col]=0;
    }

    private static void printNQueens(int[][] chess, String qsf, int row) {
        if(row>= chess.length-1){
            System.out.println(qsf);
            return;
        }
        for (int col = 0; col < chess[0].length; col++) {
            if (isQueensafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row+","+col+" ", row + 1);
                chess[row][col] = 0;
            }
        }
    }
    private static boolean isQueensafe(int[][] chess,int row, int col) {
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    private static void targetSumSubsets(int[] ar, int tgt,int i,String set) {

        if(i>=ar.length||tgt<0){
            return;
        }
        if(tgt==0){
            System.out.println(set);
        }
        targetSumSubsets(ar,tgt-ar[i],i+1,set+ar[i]+",");
        targetSumSubsets(ar,tgt,i+1,set);
    }

    private static void floodFill(int[][] maze, int sr, int sc, String asf,boolean[][] visited) {

        if(sr == maze.length-1 && sc == maze[0].length-1){
            System.out.println(asf);
            return;
        }
        if(sr>=maze.length || sc>=maze[0].length || sr< 0 || sc<0 || visited[sr][sc] || maze[sr][sc]==1){
            return;
        }
        visited[sr][sc]=true;
        floodFill(maze,sr,sc+1,asf+"r",visited);
        floodFill(maze,sr+1,sc,asf+"d",visited);
        floodFill(maze,sr-1,sc,asf+"t",visited);
        floodFill(maze,sr,sc-1,asf+"l",visited);

        visited[sr][sc]=false;
    }

    private static void encodings(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        String ch0 = str.charAt(0)+"";
        String val = CharacterMap.get(ch0)==null?"":CharacterMap.get(ch0);
        encodings(str.substring(1),asf+val);
        if(str.length()>=2) {
            String ch1 = str.substring(0,2);
            String val2 = CharacterMap.get(ch1)==null?"":CharacterMap.get(ch1);
            encodings(str.substring(2), asf + val2);
        }
    }

    private static void permutations(String str, String asf) {
       if(str.length()==0){
           System.out.print(asf+", ");
           return;
       }
        for(int i = 0;i<str.length();i++) {
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            permutations(left+right, str.charAt(i)+asf);
        }
    }

    private static void printMazePathsJump(int sr, int sc, int dr, int dc,String asf) {

        if(sr==dr && sc== dc){
            System.out.print(asf+", ");
            return;
        }
        if(sr>dr||sc>dc){
            return;
        }
        List<String> res = new ArrayList<>();
        for(int ms = 1;ms<=dc-sc;ms++) {
            printMazePathsJump(sr, sc + ms, dr, dc,"h"+ms+asf);
        }
        for(int ms = 1;ms<=dr-sr;ms++) {
           printMazePathsJump(sr + ms, sc, dr, dc,"v"+ms+asf);
        }
        for(int ms = 1;ms<=dr-sr&&ms<=dc-sc;ms++) {
            printMazePathsJump(sr+ms, sc + ms, dr,dc,"d"+ms+asf);
        }
    }
    private static void printMazePaths(int sr, int sc, int dr, int dc,String asf) {

        if(sr==dr && sc== dc){
            ArrayList<String> ar = new ArrayList<>();
            System.out.print(asf+" ");
            return;
        }
        if(sr>dr||sc>dc){
            return;
        }
        printMazePaths(sr + 1, sc, dr, dc,"h"+asf);
        printMazePaths(sr, sc + 1, dr, dc,"v"+asf);
    }

    private static void printStairPaths(int n, String asf) {

        if(n==0){
            System.out.println(asf);
            return;
        }
        if(n<0){
            return;
        }
        printStairPaths(n-1,"1"+asf);
        printStairPaths(n-2,"2"+asf);
        printStairPaths(n-3,"3"+asf);
    }

    private static List<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr==dr && sc== dc){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        if(sr>dr||sc>dc){
            return new ArrayList<>();
        }
        List<String> res1 = getMazePaths(sr + 1, sc, dr, dc);
        List<String> res2 = getMazePaths(sr, sc + 1, dr, dc);
        List<String> res = new ArrayList<>();
        for (String str: res1) {
            res.add("h"+str);
        }
        for (String str: res2) {
            res.add("v"+str);
        }
        return res;
    }

    private static List<String> getMazePathsJump(int sr, int sc, int dr, int dc) {

        if(sr==dr && sc== dc){
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        if(sr>dr||sc>dc){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        for(int ms = 1;ms<=dc-sc;ms++) {
            List<String> res2 = getMazePathsJump(sr, sc + ms, dr, dc);
            for (String str: res2) {
                res.add("h"+ms+str);
            }
        }
        for(int ms = 1;ms<=dr-sr;ms++) {
            List<String> res1 = getMazePathsJump(sr + ms, sc, dr, dc);
            for (String str: res1) {
                res.add("v"+ms+str);
            }
        }
        for(int ms = 1;ms<=dr-sr&&ms<=dc-sc;ms++) {
            List<String> res2 = getMazePathsJump(sr+ms, sc + ms, dr, dc);
            for (String str: res2) {
                res.add("d"+ms+str);
            }
        }
        return res;
    }

    private static ArrayList<String> printSubsequence(String str, int i, String asf, ArrayList<String> ar) {
        if (i >= str.length()) {
            return new ArrayList<>();
        }
        ar.add(asf+str.charAt(i));
        printSubsequence(str, i + 1, asf+str.charAt(i),ar);
        printSubsequence(str, i + 1, asf,ar);
        return ar;
    }
    private static List<String> keyPadCombination(String str) {
        if (str.length() == 0) {
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        List<String> ar = keyPadCombination(str.substring(1));
        List<String> res = new ArrayList<>();
        String val = keypadmap.get(str.charAt(0)+"");
        for(int i =0;i<val.length();i++){
            for (String s : ar) {
                res.add(s + val.charAt(i));
            }
        }
        return res;
    }
}
