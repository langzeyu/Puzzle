package IncreasingWord;

/**
 * Created by lang on 2015/8/14.
 * java版 答案  运行速度果然很快啊
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Ordered {

    private static boolean isOrderedWord(String word){
        char[] sortedWord = word.toCharArray();
        Arrays.sort(sortedWord);
        return word.equals(new String(sortedWord));
    }

    public static void main(String[] args) throws IOException{
        long startTime = System.currentTimeMillis();//获取当前时间
        List<String> orderedWords = new LinkedList<String>();
        File file = new File("C:\\Users\\lang\\Desktop\\Dictionary.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        while(in.ready()){
            String word = in.readLine();
            if(isOrderedWord(word)) orderedWords.add(word);
        }
        in.close();

        Collections.<String>sort(orderedWords, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return new Integer(o2.length()).compareTo(o1.length());
            }
        });

        int maxLen = orderedWords.get(0).length();
        for(String word: orderedWords){
            if(word.length() == maxLen){
                System.out.println(word);
            }else{
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time :"+(endTime-startTime));
    }
}