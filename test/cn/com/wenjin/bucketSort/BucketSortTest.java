package cn.com.wenjin.bucketSort;

import org.junit.Test;


public class BucketSortTest {

    @Test
    public void testSort() {
        int[] arr = {0, 1, 2, 4, 6, 3, 2, 4, 7, 2, 5, 2, 1, 5, 2, 1, 4, 1, 1};

        BucketSort bs = new BucketSort(arr, 11);
        bs.sort();
        bs.printASC();
        System.out.println("------------------------------");
        bs.printDESC();
    }

}