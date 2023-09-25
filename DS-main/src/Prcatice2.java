public class Prcatice2 {

    public static void main(String[] args) {

        abbreviations("pep",0,0,"");

    }

    private static void abbreviations(String str, int idx,int count, String asf) {

        if(idx==str.length()){
            if(count==0){
                System.out.println(asf);}
            else{
                System.out.println(asf+count);
            }
            return;
        }
        abbreviations(str,idx+1,count+1 ,asf);

        if(count > 0)
            abbreviations(str,idx+1,0 ,asf+(count)+str.charAt(idx));
        else
            abbreviations(str,idx+1,0,asf+str.charAt(idx));
    }
    }

