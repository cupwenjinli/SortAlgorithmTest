package cn.com.wenjin.array;

/**
 * @program:AlgorithmByTest
 * @description:最大子数组
 * @author:wenjin
 * @create:2019-07-13
 **/
public class MaxSubArray {
    /**
     * 输入一个整形数组（可能有正数和负数），求数组中连续子数组（最少有一个元素）的最大和。要求时间复杂度为O(n)。即将数组遍历一遍
     * 得到结果
     */
    private int[] array;

    public MaxSubArray(int[] array) {
        this.array = array;
    }

    public int searchMaxSubArray(){
        int frameSum = 0;
        int sum=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>0){
                frameSum +=array[i];
            }
            if(array[i]<0||i==array.length-1){

                if(frameSum>sum){
                sum=frameSum;}
                frameSum=0;
            }
        }
        return sum;
    }
}
