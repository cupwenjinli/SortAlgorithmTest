package cn.com.wenjin.insertSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {
    @Test
    public void test(){
        int[] arr = {0, 1, 2, 4, 6, 3, 2, 4, 7, 2, 5, 2, 1, 5, 2, 1, 4, 1, 1};
        InsertSort insertSort = new InsertSort(arr);
        insertSort.sortASC();
        insertSort.print();
    }


}