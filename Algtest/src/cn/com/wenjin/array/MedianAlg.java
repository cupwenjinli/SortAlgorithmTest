package cn.com.wenjin.array;

/**
 * @program:AlgorithmByTest
 * @description:\计算两个有序数组的中位数
 * @author:wenjin
 * @create:2019-07-11
 **/
public class MedianAlg {
    /**
     * 计算两个有序数组的中位数，要求时间复杂度为log
     * 思路：
     * 采用递归的方式进行计算，计算的方法为：A数组中的中位数 B数组的中位数，然后在剩下的范围里进行递归
     */
    private int[]array1;
    private int[]array2;

    public MedianAlg(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public double searchMedian(){
        return search(array1,array2);
    }
    private double search(int[] num1,int[]num2){
       int length1 = num1.length;
       int length2 = num2.length;

       //首先处理任何一个数组为空的情况
        if(length1==0){
            if(length2%2==0){
                return (num2[length2/2]+num2[length2/2-1])/2.0;
            }
            return num2[length2/2]*1.0;
        }
        if(length2 ==0){
            if(length1%2==0){
                return (num1[length1/2]+num1[length1/-1])/2.0;
            }
            return num1[length1/2]*1.0;
        }

        int sum=length1+length2;
        //偶数，寻找中间两个数
        if(sum%2 == 0){

        }else {

        }
        return 0.0 ;
    }

}
