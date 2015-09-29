package IncreasingWord;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by lang on 2015/8/14.
 * 自己用递归方式写的
 */
public class increase {
    public static boolean isIncrease(String term){
        if (term.length() == 1)
            return true;
        else if (term.length() >= 2){
            if(term.charAt(0) <= term.charAt(1))
                return isIncrease(term.substring(1));
            if(term.charAt(0) > term.charAt(1))
                return false;
        }
        return false;
    }
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();//获取当前时间
        File file = new File("C:\\Users\\lang\\Desktop\\Dictionary.txt");
        ArrayList<String> Dic = new ArrayList<String>();
        ArrayList<String> maxTerm = new ArrayList<String>();
        maxTerm.add("");
        try {
            String term = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file) );
            while ((term = bufferedReader.readLine())!=null){
                Dic.add(term);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }


        for (String term : Dic){
            if (term.length() < maxTerm.iterator().next().length())
                continue;
            Boolean flag = isIncrease(term);
            if (flag == true){
                if(maxTerm.iterator().next().length() < term.length()){
                    maxTerm.clear();
                    maxTerm.add(term);
                }
                else if(maxTerm.get(0).length() == term.length()){
                    maxTerm.add(term);
                }
            }
        }
        for (String max : maxTerm){
            System.out.println(max);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time :"+(endTime-startTime));
    }
}
