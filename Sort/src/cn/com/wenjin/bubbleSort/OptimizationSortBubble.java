package cn.com.wenjin.bubbleSort;

/**
 * @program:SortAlgorithm
 * @description:优化的冒泡排序
 * @author:wenjin
 * @create:2019-07-04
 **/
public class OptimizationSortBubble {
    /**
     * 对于传统的冒泡排序进行如下优化：
     * 在一次遍历中没有出现交换，则从没有交换的位置开始，之后的都是按照顺序来进行的；
     * 这时就不需要一次只前进一步
     * 在交换的时候增加一个标志位
     * <p>
     * 优化如下：
     * 1.每一次交换记录最后一个交换的位置，下一次内部的循环到该位置即可
     * 2.对于外循环来讲，每一次只能减1，所以没有交换的话就用一个标志位对
     */
    private int[] array;

    public OptimizationSortBubble(int[] array) {
        this.array = array;
    }

    public void sortASC() {
        if (array != null && array.length > 1) {
            //最外层的循环还是需要按照最大情况来进行循环，只不过可以加一个标志位，如果没有交换就为true ，跳出循环
            int k,temp;
            int flag = array.length - 1;
            for (int i = 1; i < array.length; i++) {
                k=flag;
                flag=0;
                for (int j = 0; j < k; j++) {
                    if (array[j] > array[j + 1]) {
                        //jiaohuan
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        flag = j;

                    }
                }

                if (flag==0) {
                    break;
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
