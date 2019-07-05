package cn.com.wenjin.quickSort;

import org.junit.Test;


public class QuickSortTest {
    @Test
    public void test(){
        int[] arr = {0, 1, 2, 4, 6, 3, 2, 4, 7, 2, 5, 2, 1, 5, 2, 1, 4, 1, 1};
        QuickSort qs = new QuickSort(arr);
        qs.sortASC();
        qs.print();
    }

}