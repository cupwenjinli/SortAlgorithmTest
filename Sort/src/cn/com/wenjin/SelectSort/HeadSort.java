package cn.com.wenjin.SelectSort;

/**
 * @program:AlgorithmByTest
 * @description:堆排序的使用方法
 * @author:wenjin
 * @create:2019-07-10
 **/
public class HeadSort {
    /**
     * 数组实现的二叉堆性质“
     * 性质一：索引为i的做孩子索引是2*i+1
     * 性质二：索引为i的左孩子节点是2*i+2
     * 性质三：索引为i的父节点索引是i-1/2
     *
     * 8
     */
    private int []array;

    public HeadSort(int[] array) {
        this.array = array;
    }
    public void sort(){
        //完成一次建堆操作，可以排除一个元素
        for(int i=0;i<array.length;i++){
            maxHeadify(array,array.length-i);
            int temp =array[0];
            array[0] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

    }
    /**
    *
    *@description:完成一次建堆操作，可以将一个最大值送到根部
    *@author:wenjin
    *@Date:2019/7/10
    *@Param
    *@return
    **/
    private void maxHeadify(int[]array,int length ){
        //为了能够保证子树都是满足父节点》子节点，就需要从后面到前面进行max_headdown排序
        for(int i=length-1;i>=0;i--){
            max_heapdown(array,i,length);

        }
    }

    /**
    *
    *@description:最大堆下调算法//该方法的前提是左右子树都已经满足父节点》子节点
    *@author:wenjin
    *@Date:2019/7/10
    *@Param array--待排序的数组
     *      begin--待排序的起始下标
     *      end--待排序的结束下标
    *@return
    **/
    private void max_heapdown(int[]array,int begin,int end){
        int currentNode = begin;
        int leftNode = begin*2+1;
        int rightNode = begin*2+2;
        int max = begin;
        if(leftNode<end && array[leftNode]>array[max]){
            max=leftNode;

        }
        if(rightNode< end &&array[rightNode]>array[max]){
            max = rightNode;
        }
        if(max != begin){
            int temp = array[begin];
            array[begin] = array[max];
            array[max] =temp;
            //因为将小的节点挪到子节点去了，所以子树中有可能会出现乱序，这时需要继续在子树中进行该项操作
            max_heapdown(array,max,end);
        }


    }
}
