package interview;


import java.util.Arrays;

public class ShiftAllZerosToEnd {
    public static void main(String[] args) {
        Integer ar[] = {1,2,0,4,-1,5,6,0,7,0,0,0};
        shiftZeros(ar);
        Arrays.stream(ar).forEach(x-> System.out.print(x+", "));
    }

    private static void shiftZeros(Integer[] ar) {
        int count = 0;
        for (int i =0;i<ar.length;i++){
            if(ar[i]!=0) {
                ar[count++] = ar[i];
            }
        }
        for(int i = count;i<ar.length;i++){
            ar[i] = 0;
        }
    }
}
