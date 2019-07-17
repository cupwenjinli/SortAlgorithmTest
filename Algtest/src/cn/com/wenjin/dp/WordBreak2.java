package cn.com.wenjin.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program:AlgorithmByTest
 * @description:
 * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.
 *
 * Return all such possible sentences.
 *
 * For example, given
 * s = "catsanddog",
 * dict = ["cat", "cats", "and", "sand", "dog"].
 *
 * @author:wenjin
 * @create:2019-07-16
 **/
public class WordBreak2 {

    public List<String> wordBreak(String str, HashSet<String> dict){
        boolean dp[] = new boolean[str.length()+1];
        List<String> res = new ArrayList<String>();
        dp[0]=true;
        //下一步实现对所有dp的初始化
        for(int i=1;i<=str.length();i++){
            dp[i]=false;
        }
        for(int end=1;end<=str.length();end++){
            for(int begin=0;begin<=str.length();begin++){
                //如果划分成的两段在字典中，代表他也是可以划分的
                //subString 含头不含尾
                if(dp[begin]&&dict.contains(str.substring(begin,end)) ){
                    dp[end]=true;
                    break;
                }
            }
        }
        if(dp[str.length()]==true){

            wordBreakRe(str,dict,"",0,res);
        }
        return res;
    }
    private void wordBreakRe(String s, Set<String> set,String path,int start,List<String>res){
       if(start == s.length()){
           res.add(path);
           return;
       }
       if(path.length()==0)path=path+" ";
        for(int i=start;i<s.length();i++){
            String word = s.substring(start,i+1);
            if(set.contains(word)==false){
                continue;
            }
            wordBreakRe(s,set,path+word,i+1,res);
        }
    }
}
