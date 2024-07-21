package dsprep;

public class GenerateParnthesis {
    public static void main(String[] args) {
        generateParentheses(6,"",0,0,6);
    }

    private static void generateParentheses(int n, String asf, int count1, int count2,int originaln) {
        if (n == 0) {
            if (isValid(asf, count1, count2,originaln)) {
                System.out.println(asf);
            }
            return;
        }
        if (isValid(asf, count1, count2,originaln)) {
            generateParentheses(n - 1, asf + "(", count1 + 1, count2,originaln);
            generateParentheses(n - 1, asf + ")", count1, count2 + 1,originaln);
        }
    }

    private static boolean isValid(String asf, int count1, int count2,int n) {
        return count1 >= count2 && count1<=n/2; // Check if the number of opening parentheses is greater than or equal to closing parentheses
    }

}
