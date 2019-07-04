package cn.com.wenjin.quickSort;

/**
 * @program:SortAlgorithm
 * @description:快速排序的实现
 * @author:wenjin
 * @create:2019-07-04
 **/
public class QuickSort {
    /**
     * 对于快速排序而言，一次排序可以将中间位置的元素放置在合适的位置，然后左边和右边还需要继续进行排序
     */
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    /**
     * @return
     * @description:从小到大的快速排序实现
     * @author:wenjin
     * @Date:2019/7/4
     * @Param
     **/
    public void sortASC() {
        //需要定义三个基准量
        sort(array, 0, array.length - 1);

    }

    public void sort(int[] arr, int begin, int end) {
        //基准值
        if (arr != null && (begin < end)) {
            int key = array[begin];
            //因为在这里begin'end还需要继续使用，所以需要用变量对其进行替换
            int i = begin;
            int j = end;

            while (i < j) {
                //什么时候j--？因为减不是一次，所以在使用的过程中用while，而不是if
                while (arr[j] > key && i < j) {
                    j--;
                }
                //这个时候跳出了while，需要进行交换
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }

                while (arr[i] < key && i < j) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = key;
            sort(arr, begin, i - 1);
            sort(arr, i + 1, end);
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
