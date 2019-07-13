package cn.com.wenjin.dp;

import java.util.Scanner;

/**
 * @program:AlgorithmByTest
 * @description:他决定研究一下如果他不通过boss们的位置，他可以有多少种走法？
 * @author:wenjin
 * @create:2019-07-13
 **/
public class OfficeRouterSize {
    /**
     * 共有多少种走法。采用dp的方式去求解
     * 1.确定状态。要走到x,y,必须先走到x-1，y以及x y-1
     * 2.确定转移方程
     * F(x)=F[x-1][y]+F[x][y-1]
     * 3.确定边界条件：
     * F[0][y]=1 F[X][0]=1
     * f[n][m]=0
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 获取数据，先判断输入的数据是否与接收的变量的类型匹配
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("x:" + x+y);
        }
    }
    }
   /* public int routerSize(int x,int y,int n){
        int[][] size = new int[x+1][y+1];
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
                if(int i==m&&)
                if(i==0|| j==0){
                    size[i][j] = size[i-1][j]+size[i][j-1];
                }

            }
        }
    }*/


