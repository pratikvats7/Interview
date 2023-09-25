import java.util.*;
import java.util.stream.Collectors;
import static java.util.Objects.nonNull;

public class LuvBabbarDSA {

    static String[] dict = {"one","two","three","four","five","six","seven","eight","nine"};
    static HashMap<Integer, String> dict1 = new HashMap<>();

    static int[][] dp;
    static int count = 0;

    static {
        dict1.put(1, "one");
        dict1.put(2, "two");
        dict1.put(3, "three");
        dict1.put(4, "four");
        dict1.put(5, "five");
        dict1.put(6, "six");
        dict1.put(7, "seven");
        dict1.put(8, "eight");
        dict1.put(9, "nine");
        dict1.put(10, "ten");
        dict1.put(11, "eleven");
        dict1.put(12, "twelve");
        dict1.put(13, "ten");
        dict1.put(14, "eleven");
        dict1.put(15, "twelve");
        dict1.put(16, "sixteen");
        dict1.put(17, "seventeen");
        dict1.put(18, "eighteen");
        dict1.put(19, "nineteen");
        dict1.put(20, "twenty");

        dict1.put(30, "thirty");
        dict1.put(40, "forty");
        dict1.put(50, "fifty");
        dict1.put(60, "sixty");
        dict1.put(70, "seventy");
        dict1.put(80, "eighty");
        dict1.put(90, "ninety");
        dict1.put(100, "hundred");
        dict1.put(1000, "thousand");
        dict1.put(1000000, "million");
    }
    static List<Integer> keys;
    static List<String> res = new ArrayList<>();

    static int[][] sudoku =
            {
                    {3, 0, 6, 5, 0, 8, 4, 0, 0},
                    {5, 2, 0, 0, 0, 0, 0, 0, 0},
                    {0, 8, 7, 0, 0, 0, 0, 3, 1},
                    {0, 0, 3, 0, 1, 0, 0, 8, 0},
                    {9, 0, 0, 8, 6, 3, 0, 0, 5},
                    {0, 5, 0, 0, 9, 0, 6, 0, 0},
                    {1, 3, 0, 0, 0, 0, 2, 5, 0},
                    {0, 0, 0, 0, 0, 0, 0, 7, 4},
                    {0, 0, 5, 2, 0, 6, 3, 0, 0}
            };
    static {
        keys = dict1.keySet().stream().sorted().collect(Collectors.toList());
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        //Integer[] ar = {1};
//        swapAr(ar,1,2);
//        System.out.println(reverse(ar));
//        RecursionAndBackTracking.displayAr(ar);
//        List<Integer> list = Arrays.asList(ar);
//        Stack<Integer> stack = new Stack<>();
//        stack.addAll(Arrays.asList(ar));
//        reverseStack(stack);
//        System.out.println(stack);
       // System.out.println(countAndSay(6));
        //sortStack(stack);
        //System.out.println(stack);

       // System.out.println(countCountKsum(ar,0));
//        int[] ar1 = {3,4,5,6,1,2};
//        System.out.println(search(ar1,2));

        //pattern1(5);

        //pattern4(5);

        //pattern5(5);
        //pattern6(5);

        //fancyPattern1(4);

        //fancyPattern2(5);
       // pattern7(5);

        //pascal(7);


//        int arr [] = {3,5,8,10};
//
//        System.out.println(findClosestElements(arr,2,15));
//
//        Integer[] arr1 = {0,1,2,3,4,5,6,7,8,9};
//        //op --> {3,4,5,6,7}
//        System.out.println(Arrays.asList(arr1).subList(3,7));

//        Integer arr [] = {1,1,2,2,0,0,1,2,1,1,2,2,1,1,0,1,0,1,2};
//
//        sort012(arr);
//
//        System.out.println(Arrays.asList(arr));

        //Integer ar[] = {1 ,-1 ,3 ,2 ,-7 ,-5 ,11 ,6};

//        moveNegativeToLeft(ar);
//
//        System.out.println(Arrays.asList(ar));
//
//        climbStairs(5);

//        Integer ar[] = {1,3,4,5,3,2,6};
//        findDuplicatenumber(ar);
        //Integer ar[] = {10,20,30,80,50};
        //System.out.println(checkSorted(ar,0));

//        Integer ar[] = {10,20,30,40,50,60};
//        System.out.println(binarySearchRec(ar,0,ar.length-1,50));
        //subsequence("abc","",0);
//        int ar1[] = {1,5,10,20,40,80};
//        int ar2[] = {6,7,20,80,100};
//        int ar3[] = {3,4,15,20,30,70,80};
//
//        commonElements(ar1,ar2,ar3);
//        int[][] ar = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13,14,15,16},
//                {17,18,19,20}
//        };
//        //wavePrint(ar);
//        System.out.println(spiralPrint(ar));
//        int[] ar = {1,3,4,4,4,4,4,4,6,7,9};
//
//        System.out.println(findFirstOccuranceBS(ar,4));
//
//        System.out.println(findLastOccuranceBS(ar,4));

//        int [] ar = {1, 2, 3, 4, 5, 6, 8, 9,10,11};
//
//        System.out.println(findMissingBS(ar));

//        int ar[] = {0,1,2,3,4,10,6,5};
//
//        System.out.println(peakElement(ar));

//        int ar[] = {1,2};
//        System.out.println(coinchange2(ar,5));

//        int ar[] = {5,2,3};
//        System.out.println(rodCutting(ar,7));

//        int ar[] ={2,1,4,9};
//        System.out.println(nonAdjacent(ar,0));

        //permutations("abc","");

        //System.out.println(lastOccurance("abccddefgh",'d',0,-1));

        //System.out.println(reverseString("qwerty","",0));
        //System.out.println(reverseString2("qwertyo",0));

        //System.out.println(addStrings("9993","456",3,2,"",0));

        //System.out.println(palindromeCheck("abrtba",0));

        //System.out.println(removeAllOccurrencesOfASubString("daabcbaabcbc","abc"));

//        int[] ar = {1,2,3,4,5};
//        for(int i =0;i<ar.length;i++) {
//            printAllSubArrays(ar, i, 0, new ArrayList<ArrayList<Integer>>());
//        }

//        int maze[][] = {{0, 0, 0},
//                        {1, 0, 0},
//                        {1, 0, 0}};
//         boolean visitedAr[][] = {{false, false, false}, {false, false, false}, {false, false, false}};
//
//        mazePaths(maze,visitedAr,0,0,"");
//
//
//        int ar [] = {7,3,2,16,24,4,11,9};
//
//        mergerSort(ar,0,ar.length-1);
//
//        RecursionAndBackTracking.displayAr(ar);

//        int[] ar = {63, 99 ,67 ,30 ,38 ,76, 68 ,83 ,78};
//        //quickSort(ar,0,ar.length-1);
//        quickSort2(ar,0,ar.length-1);
//        RecursionAndBackTracking.displayAr(ar);

//        permutations2("abc","");
//
//                int maze2[][] = {{1, 0, 0 ,0},
//                        {1,1, 0, 0},
//                        {1, 1,0, 0},
//                        {0, 1,1, 1}
//                };
//         boolean visitedAr2[][] = {{false, false, false,false}, {false, false, false,false}, {false, false, false,false}, {false, false, false,false}};
//
//        mazePaths2(maze2,visitedAr2,0,0,"");

        //int [] ar = {1,2,5};
        //System.out.println(countMinDigits(ar,11,0,0));
//        int ar [] = {3 ,5 ,5 ,6 ,7, 9 ,10 ,10 ,12 ,14 ,14 ,15 ,15 ,18 ,21 ,21 ,22 ,26 ,28};
//        System.out.println(ternarySearch(ar,19,26));
        //evaluateA(347148,41171001);
//        int ar [] = {7 ,1 ,5 ,3 ,6, 4};
//        System.out.println(buyAndSellStock(ar,1,ar[0]));
//        int ar [] = {1,2,600,10,20,700,20,10,50};
//        int dp [] = new int[ar.length];
//        System.out.println(houseRobber(ar,0,0,dp));

        //System.out.println(integerToEnglishWord(1234567));
//        String keyVal = "";
//        dp = new int[11][10];
//        System.out.println(wildCardPatternMatching("abcabczzzde","*abc???de*",0,0));
        //HashMap<String,Integer> map = new HashMap<>();
        //System.out.println(numSquares(206,(int)Math.sqrt(206),1,1,0,map));
        //System.out.println(numsquares(13,0));
//        int[] days = {1,4,6,7,8,20};
//        int[] dp = new int[days.length];
//        Arrays.fill(dp, -1);
//        int [] costs = {7,2,15};
//        System.out.println(minCostTickets(days,costs , 0,dp));
//        int dp[][] = new int[31][501];
//        AdityaVermaDp.initializewithminus1(dp);
//        System.out.println(numRollsToTarget(30,30,500,dp));
        //System.out.println(count);

        //DNC
//        int[] ar = {1, 20, 6, 4, 5};
//        mergeSort(ar,0,ar.length-1);
//        RecursionAndBackTracking.displayAr(ar);

//        int[] ar = {5,2,3,1};
//        quicksort3(ar,0, ar.length-1);
//        RecursionAndBackTracking.displayAr(ar);

        //printPermutations("abc","");
        //printNQueens(RecursionAndBackTracking.chess,"",0);
        //String[] pattern = new String[16];
        //System.out.println(generateParenthesis(8, new ArrayList<String>(),pattern,0));

//        res = new ArrayList<>();
//        PrintkeyPadCombination("543","");
//        System.out.println(res);
       // sudoku(sudoku,0,0);

//        long[] ar = LoveBabbarListDP.convert2("468 335 1 170 225 479 359 463 465 206 146 282 328 462 492 496 443 328 437 392 105 403 154 293 383 422 217 219 396 448 227 272 39 370 413 168 300 36 395 204 312 323");
//        System.out.println(countInversions(ar,0,ar.length-1));
//        int[]  nums = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxSubArray(nums,0));

//        int[] candidates = {2,3,6,7};
//        System.out.println(combinationSum(candidates, 7, 0 , new ArrayList<Integer>()));

//        int [] candidates = {10,1,2,7,6,1,5};
//        Arrays.sort(candidates);
//        List<List<Integer>> ans = combinationSum2(candidates, 8, 0, new ArrayList<Integer>());
//        Set<List<Integer>> set = new LinkedHashSet<>(ans);
//        System.out.println(new ArrayList<>(set));
//        int[] nums = {1,2,3};
//        List<List<Integer>> ans = permuteUnique(nums,0, new ArrayList<>());
//        Set<List<Integer>> set = new LinkedHashSet<>(ans);
//        System.out.println(new ArrayList<>(set));
//        int[] ar = {1,2,3,4,5,6,7};
//        System.out.println(countArrangement(ar,0,new ArrayList<>()));

//        int[] nums = {1,1,2,2,1};
//        Integer[] quantity = {2,3};
//        Map<Integer,Integer> numsCount = new TreeMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (numsCount.get(nums[i])!=null) {
//                numsCount.put(nums[i], numsCount.get(nums[i]) + 1);
//            } else {
//                numsCount.put(nums[i], 1);
//            }
//        }
//        Arrays.sort(quantity , Comparator.reverseOrder());
//        System.out.println(canDistribute(new ArrayList<>(numsCount.keySet()),quantity,0,numsCount));

        //System.out.println(isAnagram("anagram","nagaram"));
       // System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));

       // linked list
        //LinkedList<Integer> linkedList = new LinkedList<>();
        //LinkedList<Integer> linkedList2 = new LinkedList<>();

//        int [] ar = {2};
//        for (int i: ar) {
//            linkedList.add(i);
//        }
//        int [] ar2 = {1};
//        for (int i: ar2) {
//            linkedList2.add(i);
//        }
//        linkedList.insertAtHead(0);
//        linkedList.insertAtPos(3,100);
//        linkedList.deleteAtPos(3);
//        System.out.println(linkedList.findLength());
//        linkedList.display(); // Output: 1 2 3
//        linkedList.head = linkedList.reverseLinkedList(null,linkedList.head);
//        linkedList.display();
//        linkedList.head = linkedList.reverseKNodes(linkedList.head, 3);
//        linkedList.display();
//        System.out.println(linkedList.checkForLoop());
//        linkedList.getTail().next = linkedList.getKthNode(2);
//        linkedList.displayWithCount(10);
//        System.out.println(linkedList.checkForLoop());
//        System.out.println(Optional.ofNullable(linkedList.startingPointLoop()).map(x->x.data));
//        linkedList.removeLoop();
//        linkedList.display();
//        System.out.println(Objects.requireNonNull(linkedList.KthNodFromEnd(linkedList.head, linkedList.head, 4)).data);
//        linkedList.head = linkedList.mergeTwoLists(linkedList.head,linkedList2.head);
//        linkedList.display();

//        int [] ar = {2,6,1,5,8,3,9,4};
//        for (int i: ar) {
//            linkedList.add(i);
//        }
//        linkedList.head = linkedList.sortList(linkedList.head);
//        linkedList.display();

//        int [] ar = {2,6,1,5,8,3,9,4};
//        for (int i: ar) {
//            linkedList.add(i);
//        }
//        linkedList.head=linkedList.rotateRight(linkedList.head,3);
//        linkedList.display();

//        int [] ar = {9 , 1 , 3 ,5 ,9 ,4 ,10 ,1};
//        for (int i: ar) {
//            linkedList.add(i);
//        }
//       linkedList.linkdelete(linkedList.head,2,1);
//        linkedList.display();

//        int [] ar = {1,3,2,2,3,2,2,2,7};
//        for (int i: ar) {
//            linkedList.add(i);
//        }
//        RecursionAndBackTracking.displayAr(linkedList.nodesBetweenCriticalPoints(linkedList.head));
        //linkedList.display();

//        int [] ar = {0,3,1,0,4,5,2,0};
//        for (int i: ar) {
//            linkedList.add(i);
//        }
//        linkedList.head = linkedList.mergeNodes(linkedList.head);
//        linkedList.display();

//        Stack<Integer> s = new Stack<>();
//        int ar[] = {20 ,59 ,42 ,94 ,12 ,46 ,51 ,40 ,67 ,41 ,7 ,56};
//        for(int i : ar){s.push(i);}
//        deleteMid(s,12);
//        System.out.println(s);

//        Stack<Integer> s = new Stack<>();
//        int ar[] = {1,2,3,4,9,17};
//        for(int i : ar){s.push(i);}
//        //reverse(s);
//        //insertInaSortedStack(s,5);

//        Stack<Integer> s = new Stack<>();
//        int ar[] = {1,7,5,6,9};
//        for(int i : ar){s.push(i);}
//        sort(s);
//        System.out.println(s);
        //System.out.println(isValid("([)]"));
        //Integer ar[] = {2,1,5,6,2,3};
//        int ar[] = {2,1,7,4,3,5};
//        RecursionAndBackTracking.displayAr(nextLargerNodes(ar));
        //System.out.println(simplifyPath("/../"));
        System.out.println(isValid1("aabcbc"));
    }

