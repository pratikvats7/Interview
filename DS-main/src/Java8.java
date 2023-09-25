import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Java8 {

    static class A{
        private Date date;
        private String date2;

        public String getDate2() {
            return date2;
        }

        public void setDate2(String date2) {
            this.date2 = date2;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

    public static void main(String[] args) {


       }

    private static boolean testprint() {
//        if(1==1)
//            throw new IndexOutOfBoundsException("hy");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("interupted");
        }
        System.out.println("in method");
        return true;
    }
}
