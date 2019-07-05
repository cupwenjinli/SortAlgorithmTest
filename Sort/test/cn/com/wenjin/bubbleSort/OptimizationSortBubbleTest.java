package cn.com.wenjin.bubbleSort;

import org.junit.Test;

public class OptimizationSortBubbleTest {
    @Test
    public void test(){
        int[] arr = {0, 1, 2, 4, 6, 3, 2, 4, 7, 2, 5, 2, 1, 5, 2, 1, 4, 1, 1};
        OptimizationSortBubble osb = new OptimizationSortBubble(arr);

        osb.sortASC();
        osb.print();
    }

}