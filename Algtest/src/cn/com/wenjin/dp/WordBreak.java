package cn.com.wenjin.dp;

import java.util.HashSet;

/**
 * @program:AlgorithmByTest
 * @description:
 * @author:wenjin
 * @create:2019-07-16
 **/
public class WordBreak {
    private String str;
    private HashSet<String> dict;

    public WordBreak(String str, HashSet<String> dict) {
        this.str = str;
        this.dict = dict;
    }
    /**
     * For example, given
     *
     * s = leetcode,
     *
     * dict = [leet, code].
     *
     * Return true because leetcode can be segmented as leet code.
     */
    /**
     * soluction:
     * 这是一个DP问题，寻找一个特解
     *
     * 对于o-j各字符来讲，如果0-j是由字典中的一个或者多个组成，j-n是字典中的一个单词，那么dp[n]就是其中的元素结果就是true
     */
    boolean wordBreak(String str, HashSet<String>dict){
        boolean dp[] = new boolean[str.length()+1];
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
        return dp[str.length()];
    }
}
