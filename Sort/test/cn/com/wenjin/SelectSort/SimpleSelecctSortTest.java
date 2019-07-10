package cn.com.wenjin.SelectSort;

import org.junit.Test;

public class SimpleSelecctSortTest {
     @Test
    public void test(){
         int[] arr = {0, 1, 2, 4, 6, 3, 2, 4, 7, 2, 5, 2, 1, 5, 2, 1, 4, 1, 1};
         SimpleSelecctSort ss = new SimpleSelecctSort(arr);
         ss.sortASC();
         ss.print();
    }


}