package WildMatch;

/**
 * Created by lang on 2015/8/26.
 */
public class CorrectWildMatch {
    public static   Boolean WildMatch(String a,int lena,String b, int lenb){
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        if (lena < 0 || lenb < 0) return false;
        else if(lena ==0 && lenb == 0) return true;
        else if (arrayB[1] == '*') {
            //if (arrayA[0] == arrayB[0]) return WildMatch(a.substring(1), lena - 1, b.substring(1), lenb - 1);
            if (arrayB[0] == '.' || arrayA[0] == arrayB[0]) return WildMatch(a.substring(1),lena-1,b,lenb)
                    || WildMatch(a.substring(1),lena-1,b.substring(2),lenb-2)||WildMatch(a,lena,b.substring(2),lenb);
        }else if (arrayB[1] != '*')
            if (arrayB[0] == '.' || arrayA[0] == arrayB[0]) return WildMatch(a.substring(1),lena-1,b.substring(1),lenb-1);

        return false;
    }
    public static void main(String[] args){
        WildMatch("abcd",4,".*",2);
    }
}
