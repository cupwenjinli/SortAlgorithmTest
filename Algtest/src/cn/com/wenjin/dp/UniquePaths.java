package cn.com.wenjin.dp;

/**
 * @program:AlgorithmByTest
 * @description:机器人路径综合方案
 * @author:wenjin
 * @create:2019-07-11
 **/
public class UniquePaths {
    public int uniquePaths(int m,int n){
        /**
         * 状态方程f[m-1]f[n-1]=f[m][n-1]+f[m-1][n];
         * 初始条件：f[0][0]=1
         * 边界条件
         */
        int [][] array = new int[m][n];

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(m==0||n==0){
                    array[m][n] = 1;
                }else {
                    array[m][n]=array[m-1][n]+array[m][n-1];
                }

            }
        }
        return array[m-1][n-1];
    }
}
