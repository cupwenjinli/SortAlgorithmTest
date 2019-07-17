package cn.com.wenjin.dp;

/**
 * @program:AlgorithmByTest
 * @description:丑数的计算方案
 * @author:wenjin
 * @create:2019-07-17
 **/
public class UglyNumber {
    /**
     * 设计一个算法，找出只含素因子3，5，7 的第 k 大的数。
     *
     * 符合条件的数如：1,3，5，7，9，15......
     */

    /**
     * 解决方案里面需要找到递推的解决办法：
     * 1.第一轮会从ugly[0]*3,ugly[0]*5,ugly[0]*7里面挑选最小的
     * 2.
     */
    public long kthPrimeNumber(int k){
        long [] dp = new long[k+1];
        int indexFor3=0,indexFor5=0,indexFor7 = 0;
        dp[0] = 1;
        for(int i=1;i<=k;i++){
            dp[i] =Math.min(Math.min(dp[indexFor3]*3,dp[indexFor5]*5),dp[indexFor7]*7);
            //会出现以下问题：当5*3和3*5的结果是一样的时候，两者都需要++,所以不能用if-else，而是只能用if
            if(dp[i]==dp[indexFor3]*3){
                indexFor3++;
            }
            if(dp[i]==dp[indexFor5]*5){
                indexFor5++;
            }
            if(dp[i]==dp[indexFor3]*7){
                indexFor7++;
            }
        }
        return dp[k];
    }
}
