package cn.com.wenjin.stringtest;

/**
 * @program:AlgorithmByTest
 * @description:是否实现匹配问题
 * @author:wenjin
 * @create:2019-07-15
 **/
public class isMatch {
    /**
     * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
     * '?' 可以匹配任何单个字符。
     * '*' 可以匹配任意字符串（包括空字符串）。
     *
     * 该题的解法中：对于dp的使用如下，如果没有通配符或者是通配符采用？来替代的话，可以采用：
     * dp[i][j]=dp[i-1][j-1]来进行计算
     * 如果出现通配符为*即通配多个字符时，会出现如下情况：
     * 第j个位为*dp[i][j]= dp[i-1][j]
     * dp[i][j]=dp[i][j-1] =true
     *
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s,String p){
        //首先将多个*改为一个*即：
        p.replaceAll("\\*+","*");
        if(s.equals("")){
            return p.equals("*")||p.equals("");
        }else if(p.equals("")){
            return false;
        }

        int s_length = s.length(),p_length = p.length();
        boolean dp[][] = new boolean[s_length+1][p_length+1];

        dp[0][0] = true;
        if(p.charAt(0)=='?'){
            dp[0][1] =true;
        }
        for(int i=1;i<=s_length;i++){
            for(int j=1;j<=p_length;j++){
                if(p.charAt(j-1)==s.charAt(j-1)||p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'&&(dp[i-1][j])||dp[i][j-1]){
                    dp[i][j]=true;
                }
            }
        }
        return dp[s_length][p_length];

    }
}
