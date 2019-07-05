package cn.com.wenjin.bubbleSort;

import org.junit.Test;

public class OptimizationSortBubble1Test {
   @Test
    public void test(){
        int[] arr = {0, 1, 2, 4, 6, 3, 2, 4, 7, 2, 5, 2, 1, 5, 2, 1, 4, 1, 1};
        OptimizationSortBubble1 osb = new OptimizationSortBubble1(arr);

        osb.sortASC();
        osb.print();
    }
}