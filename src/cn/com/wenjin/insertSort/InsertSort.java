package cn.com.wenjin.insertSort;

/**
 * @program:SortAlgorithm
 * @description:插入排序
 * @author:wenjin
 * @create:2019-07-04
 **/
public class InsertSort {

    private int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }

    /**
     * @return
     * @description:升序的插入排序
     * @author:wenjin
     * @Date:2019/7/4
     * @Param
     **/
    public void sortASC() {
        if (array != null && array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i;
                //需要深刻理解下面这个循环
                for (; j > 0 && key < array[j - 1]; j--) {
                    array[j] = array[j - 1];
                }
                array[j] = key;
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
