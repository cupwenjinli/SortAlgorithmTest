package cn.com.wenjin.array;

import org.junit.Test;

public class MaxSubArrayTest {
    @Test
    public void test(){
       int[]array={1,2,3,4,-2,9,-4,-1,27} ;
       MaxSubArray maxSubArray=new MaxSubArray(array);
       int sum = maxSubArray.searchMaxSubArray();
        System.out.println(sum);
    }

}