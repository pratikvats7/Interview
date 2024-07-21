package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PEPBT3MaxScoreOfWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "dad", "good");
        List<String> letters = Arrays.asList("a", "a", "c", "d", "d", "d", "g", "o", "o");
        List<Integer> scores = Arrays.asList(1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        //System.out.println(calculateWordScore("dog",scores, letters));
        System.out.println(maxScore(words, new ArrayList<String>(), 0, letters, scores) + " res");
    }

    private static int maxScore(List<String> words, ArrayList<String> strings, int idx, List<String> letters, List<Integer> scores) {

        if(idx>=words.size()){
            return 0;
        }
        int score1 = calculateWordScore(words.get(idx),scores,letters);
        strings.add(words.get(idx));
        List<String> newLetters = removeCharacters(letters, words.get(idx));
        int sc1 = score1 + maxScore(words,strings,idx+1,newLetters,scores);
        addCharacters(letters,words.get(idx));
        strings.remove(words.get(idx));
        int sc2 = maxScore(words,strings,idx+1,letters,scores);

        return Math.max(sc1,sc2);
    }

    public static int maxScoreWords(String[] words, char[] letters, int[] score) {

        List<Integer> scores = Arrays.stream(score).boxed().toList();
        List<String> lettersA = new String(letters).chars()
                .mapToObj(c -> String.valueOf((char) c))
                .toList();
        List<String> wordsA = Arrays.stream(words).toList();

        return maxScore(wordsA, new ArrayList<String>(), 0, lettersA, scores);
    }

    public static int calculateWordScore(String word, List<Integer> scores, List<String> letters) {
        int sum = 0;

        List<String> updatedLetters = new ArrayList<>(letters);

        // Iterate through each character in the word
        int flag =-1;
        for (char c : word.toCharArray()) {
            String character = String.valueOf(c);

            // Check if the character exists in the list
            if (updatedLetters.contains(character)) {
                // Add the score of the character to the total sum
                int index = c - 'a';

                // Add the score of the character to the total sum
                sum += scores.get(index);

                // Remove the character from the list after it's used
                updatedLetters.remove(character);
            }else{
                return 0;
            }
        }
        return sum;
    }

    public static List<String> removeCharacters(List<String> letters, String word) {
        List<String> resultList = new ArrayList<>(letters);

        // Convert the word to lowercase to handle case sensitivity
        word = word.toLowerCase();

        // Iterate through each character in the word
        for (char c : word.toCharArray()) {
            String character = String.valueOf(c);

            // Remove the character from the list if it exists
            resultList.remove(character);
        }

        return resultList;
    }

    public static List<String> addCharacters(List<String> letters, String word) {
        List<String> resultList = new ArrayList<>(letters);

        // Convert the word to lowercase to handle case sensitivity
        word = word.toLowerCase();

        // Split the word into characters and add them to the list
        for (char c : word.toCharArray()) {
            String character = String.valueOf(c);

            // Add the character to the list if it doesn't already exist
            if (!resultList.contains(character)) {
                resultList.add(character);
            }
        }

        return resultList;
    }


}
