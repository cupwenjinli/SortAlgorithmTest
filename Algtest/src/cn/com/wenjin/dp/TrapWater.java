package cn.com.wenjin.dp;

/**
 * @program:AlgorithmByTest
 * @description:You are given an array of n non-negative integers. Each value means the height of a histogram. Suppose you are pouring water onto them, what is the maximum water it can hold between a left bar and a right bar (no seperation)?
 * @author:wenjin
 * @create:2019-07-17
 **/
public class TrapWater {
    /**
     * You are given an array of n non-negative integers. Each value means the height of a histogram.
     * Suppose you are pouring water onto them, what is the maximum water it can hold between a left bar and a right bar (no seperation)?
     */
    /**
     * 对于每一个点的积水量来说，等于该点左边。右边最高点中较小的那个值减去该点的高度
     * dp[]中用来存左边最高的点
     *
     */
    public int maxWater(int[]arr){
        int[]dp=new int[arr.length];
        int leftmax=0,rightmax=0;
        int tripWater=0;

        for (int i=0;i<arr.length;i++){
            dp[i] =leftmax;
            if(arr[i]>leftmax){
                leftmax=arr[i];
            }
        }
        //经过上面的循环，dp[i]中已经存放了每个i左边最大的数
        //接下来是从右边进行，找出右边最大的数，顺便计算出存的water值
        for (int i =arr.length-1;i>=0;i--){
           if(Math.min(dp[i],rightmax)>arr[i]){
               tripWater += Math.min(dp[i],rightmax)-arr[i];
           }

            if(arr[i]>rightmax){
                rightmax = arr[i];
            }
        }
        return tripWater;

    }

}
