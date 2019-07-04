package cn.com.wenjin.bubbleSort;

import java.sql.SQLOutput;

/**
 * @program:SortAlgorithm
 * @description:冒泡排序的过程
 * @author:wenjin
 * @create:2019-07-04
 **/
public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    /**
     * @return
     * @description:冒泡排序的升序排序：两层循环，一层是为了对最大范围进行判断，里面一层是为了进行遍历交换
     * @author:wenjin
     * @Date:2019/7/4
     * @Param
     **/
    public void sortASC() {
        //为了增加代码健壮性，一定要在这里进行判断
        if (array.length > 1) {
            int temp;
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length - i; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

    }

    public void sortDESC() {
        if (array.length > 1) {
            int temp;
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length - i; j++) {
                    if (array[j] < array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

    }
    public void print(){
        if(array !=null &&array.length>0){
            for (int i=0;i<array.length;i++){
                System.out.print(array[i]+",");
            }
        }

    }
}
