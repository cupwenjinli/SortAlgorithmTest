package cn.com.wenjin.dp;

/**
 * @program:AlgorithmByTest
 * @description:最少拼出硬币的个数
 * @author:wenjin
 * @create:2019-07-11
 **/
public class CoinChange {
    /**
     * 对于该题来说，子问题是最少的硬币能拼出27-ak f[x]=x用多少枚硬币评出x
     * 列出转移方程
     * fx=min{f[x-7]+1,f[x-5]+1,f[x-2]+1}
     * 找出边界条件
     * f[0]=0
     * f[1]=max_value
     */
    private int[] coin;

    public CoinChange(int[] coin) {
        this.coin = coin;
    }

    public int coinChange(int m) {
        int[] f = new int[m + 1];
        int n = coin.length;
        f[0] = 0;
        //这里用++i的原因是排除了f[1]直接从f[2]开始
        for (int i = 1; i <= m; ++i) {
            f[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; ++j) {
                if (i - coin[j] >= 0 && f[i - coin[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - coin[j]]+1,f[i]);
                }
            }
        }
        if(f[m]==Integer.MAX_VALUE){
            return -1;
        }else return f[m];
    }
}
























































