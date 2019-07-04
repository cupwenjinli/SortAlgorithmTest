package cn.com.cupwenjin.bubbleSort;

/**
 * @program:SortAlgorithm
 * @description:利用标志位对冒泡排序进行优化
 * @author:wenjin
 * @create:2019-07-04
 **/
public class OptimizationSortBubble1 {
    private int[] array;

    public OptimizationSortBubble1(int[] array) {
        this.array = array;
    }
    public void sortASC(){
        int flag,temp;
        for (int i=1;i<array.length;i++){
            flag =1;
            for (int j=0;j<array.length-i;j++){
                if (array[j] > array[j + 1]) {
                    //jiaohuan
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 0;
                }
            }
            if (flag==1){
                break;
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
