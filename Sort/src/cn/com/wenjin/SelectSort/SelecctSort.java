package cn.com.wenjin.SelectSort;

/**
 * @program:AlgorithmByTest
 * @description:简单选择排序的实现
 * @author:wenjin
 * @create:2019-07-06
 **/
public class SelecctSort {
    private int[] array;

    public SelecctSort(int[] array) {
        this.array = array;
    }

    public void sortASC() {
        if (array != null && array.length > 1) {

            for (int i = 0; i < array.length; i++) {

                int minIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }

                }
                if (minIndex != i) {
                    int temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;
                }

            }
        }
    }

    public void print() {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ",");
            }
        }

    }
}
