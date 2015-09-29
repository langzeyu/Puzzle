package GrayCode;

/**
 * Created by lang on 2015/9/29.
 */
public class GrayCode {
    public static String[] grayCode(int n){
        String[] newGrayCode = new String[(int)Math.pow(2,n)];
        if (n == 1) {
            newGrayCode[0] = new String("0");
            newGrayCode[1] = new String("1");
            return newGrayCode;
        }
        String[] gCode = grayCode(n-1);
        for (int i = 0,j = 0; i < (int)Math.pow(2,n-1); i++){
            newGrayCode[j++] = gCode[i] + "0";
            newGrayCode[j++] = gCode[i] + "1";
            i++;
            newGrayCode[j++] = gCode[i] + "1";
            newGrayCode[j++] = gCode[i] + "0";
        }
        return newGrayCode;
    }
    public static void main(String[] args){
        String[] code = grayCode(3);
        for (String c : code){
            System.out.println(c);
        }

    }
}
