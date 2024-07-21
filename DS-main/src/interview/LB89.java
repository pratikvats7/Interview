package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LB89 {
    public static void main(String[] args) {
        String[][] ar = {
                {"you", "we"},
                {"have", "are"},
                {"sleep", "eat", "drink"}
        };
        // Convert the 2D String array to an ArrayList of ArrayLists
        List<ArrayList<String>> listOfLists = Arrays.stream(ar)
                .map(row -> new ArrayList<>(Arrays.asList(row))).toList();
        System.out.println(listOfLists);
        createSentences(new ArrayList<>(listOfLists),new ArrayList<>());
    }

    public static void createSentences(ArrayList<ArrayList<String>> arr, ArrayList<ArrayList<String>> ans) {

        createSentences(arr,0,0,0,ans,new ArrayList<String>());
        System.out.println(ans );

    }

    private static void createSentences(ArrayList<ArrayList<String>> arr, int i, int j, int k, ArrayList<ArrayList<String>> ans, ArrayList<String> strings) {
        if(i==arr.size()){
            ans.add(new ArrayList<>(strings));
            return;
        }
        if(k==arr.get(i).size()){
            return;
        }
        //System.out.print(arr.get(i).get(j) +" ");
        strings.add(arr.get(i).get(k));
        createSentences(arr,i+1,j, 0, ans, strings);
        strings.remove(strings.size()-1);
        createSentences(arr,i,j, k+1, ans, strings);
    }
    // Write your code here.

    }
