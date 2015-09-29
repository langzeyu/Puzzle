package WildMatch;

/**
 * Created by lang on 2015/8/25.
 */
public class WildMatch {
    public static Boolean wildMatch(String a,int lena, String b,int lenb){
        if(lena == 1 && lenb == 1){
            if (a.substring(0,1) == b.substring(0,1)){
                return true;
            }else if ("." == (a.substring(0,1))){
                return true;
            }else
                return false;
        }else if (lena > 1 && lenb >1){
            if (a.substring(a.length()-1) == b.substring(b.length()-1)){
                wildMatch(a.substring(0,a.length()-2),a.length()-1,b.substring(0,b.length()-2),b.length()-1);
            }else if(b.substring(b.length()-1) == "*"){
                if (a.substring(a.length()-1) == b.substring(b.length()-2)) {
                    wildMatch(a.substring(0, a.length() - 2), lena - 1, b, lenb);
                    wildMatch(a.substring(0, a.length() - 2), lena - 1, b.substring(0, b.length() - 2), lenb - 1);
                }
                else if(b.substring(b.length()-1) == "."){
                    wildMatch(a.substring(0, a.length() - 2), lena - 1, b, lenb);
                    wildMatch(a.substring(0, a.length() - 2), lena - 1, b.substring(0, b.length() - 2), lenb - 1);
                }
            }else if (b.substring(b.length()-1) == "."){
                wildMatch(a.substring(0,a.length()-2),lena-1,b.substring(0,b.length()-2),lenb-1);
            }else
                return false;
        }
        else
            return false;

        return null;
    }
    public static void main(String[] args){
        System.out.println(wildMatch("abcd",4,".*",2));
    }
}