    public static boolean isValid1(String s) {
        Stack<String> st = new Stack<>();
        st.push("a");
        st.push("b");
        st.push("c");
        for(int i =0;i<s.length();i++){
            String val = s.charAt(i)+"";
            Stack<String> st1 = new Stack<>();
            while(!st.isEmpty() && !st.peek().equals(val)){
                String temp = st.pop();
                st1.push(temp);
            }
            System.out.println(st);
            st.push("a");
            st.push("b");
            st.push("c");
            while(!st1.isEmpty()){
                st.push(st1.pop());
            }
            i=i+3;
        }
        System.out.println(st);
        String ans = "";
        int size = st.size();
        for(int j =0;j<size;j++){
            ans=st.pop()+ans;
        }
        System.out.println(ans);
    return true;
    }

    public static String simplifyPath(String path) {

        path = path.replaceAll("//","/");
        Stack<String> st = new Stack<>();
        st.push("/");
        System.out.println(path);
        String[] ar = path.split("/");
        RecursionAndBackTracking.displayAr(ar);
        for (String str:ar) {
            if(str.equals("..")){
                st.pop();
            }else if(!str.equals(".") && !str.equals("/") && !str.isEmpty()){
                st.push("/"+str);
            }
        }
        System.out.println(st);
        String ans = "";
        for (String str:st) {
            ans=ans+str;
        }
        return ans.replaceAll("//","/");

    }

    class StockSpanner {
        Stack<Map.Entry<Integer,Integer>> stack;
        public StockSpanner() {
            stack = new Stack<>();
            Map.Entry<Integer,Integer> entry = Map.entry(Integer.MAX_VALUE,Integer.MAX_VALUE);
            stack.push(entry);
        }

        public int next(int price) {
            int count = 0;
           while(price<stack.peek().getKey()){
                int temp = stack.pop().getValue();
                count+=temp;
            }
           stack.push(Map.entry(price,count));
           return count;
        }
    }


    int celebrity(int M[][], int n)
    {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n;i++){
            st.push(i);
        }

        while(st.size()>1){
            int i1 = st.pop();
            int i2 = st.pop();
            if(M[i1][i2]==0 && M[i2][i1]==1){
                st.push(i1);
            }else if(M[i1][i2]==1 && M[i2][i1]==0){
                st.push(i2);
            }
        }

