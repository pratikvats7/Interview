package interview;

public class StringPermutation {

    public static void main(String[] args) {
        //permutation("ABC", "");
        permutation2("ABC", 0);

    }

    private static void permutation(String str, String asf) {
        if (str.isEmpty()) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String left = str.substring(0, i);
            String right = str.substring(
                    i + 1);
            String substr = left + right;
            //System.out.println(substr);
            permutation(substr, asf + str.charAt(i));
        }
    }

    private static void permutation2(String str, int idx) {
        if (idx >= str.length()) {
            System.out.print(str+" ");
            return;
        }
        String str2 = null;
        for (int j = idx; j < str.length(); j++) {
            //System.out.println(substr);
            str2 = swap(str, idx, j);
            //System.out.println(str2);
            permutation2(str2, idx + 1);
        }

    }
    //write a method to swap string in java

    private static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}

