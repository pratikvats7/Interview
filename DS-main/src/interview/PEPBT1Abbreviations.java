package interview;

import java.util.ArrayList;
import java.util.Collections;


//https://www.codingninjas.com/studio/problems/generalized-abbreviation_1233144?leftPanelTabValue=SUBMISSION
public class PEPBT1Abbreviations {
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<String>();
        abbreviations("abc", "", res);
        Collections.sort(res);
        System.out.println(res);
    }

    private static void abbreviations(String str, String asf, ArrayList<String> strings) {
        if (str.length() == 0) {
            asf = replaceConsecutiveNumbers(asf);
            System.out.print(asf + " ");
            strings.add(asf);
            return;
        }
        abbreviations(str.substring(1), asf + str.charAt(0), strings);
        abbreviations(str.substring(1), asf + 1, strings);
    }

    public static String replaceConsecutiveNumbers(String input) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        boolean counting = false;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
                counting = true;
            } else {
                if (counting) {
                    result.append(sum);
                    sum = 0;
                    counting = false;
                }
                result.append(c);
            }
        }

        // Append the sum if the last character was a digit sequence
        if (counting) {
            result.append(sum);
        }

        return result.toString();
    }

}
