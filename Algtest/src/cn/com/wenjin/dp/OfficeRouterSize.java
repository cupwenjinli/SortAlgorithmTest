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
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        int x = Integer.parseInt(str1[0]);
        int y = Integer.parseInt(str1[1]);
        int length = Integer.parseInt(str1[2]);

        int[][] arr =new int[x+1][x+1];
        int k=0;
        while(k<length&&sc.hasNextLine()){
           String[] str2 = sc.nextLine().split(" ");
            arr[Integer.parseInt(str2[0])][Integer.parseInt(str2[1])] =-1;
            k++;
        }
        int sum = routerSize(x,y,arr);
        System.out.println(sum);
    }

    public static int routerSize(int x,int y,int arr[][]){
        /**
         * 在这个问题中，就边界条件，仍然需要考虑两个问题，一个是如果boss坐在门口，即0,0处，这时所有路线均为0；
         * 如果boss坐在x,0或者是y,0上，前x或者y是等于1，后面就等于0.这是第二个需要考虑的问题
         *
         */
        int[][] size = new int[x+1][y+1];
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){

                if(i==0|| j==0){
                    size[i][j]=1;

                }else{
                    size[i][j] = size[i-1][j]+size[i][j-1];
                }
                if(arr[i][j]==-1){
                    size[i][j]=0;
                }


            }
        }
        return size[x][y];
    }}