        return st.pop();
    }
    public static int[] nextLargerNodes(int[] ll) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] ans2 = new int[ll.length];
        for(int i =0;i<ll.length;i++){
            ans.add(-1);
        }
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<ll.length;i++){
            if(ll[(st.peek())]>ll[i]){
                st.push(i);
            }else {
                while (!st.isEmpty() && ll[st.peek()] < ll[i]) {
                    System.out.println(st);
                    int temp = st.pop();
                    //System.out.print(temp + ",, " + i +" ");
                    ans.set(temp, i);
                }
                System.out.println(ans);
                st.push(i);
            }
        }
        //System.out.println();

        for(int i =0;i<ll.length;i++){
            if(ans.get(i)==-1){
                ans2[i] = 0;
            }else {
                ans2[i] = ll[ans.get(i)];
            }
        }
        return ans2;
    }

    public static int largestRectangleArea(int[] heights) {
        Integer[] ar = new Integer[heights.length];
        int i =0;
        for (int x: heights) {
            ar[i]=x;
            i++;
        }

        ArrayList<Integer> nextSmI = nextSmallerElementIndex(Arrays.asList(ar), heights.length);
        ArrayList<Integer> prevSmI = prevSmallerElementIndex(Arrays.asList(ar), heights.length);
        int max =0;
        for(int j =0;i<heights.length;i++){
            //if(nextSmI.get(i)!=heights.length && prevSmI.get(i)!=-1) {
                int area = ((nextSmI.get(j) - prevSmI.get(j)) -1) * heights[j];
            //System.out.println(area);
                max = Math.max(max, area);
            //}
        }
        return max;

    }
    static ArrayList<Integer> nextSmallerElementIndex(List<Integer> arr, int n) {
        // Write your code here.
        Stack<Integer> st = new Stack<Integer>();
        st.add(n);
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            int temp = st.peek();
            if (temp!=n && arr.get(i) > arr.get(temp)) {
                ar.add(temp);
                st.push(i);
            } else {
                while(temp!=n && arr.get(i)<=arr.get(temp)) {
                    temp = st.pop();
                }
                ar.add(temp);
                st.push(temp);
                st.push(i);
            }
        }
        Collections.reverse(ar);
        return ar;
    }

    static ArrayList<Integer> prevSmallerElementIndex(List<Integer> arr, int n) {
        // Write your code here.
        Stack<Integer> st = new Stack<Integer>();
        st.add(-1);
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = st.peek();
            if (temp!=-1 && arr.get(i) > arr.get(temp)) {
                ar.add(temp);
                st.push(i);
            } else {
                while(temp!=-1 && arr.get(i)<=arr.get(temp)) {
                    temp = st.pop();
                }
                ar.add(temp);
                st.push(temp);
                st.push(i);
            }
        }
        return ar;
    }

    static ArrayList<Integer> prevSmallerElement(List<Integer> arr, int n) {
        // Write your code here.
        Stack<Integer> st = new Stack<Integer>();
        st.add(-1);
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = st.peek();
            if (arr.get(i) > temp) {
                ar.add(temp);
                st.push(arr.get(i));
            } else {
                while(arr.get(i)<=temp) {
                    temp = st.pop();
                }
                ar.add(temp);
                st.push(temp);
                st.push(arr.get(i));
            }
        }
        return ar;
    }

    static ArrayList<Integer> nextSmallerElement(List<Integer> arr, int n) {
        // Write your code here.
        Stack<Integer> st = new Stack<Integer>();
        st.add(-1);
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            int temp = st.peek();
            if (arr.get(i) > temp) {
                ar.add(temp);
                st.push(arr.get(i));
            } else {
                while(arr.get(i)<=temp) {
                    temp = st.pop();
                }
                ar.add(temp);
                st.push(temp);
                st.push(arr.get(i));
            }
        }
        Collections.reverse(ar);
        return ar;
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        for (char c : s.toCharArray()) {
            // Push the character onto the stack
            if(map.containsValue(c)) {
                st.push(c);
            }else if(map.containsKey(c)){
                if(st.isEmpty() || !popOpening(st,map.get(c))){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    private static boolean popOpening(Stack<Character> st, Character ch) {
       if(st.isEmpty()){
           return false;
       }
        char temp = st.pop();
        if(temp == ch){
            return true;
        }
        return false;
    }

    public static Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        if(s.isEmpty()){
            return s;
        }
        int temp = s.pop();
        sort(s);
        return insertInaSortedStack(s,temp);
    }

    public static Stack<Integer> insertInaSortedStack(Stack<Integer> s,int e)
    {
        //add code here.
        if(s.isEmpty()){
            s.push(e);
            return s;
        }
        int temp = s.pop();
        if(e>temp){
            s.push(temp);
            s.push(e);
            return s;
        }
        insertInaSortedStack(s, e);
        s.push(temp);
        return s;
    }

    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverse(s);
        pushAtBottom(s,temp);
    }
    public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x)
    {
        // Write your code here
        if(myStack.isEmpty()){
            myStack.push(x);
            return myStack;
        }
        int temp = myStack.pop();
        pushAtBottom(myStack,x);
        myStack.push(temp);
        return myStack;
    }

    public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int temp = s.pop();
        if(s.size()==sizeOfStack/2){
            if(sizeOfStack%2==0){
                s.pop();
                s.push(temp);
            }
            System.out.println(temp);
            return;
        }
        deleteMid(s,sizeOfStack);
        s.push(temp);

    }
    public static class LinkedList<T> {

         void linkdelete(Node head, int M, int N)
        {
            // your code here
            //skip k nodes
            if(head ==null){
                return;
            }
            for(int i=1;i<M&&head!=null;i++){
                head = head.next;
            }
            Node mthNode = head;
            for(int i=1;i<=N && mthNode!=null ;i++){
                if(mthNode.next!=null)
                    mthNode.next = mthNode.next.next;

            }
            if(mthNode!=null)
                linkdelete(mthNode.next,M,N);
        }
        public Node rotateRight(Node head, int k) {
            Node node = head;
            Node node2 = head;
            if(k<=0){
                //System.out.println(head.data);
                return head;
            }
            //int len = 1;
            while(node.next!=null){
                node2 = node;
                node = node.next;
                //len++;
            }
            //k = k%len;
            node.next = head;
            node2.next = null;
            display(node);
            node = rotateRight(node,k-1);
            return node;
        }

        private Node<T> head;
        private int size;

        public Node<Integer> mergeNodes(Node<Integer> head) {
            int sum = 0;
            Node<Integer> HEAD = head;
            Node<Integer> itr = head.next;
            while(itr!=null){
                if(itr.data!=0){
                    sum+=itr.data;
                }
                else{
                    head.data = sum;
                    head.next = itr.next;
                    head = head.next;
                    sum = 0;
                }
                itr = itr.next;
            }
            return HEAD;
        }

        public int[] nodesBetweenCriticalPoints(Node<Integer> head) {
            int min = Integer.MAX_VALUE;
            int max = -1;
            int prev = 0;
            int first = 0;
            int count = 1;
            while (head != null) {
                count++;
                Node<Integer> next = head.next;
                if(next==null){
                    break;
                }
                Node<Integer> next2 = next.next;
                if (next2 != null) {
                    if ((next.data < head.data && next.data < next2.data) ||
                            (next.data > head.data && next.data > next2.data)) {
                        //its a minima maxima
                        //System.out.println(next.data+" "+count);
                        if(prev==0){
                            prev = count;
                        }else {
                            min = Math.min(min, count - prev);
                        }
                        if(first==0){
                            first = count;
                        }
                        else {
                            max = Math.max(max, count - first);
                        }
                        prev = count;
                        //System.out.println("min: :"+min + " max :"+max);
                    }
                }
                head = head.next;
            }
            if(min == Integer.MAX_VALUE){
                min = -1;
            }
            return new int[]{min,max};
        }

        class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        public LinkedList() {
            head = null;
            size = 0;
        }


        public void add(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }




        private void insertAtHead(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        }

        private void insertAtPos(int pos ,T data) {
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            int i = 0;
            while(i<pos){
                current = current.next;
                i++;
            }
            Node<T> temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        }

        private void deleteAtPos(int pos) {
            Node<T> current = head;
            int i = 0;
            while(i<pos){
                current = current.next;
                i++;
            }
            Node<T> temp = current.next;
            current.next = temp.next;
        }

        private Node<T> reverseLinkedList(Node<T> prev, Node<T> curr) {
            if(curr==null){
                return prev;
            }
            Node<T> temp = curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
            return reverseLinkedList(prev,curr);
        }

        private Node<T> KthNodFromEnd(Node<T> prev, Node<T> curr,int k) {

            Node<T> fast = head;
            Node<T> slow = head;
            for(int i =1;i<=k;i++){
                if(nonNull(fast)){
                    fast = fast.next;}
                else {
                    return null;
                }
            }
            while(nonNull(fast)){
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }

        private int findLength() {
            Node<T> current = head;
            int count = 0;
            while(nonNull(current.next)){
                current = current.next;
                count++;
            }
            return count;
        }

        private int findLength(Node head) {
            Node current = head;
            int count = 0;
            while(nonNull(current.next)){
                current = current.next;
                count++;
            }
            return count;
        }

        private Node<T> findMiddle(Node<T> head) {
            if (head == null || head.next == null) {
                return head;
            }
            Node<T> fast = head;
            Node<T> slow = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            return slow;
        }

        private boolean checkForLoop() {
            Node<T> fast = head;
            Node<T> slow = head;
            while(nonNull(fast)){
                fast = fast.next;
                if(nonNull(fast)) {
                    fast = fast.next;
                    slow = slow.next;
                }
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }

        private Node<T> startingPointLoop() {
            Node<T> fast = head;
            Node<T> slow = head;
            while(nonNull(fast)){
                fast = fast.next;
                if(nonNull(fast)) {
                    fast = fast.next;
                    slow = slow.next;
                }
                if(fast==slow){
                    break;
                }
            }
            Node<T> prev = fast;
            while(slow!=fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        private Node<T> removeLoop() {
            Node<T> fast = head;
            Node<T> slow = head;
            while(nonNull(fast)){
                fast = fast.next;
                Node<T> prev = fast;
                if(nonNull(fast)) {
                    fast = fast.next;
                    slow = slow.next;
                }
                if(fast==slow){
                    slow = head;
                    break;
                }
            }
            Node<T> prev = fast;
            while(slow!=fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            prev.next=null;
            return slow;
        }


        private Node<T> reverseKNodes(Node<T> tNode,int k) {

            if(tNode==null){
                return null;
            }
            Node<T> curr = tNode;
            Node<T> forward = curr.next;
            Node<T> prev = null;
            int count = 1;
            while(count<=k && curr!=null){
                forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
                count++;
            }
            tNode.next = reverseKNodes(forward,k);
            return prev;
        }

        public Node<T> getTail(){
            Node<T> current = head;
            Node<T> prev = head;
            while(nonNull(current.next)){
                prev = current;
                current = current.next;
            }
            return prev;
        }



        public Node<T> getKthNode(int k){
            Node<T> current = head;
            Node<T> prev = head;
            int count =0;
            while(nonNull(current.next) && count<=k){
                prev = current;
                current = current.next;
                count++;
            }
            return prev;
        }


        public void display() {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + "->"+
                        Optional.ofNullable(current.next).map(x->x.data) +"   ");
                current = current.next;
                count++;
            }
            System.out.println();
        }

        public void display(Node<T> head) {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + "->"+
                        Optional.ofNullable(current.next).map(x->x.data) +"   ");
                current = current.next;
                count++;
            }
            System.out.println();
        }

        public void displayWithCount(int k) {
            Node<T> current = head;
            int count = 1;
            while (count<=k) {
                System.out.print(current.data + "->"+
                        Optional.ofNullable(current.next).map(x->x.data) +"   ");
                current = current.next;
                count++;
            }
            System.out.println();
        }

        public Node<Integer> getIntersectionNode(Node<Integer> headA, Node<Integer> headB) {
            int l1 = findLength(headA);
            int l2 = findLength(headB);
            int l;
            Node<Integer> curr ;
            Node<Integer> other ;
            if(l1>l2){
                curr = headA;
                other = headB;
                l = l2;
                for(int i=1;i<=l1-l2;i++){
                    curr = curr.next;
                }
            }else{
                curr = headB;
                other = headA;
                l = l1;
                for(int i=1;i<=l1-l2;i++){
                    curr = curr.next;
                }
            }

            for(int i=0;i<l;i++){
                if(curr.equals(other)){
                    return curr;
                }
                curr = curr.next;
                other = other.next;
            }

            return null;
        }

        public Node<Integer> mergeTwoLists(Node<Integer> list1, Node<Integer> list2) {
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }
            Node<Integer> head = list1;
            Node<Integer> tempe = list1;
            if (list1.data >= list2.data) {
                list1 = list2;
                list2 = tempe;
                head = list1;
            }
            Node<Integer> current = head;
            while (list1 != null && list2 != null) {
                if (list1.data < list2.data) {
                    current = list1;
                    list1 = list1.next;
                } else {
                    Node<Integer> temp = current.next;
                    Node<Integer> temp2 = list2.next;
                    current.next = list2;
                    list2.next = temp;
                    list2 = temp2;
                    list1 = current;
                }
            }
            if (list1 == null) {
                current.next = list2;
            }
            return head;
        }


        public Node<T> sortList(Node head) {
            if(head==null || head.next==null){
                return head;
            }
            Node middle = findMiddle(head);
            Node left = head;
            Node right = middle.next;
            middle.next = null;
            left = sortList(left);
            right = sortList(right);
            return mergeTwoLists(left,right);
        }
    }

    private static boolean canPartition(int[] ar, int tgt, int idx, Boolean[][] dp) {
        if(idx>=ar.length){
            return false;
        }
        if(tgt<0){
            return false;
        }
        if(tgt==0){
            return true;
        }
        if(dp[idx][tgt]!=null){
            return dp[idx][tgt];
        }
        boolean incl = canPartition(ar,tgt-ar[idx],idx+1, dp);
        boolean excl = canPartition(ar,tgt,idx+1, dp);

        return dp[idx][tgt] =  incl || excl;
    }

    public static String reverseOnlyLetters(String s) {
        String str = "";
        int j = s.length()-1;
        int i =0;
        for(;i <s.length() && j>=0;){
            char ch = s.charAt(j);
            char ch2 = s.charAt(i);
            if(!((ch2>='a' && ch2<='z') || (ch2>='A' && ch2<='Z'))){
                str = str+ch2;
                i++;
            } else {
                if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                    str = str + ch;
                    j--;
                    i++;
                } else {
                    j--;
                }
            }
            System.out.println(str +" "+i+" "+j);
        }
        for(int k =i;k<s.length();k++){
            str+=s.charAt(k);
        }
        return str;
    }

    private static boolean isAnagram(String src, String tgt) {
        if(src.length()!=tgt.length() || src.length()==0){
            return false;
        }
        char[] ar = src.toCharArray();
        char[] ar1 = tgt.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(ar1);
        int i =0;
        for (char ch:ar1) {
            if(ch!=ar[i]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean canDistribute(ArrayList<Integer> nums, Integer[] quantity , int i1, Map<Integer, Integer> numsCount) {
        if(i1>=quantity.length){
            return true;
        }
        for (int k = 0; k < numsCount.size(); k++) {
            if (numsCount.get(nums.get(k)) >= quantity[i1]) {
                numsCount.put(nums.get(k), numsCount.get(nums.get(k)) - quantity[i1]);
                if (canDistribute(nums, quantity, i1 + 1, numsCount)) {
                    return true;
                }
                numsCount.put(nums.get(k), numsCount.get(nums.get(k)) + quantity[i1]);
            }
        }
        return false;
    }

    public static int countArrangement(int[] nums, int idx, List<Integer> asf) {
        if (idx >= nums.length) {
            System.out.println(asf);
            count++;
        }
        for (int i = idx; i < nums.length; i++) {
            if ((nums[i] % (asf.size()+1) == 0 || (asf.size()+1) % nums[i] == 0)) {
                asf.add(nums[i]);
                ChatGpt.swapAr(nums, i, idx);
                countArrangement(nums, idx + 1, asf);
                ChatGpt.swapAr(nums, i, idx);
                asf.remove(asf.size() - 1);
            }
        }
        return count;
    }

    private static List<List<Integer>> permuteUnique(int[] nums, int idx, List<Integer> asf) {

        if(idx>=nums.length){
            //System.out.println(asf);
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> asf2 = new ArrayList<>(asf);
            ans.add(asf2);
            return ans;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = idx; i < nums.length; i++) {
            asf.add(nums[i]);
            swapAr(nums,i,idx);
            List<List<Integer>> result = permuteUnique(nums, idx + 1, asf);
            ans.addAll(result);
            asf.remove(asf.size()-1);
            swapAr(nums,idx,i);
        }

        return ans;
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target , int i , ArrayList<Integer> asf) {
        if(target==0 && i<=candidates.length){
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> asf2 = new ArrayList<>(asf);
            ans.add(asf2);
            return ans;
        }
        if(target<0 || i>=candidates.length){
            return new ArrayList<>();
        }
        List<List<Integer>> res1 = new ArrayList<>();
        if(target-candidates[i]>=0) {
            asf.add(candidates[i]);
            //System.out.println(asf);
            res1 = combinationSum2(candidates, target - candidates[i], i+1, asf);
            asf.remove(asf.size() - 1);
        }
        List<List<Integer>> res2 = combinationSum2(candidates, target, i + 1, asf);
        res1.addAll(res2);
        return res1;
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target , int i, ArrayList<Integer> asf) {

        if(target<0 || i>=candidates.length){
            return new ArrayList<>();
        }
        if(target==0){
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> asf2 = new ArrayList<>(asf);
            ans.add(asf2);
            return ans;
        }
        List<List<Integer>> res1 = new ArrayList<>();
        if(target-candidates[i]>=0) {
            asf.add(candidates[i]);
            res1 = combinationSum(candidates, target - candidates[i], i, asf);
            asf.remove(asf.size() - 1);
        }
        List<List<Integer>> res2 = combinationSum(candidates, target, i + 1, asf);
        res1.addAll(res2);
        return res1;
    }

    public static int maxSubArray(int[] nums,int i) {

        maxSubArray(nums,i+1);
        return 0;
    }

    private static long countInversions(long[] ar,int start,int end) {
        if(start>=end){
            return 0;
        }
        int mid = (start+end)/2;
        countInversions(ar,start,mid);
        countInversions(ar,mid+1,end);
        return mergeTwoSortedArrays2(ar,start,end);
    }

    private static long mergeTwoSortedArrays2(long[] ar, int start, int end) {
        int mid = (start+end)/2;
        int len1 = mid - start +1;
        int len2 = end - mid;
        long [] left = new long[len1];
        long [] right = new long [len2];
        //copy
        int k = start;
        for(int i = 0;i<len1;i++){
            left[i]= ar[k];
            k++;
        }

        k = mid +1;

        for(int i = 0;i<len2;i++){
            right[i]= ar[k];
            k++;
        }

        //merge logic
        int leftindex = 0;
        int rightindex = 0;
        int mainArrayIndex = start;

        while(leftindex<len1 && rightindex<len2){
            if(left[leftindex]<=right[rightindex]){
                ar[mainArrayIndex++] = left[leftindex++];
            }else{
                count += left.length - leftindex;
                ar[mainArrayIndex++] = right[rightindex++];
            }
        }
        //copy logic for left array
        while(leftindex<len1){
            ar[mainArrayIndex++] = left[leftindex++];
        }

        while(rightindex<len2){
            ar[mainArrayIndex++] = right[rightindex++];
        }

        return count;
    }

    private static void sudoku(int[][] sudoku, int row, int col) {
        if (row >= sudoku.length) {
            RecursionAndBackTracking.displayBoard(sudoku);
            return;
        }
        int newRow;
        int newColumn = 0;
        if (col == sudoku[0].length - 1) {
            newRow = row + 1;
        } else {
            newRow = row;
            newColumn = col + 1;
        }
        if (sudoku[row][col] != 0) {
            sudoku(sudoku, newRow, newColumn);
        } else {
            for (int n = 1; n <= 9; n++) {
                if (RecursionAndBackTracking.isValid(sudoku, row, col, n)) {
                    sudoku[row][col] = n;
                    sudoku(sudoku, newRow, newColumn);
                    sudoku[row][col] = 0;
                }
            }
        }
    }

    private static void PrintkeyPadCombination(String str, String asf) {
        if(str.length()==0){
            res.add(asf);
            return;
        }
        String chars = RecursionAndBackTracking.keypadmap.get(str.charAt(0)+"");
        for(int i =0 ;i<chars.length();i++) {
            PrintkeyPadCombination(str.substring(1), asf+chars.charAt(i));
        }
    }

    private static List<String> generateParenthesis(int n, ArrayList<String> res, String[] pattern, int i) {
        if(i>=2*n){
            if((int) Arrays.stream(pattern).filter(""::equals).count()==0) {
                //System.out.println(String.join("", pattern));
                res.add(String.join("", pattern));
            }
            return res;
        }
        if(isValidParenthesis(pattern,"(",i)) {
            pattern[i] = "(";
            generateParenthesis(n, res, pattern, i + 1);
            pattern[i] = "";
        }
        if(isValidParenthesis(pattern,")",i)) {
            pattern[i] = ")";
            generateParenthesis(n, res, pattern, i + 1);
            pattern[i] = "";
        }
        return res;
    }

    private static boolean isValidParenthesis(String[] pattern, String s, int i) {
        if(s.equals("(")){
            int open = (int) Arrays.stream(pattern).filter("("::equals).count();
            return open < pattern.length / 2;
        }
        if(s.equals(")")){
            int open = (int) Arrays.stream(pattern).filter("("::equals).count();
            int close = (int) Arrays.stream(pattern).filter(")"::equals).count();
            if(close>=open){
                return false;
            }
            return true;
        }
        return false;
    }

    private static void printNQueens(int[][] chess, String asf, int row) {
        if(row>=chess.length){
            System.out.println(asf);
            return;
        }
        for (int col =0;col<chess[0].length;col++) {
            if(RecursionAndBackTracking.isQueensafe(chess,row,col)){
                chess[row][col]=1;
                printNQueens(chess, asf+row+"_"+col+",", row + 1);
                chess[row][col]=0;
            }
        }
    }

    private static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i = 0 ;i<str.length();i++) {
            String ch = str.charAt(i) + "";
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            printPermutations(left + right, asf + ch);
        }

    }

    private static void quicksort3(int[] ar, int start, int end) {
        if(start>=end){
            return;
        }
        int pos = partition3(ar,start,end);
        quicksort3(ar,start, pos-1);
        quicksort3(ar,pos+1, end);
    }

    private static int partition3(int[] ar, int start, int end) {
        int count =0;
        int el = ar[start];
        for(int i = start+1;i<=end;i++){
            if(ar[i]<=el){
                count++;
            }
        }
        swapAr(ar,start,start+count);

        int s = start+count,e =end;
        int posel = ar[s];
        while(start<s){
            if(ar[start]<posel){
                start++;
            }
            if(ar[e]>posel){
                e--;
            }
            if(ar[start]>=posel && ar[e]<=posel){
                swapAr(ar,start,e);
                start++;
            }
        }
        return s;
    }

    private static void mergeSort(int[] ar, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(ar,start,mid);
        mergeSort(ar,mid+1,end);
        mergeTwoSortedArrays(ar,start,end);
    }

    public static int numRollsToTarget(int n, int k, int target, int[][] dp) {

        if(n==0 && target == 0 ){
            return 1;
        }
        if(n<=0 || target<0){
            return 0;
        }
        if(dp[n][target]!=-1){
            return dp[n][target];
        }
        int ans =0;
        for(int i = k ; i>=1 ;i--){
            ans = (ans + numRollsToTarget(n - 1, k, target-i, dp))%1000000007;
        }
        return dp[n][target]= ans%(1000000007);
    }

    private static int minCostTickets(int[] days, int[] costs, int i, int[] dp) {
        if(i>=days.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int c1 =  costs[0] + minCostTickets(days, costs , i+1, dp);
        int index1 = getIndex(days,i,7);
        int c2 = costs[1] + minCostTickets(days, costs , index1+1, dp);
        int index2 = getIndex(days,i,30);
        int c3 = costs[2]+ minCostTickets(days, costs , index2+1, dp);
        return dp[i]= Math.min(c3,Math.min(c1,c2));
    }

    private static int getIndex(int[] days, int i, int skip) {
        int res = days.length-1;
        for(int x=i;x<days.length && days[x]-days[i]<skip;x++){
            res = x;
        }
        return res;
    }

    private static int numsquares(int tgt, int i) {

        if(tgt==0){
            return 1;
        }
        int sq = i*i;
        int res1=0,res2=0;
        if(tgt-sq>=0) {
            res1 = 1+numsquares(tgt - sq, i);
        }
        res2 = numsquares(tgt,i+1);
        return res1+res2;
    }

    private static int numSquares(int tgt, int tgt2 ,int i, int sq , int count, HashMap<String, Integer> map) {

        if(tgt<0 || i>tgt2){
            return Integer.MAX_VALUE;
        }
        if (tgt == 0) {
            return count;
        }
        String keyval = ""+tgt+","+i+";"+count;
        if(map.get(keyval)!=null){
            return map.get(keyval);
        }
        int x1=Integer.MAX_VALUE,x2=Integer.MAX_VALUE;
        if(tgt-i>=0){
            x1 = numSquares(tgt - sq, tgt2 ,i,sq,count+1, map);
        }
        int x = (i+1)*(i+1);
        if(tgt-x>=0){
            x2 = numSquares(tgt, tgt2 ,i+1,x,count, map);
        }
        map.put(keyval,Math.min(x1 ,x2));
        return Math.min(x1 ,x2);

    }

    private static boolean wildCardPatternMatching(String str, String pattern, int i1, int p1) {

        if(i1>=str.length() && p1 >=pattern.length()){
            return true;
        }
        else if(i1>=str.length() && p1<pattern.length()){
            for(int i=p1;i<pattern.length();i++){
                if(pattern.charAt(i)!='*'){
                    return false;
                }
            }
            return true;
        }
        else if(i1<str.length() && p1>=pattern.length()){
            return false;
        }
        //System.out.println(str.substring(i1) + ", " + pattern.substring(p1));
        String keyVal = str.substring(i1) + ", " + pattern.substring(p1);
        if(dp[i1][p1]!=-1){
            return dp[i1][p1] == 1;
        }
        boolean res = false;
        if(pattern.charAt(p1)==str.charAt(i1) || pattern.charAt(p1)=='?'){
            boolean ans = wildCardPatternMatching(str, pattern, i1 + 1, p1 + 1);
             dp[i1][p1]= (ans) ? 1 : 0;
             return ans;
        }
        else if(pattern.charAt(p1)=='*'){
            boolean ans = wildCardPatternMatching(str,pattern,i1,p1+1) ||
                    wildCardPatternMatching(str,pattern,i1+1,p1);
            dp[i1][p1]= (ans) ? 1 : 0;
            return ans;
        }
        return res;
    }

    private static String integerToEnglishWord(int n) {

        if (n==0){
            return "";
        }
        if(nonNull(dict1.get(n))){
            if(n>=100){
                return "One " + dict1.get(n);
            }
            return dict1.get(n);
        }
        int x=1;
        for(int i = keys.size()-1;i>=0;i--){
            if(n>keys.get(i)){
                x = keys.get(i);
                break;
            }
        }
        int y = n/x;
        int z = n%x;
        String asf = "";
        if(n>=100) {
            asf = integerToEnglishWord(y)
                    + " " +
                    dict1.get(x) + " " +
                    integerToEnglishWord(z);
        }else{
            asf = dict1.get(x) + " " +
                    integerToEnglishWord(z);
        }

        return asf;
    }

    private static int houseRobber(int[] ar, int i,int ssf,int dp[])
    {
        if(i>=ar.length){
           return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        return dp[i]=Math.max(ar[i]+houseRobber(ar,i+2,ar[i]+ssf,dp),houseRobber(ar,i+1,ssf,dp));
    }

    private static int buyAndSellStock(int[] ar,int i,int min) {

        if(i>=ar.length){
            return 0;
        }
        int profit = ar[i]-min;
        min = Math.min(min,ar[i]);
        return Math.max(profit,buyAndSellStock(ar,i+1,min));
    }

    public static long evaluateA(long A,long K) {
        // code here
        if(K==0){
            return 1;
        }
        long ans = 1+A*(evaluateA(A,K-1));
        return ans%(1000000007);
    }

    static int ternarySearch(int arr[], int N, int K)
    {
        // Your code here
        return ternarySearchAlgo(arr,N,K,0,N-1);

    }
    static int ternarySearchAlgo(int arr[], int N, int K,int i1,int i4){


        if(N<3){
            if(arr[i1]==K || arr[i4]==K){
                return 1;
            }
            return -1;
        }
        int i2 = i1+N/3;
        int i3 = i2+N/3;

        i2 = Math.min(i2, i4);
        i3 = Math.min(i3, i4);

        System.out.println(N+" "+i1+" "+i2 + " "+i3 +" "+i4);

        if(arr[i1]==K || arr[i2]==K || arr[i3]==K || arr[i4]==K){
            return 1;
        }
        if(i2>i1 && arr[i1]<=K && arr[i2]>=K){
            return ternarySearchAlgo(arr,i2-i1+1,K,i1,i2);
        }
        else if(i3>i2 && arr[i2]<=K && arr[i3]>=K){
            return ternarySearchAlgo(arr,i3-i2+1,K,i2,i3);
        }
        else if(i4>i3 && arr[i3]<=K && arr[i4]>=K){
            return ternarySearchAlgo(arr,i4-i3+1,K,i3,i4);
        }

        return -1;
    }

    private static int countMinDigits(int[] ar, int tgt,int i,int count) {
        if(tgt==0){
            return count;
        }
        else if(tgt<0 || i>=ar.length){
            return Integer.MAX_VALUE;
        }
        return Math.min(countMinDigits(ar,tgt-ar[i],i,count+1),countMinDigits(ar,tgt,i+1,count));
    }

    private static void mazePaths2(int[][] maze, boolean[][] visitedAr, int r, int c, String asf) {

        if(r == maze.length-1 && c==maze[0].length-1){
            System.out.println(asf);
            return;
        }
        if(r<0 || c<0 || r>= maze.length || c>=maze[0].length || maze[r][c]==0 || visitedAr[r][c]){
            return;
        }
        visitedAr[r][c]=true;
        mazePaths2(maze,visitedAr,r+1,c,asf+"d");
        mazePaths2(maze,visitedAr,r,c+1,asf+"r");
        mazePaths2(maze,visitedAr,r-1,c,asf+"u");
        mazePaths2(maze,visitedAr,r,c-1,asf+"l");

        visitedAr[r][c]=false;
    }

    private static void permutations2(String str,String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i = 0;i<str.length();i++){
            String right = str.substring(i+1);
            String left  = str.substring(0,i);
            permutations2(left+right,asf+str.charAt(i));
        }
    }

    static void quickSort2(int arr[], int start, int end)
    {
        if(start>=end){
            return;
        }
        int pivot = start;
        //count no of elements smaller than ar[i]
        //int pivot = partition(arr,start , end);
        //int count = countpos(arr,start,end,arr[start]);
        //swap ar[i] and ar[count+1]
        //move pivot to the next element??-->no
        //// if(count >0) {
        pivot = partition2(arr,start , end);
       // System.out.println();
        quickSort2(arr, start, pivot - 1);
        quickSort2(arr,pivot+1,end);

    }
    static int partition2(int ar[], int start, int end)
    {
        int pivot = start;
        int i = start;
        int j = end;
        while(i<j){
            while(ar[i]<=ar[pivot] && i<end){
                i++;
            }
            while(ar[j]>=ar[pivot] && j>start){
                j--;
            }
            if(i<j){
                swapAr(ar,i,j);
                RecursionAndBackTracking.displayAr(ar);
                System.out.println();
            }

        }
        if(i!=pivot){
            swapAr(ar,j,pivot);
        }
        return j;
    }

    private static void quickSort(int[] arr,int start,int end) {

        if(start>=end){
            return;
        }
        int pivot = start;
        //count no of elements smaller than ar[i]
        int count = countpos(arr,start,end,arr[pivot]);
        //swap ar[i] and ar[count+1]
        //move pivot to the next element??-->no
        if(count >0) {
            partitiion(arr,start , end,count);
            pivot = start+count;
            quickSort(arr, start, pivot - 1);
        }
        quickSort(arr,pivot+1,end);
        //partition on pivot and sort thr remaining array using pivot sort basically recurse.

    }

    private static void partitiion(int[] ar, int start, int end,int count) {

        swapAr(ar,start,start+count);
        int pivot = start+count;

       int i = start;
       int j = end;
       while(i<pivot && j>pivot){
           while(ar[i]<ar[pivot]){
               i++;
           }
           while(ar[j]>ar[pivot]){
               j--;
           }
          if(i<pivot && j>pivot){
              swapAr(ar,i,j);
          }

       }
    }

    private static int countpos(int[] ar, int start, int end,int target) {
        int count =0;
        for(int i = start+1;i<=end;i++){
            if(ar[i]<=target){
                count++;
            }
        }
        return count;
    }

    private static void mergerSort(int[] ar,int start , int end) {

        if(start>=end ){
            return;
        }
        //divide
        int mid = (start+end)/2;
        mergerSort(ar,start,mid);
        mergerSort(ar,mid+1,end);
        mergeTwoSortedArrays(ar,start,end);
    }

    private static void mergeTwoSortedArrays(int[] ar, int start, int end) {
       int mid = (start+end)/2;
       int len1 = mid - start +1;
       int len2 = end - mid;
       int [] left = new int[len1];
       int [] right = new int [len2];
       //copy
        int k = start;
        for(int i = 0;i<len1;i++){
           left[i]= ar[k];
           k++;
        }

        k = mid +1;

        for(int i = 0;i<len1;i++){
            right[i]= ar[k];
            k++;
        }

        //merge logic
        int leftindex = 0;
        int rightindex = 0;
        int mainArrayIndex = start;

        while(leftindex<len1 && rightindex<len2){
            if(left[leftindex]<right[rightindex]){
                ar[mainArrayIndex++] = left[leftindex++];
            }else{
                ar[mainArrayIndex++] = right[rightindex++];
            }
        }
        //copy logic for left array
        while(leftindex<len1){
            ar[mainArrayIndex++] = left[leftindex++];
        }

        while(rightindex<len2){
            ar[mainArrayIndex++] = right[rightindex++];
        }
    }

    private static void mazePaths(int[][] maze, boolean[][] visitedAr,int i,int j,String asf) {

        if(i<0||j<0||i>=maze.length||j>=maze[0].length || visitedAr[i][j] || maze[i][j]==1) {
            return;
        }
        if(i==maze.length-1 && j == maze[0].length-1){
            System.out.println(asf);
            return;
        }
        visitedAr[i][j]=true;

        mazePaths(maze,visitedAr,i+1,j,asf+"D");
        mazePaths(maze,visitedAr,i,j-1,asf+"L");
        mazePaths(maze,visitedAr,i,j+1,asf+"R");
        mazePaths(maze,visitedAr,i-1,j,asf+"U");

        visitedAr[i][j]=false;
    }

    private static void printAllSubArrays(int[] ar, int begin, int end , ArrayList<ArrayList<Integer>> integers) {
        if(end>=ar.length){
            System.out.println(integers);
            return;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = begin ;i<=end;i++){
            list.add(ar[i]);
        }
        if(list.size()>0) {
            integers.add(list);
        }
        printAllSubArrays(ar,begin,end+1,integers);
    }

    private static String removeAllOccurrencesOfASubString(String str, String sub) {

        int idx = str.indexOf(sub);
        if(idx==-1){
            return str;
        }
        StringBuilder st = new StringBuilder(str);
        st.delete(idx,idx+sub.length());
        str = String.valueOf(st);

        return removeAllOccurrencesOfASubString(str,sub);
    }
    private static boolean palindromeCheck(String str, int i) {

        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
        }
        return palindromeCheck(str,i+1);
    }

    private static String addStrings(String num1, String num2,int i, int j,String ans,int carry) {
        if(i<0 && j<0){
            if(carry!=0){
                return carry+ans;
            }
            return ans;
        }
        int n1 = (i>=0?num1.charAt(i):'0') - '0';
        int n2 = (j>=0?num2.charAt(j):'0') - '0';
        int sum = n1+n2+carry;
        carry = sum/10;
        ans = sum%10+ans;
        return addStrings(num1,num2,i-1,j-1,ans,carry);
    }

    private static String reverseString2(String str, int i) {

        if(i>=str.length()/2){
            return str;
        }
        String str2 = swapStr(str,i,str.length()-1-i);
        return reverseString2(str2,i+1);
    }

    private static String swapStr(String str,int i,int j) {
       StringBuilder st = new StringBuilder(str);
       st.setCharAt(i,str.charAt(j));
       st.setCharAt(j,str.charAt(i));
        return String.valueOf(st);
    }

    private static String reverseString(String str, String asf, int i) {

        if(i>=str.length()){
            return asf;
        }
        return reverseString(str,str.charAt(i)+asf,i+1);
    }

    private static int lastOccurance(String str, char ch,int i,int ans) {
        if(i>=str.length()){
            return ans;
        }
        if(str.charAt(i)==ch){
           ans = i;
        }
        return  lastOccurance(str, ch, i+1,ans);
    }

    private static void permutations(String str,String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0 ;i<str.length();i++) {
            String leftStr = str.substring(0,i);
            String rightStr = str.substring(i+1);
            String ch = str.charAt(i)+"";
            permutations(leftStr+rightStr, asf + ch);
        }

    }

    private static int nonAdjacent(int[] ar,int i) {
        if(i>=ar.length){
            return 0;
        }
        return Math.max((ar[i]+nonAdjacent(ar,i+2)),nonAdjacent(ar,i+1));
    }

    private static int rodCutting(int[] ar, int tgt) {
        if(tgt==0){
            return 0;
        }
        if(tgt<0){
            return Integer.MIN_VALUE;
        }
        int mini = Integer.MIN_VALUE;
        for (int j : ar) {
            int ans =  rodCutting(ar, tgt - j);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.max(mini, ans + 1);
            }
        }
        return mini;
    }

    private static int coinchange2(int[] ar, int tgt) {
        if(tgt==0){
            return 0;
        }
        if(tgt<0){
            return Integer.MAX_VALUE;
        }
        int mini = Integer.MAX_VALUE;
        for (int j : ar) {
            int ans =  coinchange2(ar, tgt - j);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, ans + 1);
            }
        }
        return mini;
    }



    private static int peakElement(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int mid = (s+e)/2;
        int ans = -1;
        while(s<=e) {
            if(mid==0 || mid==nums.length-1 ){
                return -1;
            }
            if(nums[mid] > nums[mid+1] && nums[mid]>nums[mid-1]) {
               return mid;
            } else if(nums[mid]<nums[mid+1]) {
                s = mid+1;
            } else {
                e = mid -1;
            }
            mid = (s+e)/2;
        }
        return ans;
    }

    private static int findMissingBS(int[] ar) {
        int s = 0;
        int e = ar.length-1;
        int mid = (s+e)/2;
        while(s<=e){
            if(Math.abs(ar[mid]-ar[mid-1])==2){
                return ar[mid]-1;
            }
            if(ar[mid]>mid+1){
               e = mid-1;
            }else{
                s = mid+1;
            }
            mid = (s+e)/2;
        }
        return mid;
    }

    private static int findLastOccuranceBS(int[] ar, int tgt) {
        int s = 0;
        int e = ar.length-1;
        int mid = (s+e)/2;
        int ans = -1;
        while(s<=e) {
            if(ar[mid] == tgt) {
                ans = mid;
                s = mid + 1;
            } else if(tgt>ar[mid]) {
                s = mid+1;
            } else {
                e = mid -1;
            }
            mid = (s+e)/2;
        }
        return ans;
    }

    private static int findFirstOccuranceBS(int[] ar,int tgt) {
        int s = 0;
        int e = ar.length-1;
        int mid = (s+e)/2;
        int ans = -1;
        while(s<=e) {
            if(ar[mid] == tgt) {
                ans = mid;
                e = mid -1;
            } else if(tgt>ar[mid]) {
                s = mid+1;
            } else {
                e = mid -1;
            }
            mid = (s+e)/2;
        }
        return ans;
    }


    private static List<Integer> spiralPrint(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int count =1;
        for(int i=0;i<matrix.length && count < matrix.length*matrix[0].length;i++){

            for(int j=i;j<matrix[0].length-i;j++){
                res.add(matrix[i][j]);
                count++;

            }
            if(count==matrix.length*matrix[0].length){
                break;
            }
            for(int j=i+1;j<matrix.length-i;j++){
                res.add(matrix[j][matrix[0].length-1-i]);
                count++;
            }
            if(count==matrix.length*matrix[0].length){
                break;
            }

            for(int j=i+1;j<matrix[0].length-i;j++){
                res.add(matrix[matrix.length-1-i][matrix[0].length-1-j]);
                count++;
            }
            if(count==matrix.length*matrix[0].length){
                break;
            }
            for(int j=matrix.length-1-(i+1);j>i;j--){
                res.add(matrix[j][i]);
                count++;
            }
            if(count==matrix.length*matrix[0].length){
                break;
            }
        }
        return res;
    }

    private static void wavePrint(int[][] ar) {
        for(int i=0;i<ar[0].length;i++){
            for(int j=0;j<ar.length;j++){
                if(i%2==0)
                    System.out.print(ar[j][i]+" ");
                else
                    System.out.print(ar[ar.length-1-j][i]+" ");
            }
        }
    }


    private static void commonElements(int[] a, int[] b, int[] c) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length && k<c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.println(a[i]);
                i++;j++;k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (c[k] < b[j]) {
                k++;
            } else {
                j++;
            }
        }
    }

    private static void subsequence(String str,String asf,int i) {

        if(i==str.length()){
            System.out.print(asf+", ");
            return;
        }
        subsequence(str,asf+str.charAt(i),i+1);
        subsequence(str,asf,i+1);
    }

    private static int binarySearchRec(Integer[] ar, int s, int end,int tgt) {
        if(s>end){
            return -1;
        }
        int mid = (s+end)/2;
        if(ar[mid]==tgt){
            return mid;
        }
        if(ar[mid]<tgt){
            return binarySearchRec(ar,mid+1,end,tgt);
        }
        else{
            return binarySearchRec(ar,s,mid-1,tgt);
        }
    }

    private static boolean checkSorted2(Integer[] ar,int i) {
        if(i>=ar.length-1){
            return true;
        }
        if(ar[i]>ar[i+1]){
            return false;
        }
        return  checkSorted(ar,i+1);
    }
    private static boolean checkSorted(Integer[] ar,int i) {
        if(i>=ar.length-1){
            return true;
        }
        return  ar[i]<=ar[i+1] && checkSorted(ar,i+1);
    }

    private static void findDuplicatenumber(Integer[] ar) {
        for(int i=0;i<ar.length;i++){
            if(ar[Math.abs(ar[i])]<0){
                System.out.println(ar[i]);
            }else{
                ar[Math.abs(ar[i])]=-1*ar[Math.abs(ar[i])];
            }
        }
    }

    public static int climbStairs(int n) {

        // Code here
        int dp[] = new int[n+1];
        return climbStairs2(n,dp);

    }

    public static int climbStairs2(int n, int[]dp) {

        // Code here
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        if(n==0){
            return 1;
        }
        return  climbStairs2(n-1,dp) + climbStairs2(n-2,dp);

    }

    private static void moveNegativeToLeft(Integer[] ar) {
        int l = 0;
        int h = ar.length-1;
        while(l<=h){
            if(ar[l]>0){
                l++;
            }
            else if (ar[h]<0){
                h--;
            }
            else{
                swap(ar,l,h);
            }
        }
    }

    private static void sort012(Integer[] a) {
        int start = 0;
        int start2 = 0;
        int end = a.length-1;
        while(start<=end && start2<=end) {
            int flag = -1;
            if(a[start]==0){
                start++;
                start2 = start;
                flag = 0;
            }
           if(a[end]==2){
                end--;
                flag =0;
            }
            if(flag == -1 && start2<a.length-1) {
                if (a[start2] == 0) {
                    swap(a,start2,start);
                    start ++;

                } else if (a[start2] == 2) {
                    swap(a,start2,end);
                    end--;
                }
                else {
                    start2++;
                }
            }

        }

    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int high = LowerBound(arr, x);
        int low = high - 1;
        while (k >= 1) {
            if (low < 0) high++;
            else if (high >= arr.length) low--;
            else if (x - arr[low] > arr[high] - x) high++;
            else low--;
            k--;
        }
        ArrayList<Integer> l1 = new ArrayList<>();
        low++;
        high--;
        while (low <= high) {
            l1.add(arr[low]);
            low++;
        }
        return l1;
    }

    public static int LowerBound(int[] arr, int x) {
        int s = 0, l = arr.length - 1;
        int ans = 0;
        while (s <= l) {
            int mid = s + (l - s) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                l = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        if(s>=arr.length){
            ans = arr.length-1;
        }
        return ans;
    }

    private static void pascal(int n) {
        int inc =-1;
        for(int i =0;i<n;i++){
            int count = 1;
            inc++;
            for(int j =0;j<i;j++){
                System.out.print(count+" ");
                count = count+inc+1;
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {

        for(int i =n-1;i>=0;i--){
            for(int j = 0;j<=2*n;j++){
                if((i+j==n || j==n+i) || ((j>=n-i) && j<=n+i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0;i<n-1;i++){
            for(int j = 0;j<=2*n;j++){
                if((i+j==n || j==n+i || ((j>=n-i) && j<=n+i)))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void fancyPattern2(int n) {
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j =0;j<=i*2;j++){
                if(j<=i)
                    System.out.print((char)(65+count++)+" ");
                else {
                    count --;
                    System.out.print((char) (65 + (count-1)) + " ");
                }

            }
            System.out.println();
        }
    }

    private static void fancyPattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }

        for(int i=n-1;i>=0;i--){
            for(int j =0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {

        for(int i =0;i<n-1;i++){
            for(int j = 0;j<=2*n;j++){
                if((i+j==n || j==n+i || ((j>=n-i) && j<=n+i)))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n-1;i>=0;i--){
            for(int j = 0;j<=2*n;j++){
                if((i+j==n || j==n+i) || ((j>=n-i) && j<=n+i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for(int i=1;i<=n;i++){
            int count =i;
            for(int j=1;j<=2*n;j++){
                if(j>n-i && j<n+i) {
                    if(j<n)
                        System.out.print(count++ + " ");
                        else
                            System.out.print(count-- + " ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {

        for(int i =0;i<n-1;i++){
            for(int j = 0;j<2*n;j++){
                if((i+j==n || j==n+i))
                    System.out.print("*"+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i =n-1;i>=0;i--){
            for(int j = 0;j<2*n;j++){
                if((i+j==n || j==n+i))
                    System.out.print("*"+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for(int i =0;i<n;i++){
            for(int j = 0;j<2*n;j++){
                if((i+j>=n && j<=n+i))
                    System.out.print("*"+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 || j==1 || i+j==n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for(int i = 1;i<=n;i++){
            int count = 0;
            for(int j = 1;j<=2*n;j++){
                if(j<=n-i)
                    System.out.print(" ");
                else if(j<=n) {
                    count++;
                    if(count==1 || count ==i || i==n)
                        System.out.print(count + " ");
                    else
                        System.out.print("  ");
                }
                }
            System.out.println();
            }
    }

    public static int piv(int nums[]){
        int s = 0,l = nums.length-1;
        while(s<=l){
            int mid = s+(l-s)/2;
            System.out.println(mid);
            if(mid+1 < nums.length && nums[mid] > nums[mid+1]) return mid;
            else if (mid-1 >= 0 && nums[mid-1] > nums[mid]) return mid-1;
            else if(nums[s] <= nums[mid]) s = mid + 1;
            else l = mid - 1 ;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        if(nums[0] == target) return 0;
        int piv = piv(nums);
        int s=0,l=nums.length-1;
        if(piv <0) return binarySearch0(nums,s,l,target);
        int index = binarySearch0(nums,s,piv,target);
        if(index < 0) index =  binarySearch0(nums,piv+1,l,target);
        if(index < 0) return -1;
        return index;
    }

    private static int countCountKsum(Integer[] nums,int k) {
        if(k==0){
            return (int)Arrays.stream(nums).filter(x->x==0).count();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int ar[] = new int [nums.length];
        int sum=0;
        for(int i =0;i<ar.length;i++){
            sum+=nums[i];
            ar[i]=sum;
            if(sum==k){
                map.put(sum,1);
                continue;
            }
            map.put(sum,0);
        }
        System.out.println(map);
        map.entrySet().forEach(x->
        {
            if(map.containsKey(x.getKey()-k)) {
                x.setValue(x.getValue()+1);
            }
        }
        );
        System.out.println(map);
        return map.values().stream().reduce(Integer::sum).get();
    }


    private static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int element = stack.pop();
        sortStack(stack);
        sortandInsertinStack(stack,element,0);
    }

    private static void sortandInsertinStack(Stack<Integer> stack, int element,int flag) {
        if(stack.isEmpty() || flag==-1){
            stack.push(element);
            return;
        }
        int e1 = stack.pop();
        if(e1<element) {
            sortandInsertinStack(stack, element,0);
            stack.push(e1);
        }else{
            sortandInsertinStack(stack, e1,-1);
            stack.push(element);
        }
    }

    private static int countAndSay(int num) {
        if(num==1){
            return 1;
        }
        int res = countAndSay(num-1);
        System.out.println(res);
        return convertCountandSay(res);
    }

    private static int convertCountandSay(int res) {
        String str = res+"";
        StringBuilder result= new StringBuilder();
        int count = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                result.append(count).append(str.charAt(i));
                count=1;
            }
        }
        result.append(count).append(str.charAt(str.length()-1));
        return Integer.parseInt(result.toString());
    }

    private static void reverseStack(Stack<Integer> stack) {

        if(stack.isEmpty()){
            return;
        }
        int m1 = stack.pop();
        reverseStack(stack);
        insertInStack(stack,m1);
    }

    private static void insertInStack(Stack<Integer> stack, int element) {
        if(stack.isEmpty())
            stack.push(element);
        else{
            int e1 = stack.pop();
            insertInStack(stack,e1);
            stack.push(element);
        }
    }

    private static int maxMin(int[] ar) {
        int max = ar[0],min = ar[0];
        for(int i=2;i<ar.length;i++){
            if(ar[i]<min){
                min = ar[i];
            }else if(ar[i]>max){
                max = ar[i];
            }
        }
        System.out.println(max +" "+min);
        return max+min;
    }

    private static int[] reverse(int[] ar) {
        for(int left=0,right=ar.length-1;left<right;left++,right--){
            swapAr(ar,left,right);
        }
        return ar;
    }

    private static void swapAr(int[] ar, int i, int i1) {
        int temp = ar[i];
        ar[i] = ar[i1];
        ar[i1]=temp;
    }
    private static void swap(Integer[] ar, int i, int i1) {
        int temp = ar[i];
        ar[i] = ar[i1];
        ar[i1]=temp;
    }



    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1;  // key not found.
    }


}
