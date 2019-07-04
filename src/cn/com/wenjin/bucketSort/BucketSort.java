package cn.com.wenjin.bucketSort;


/**
 * @program:SortAlgorithm
 * @description:该算法实现了桶排序
 * @author:wenjin
 * @create:2019-07-04
 **/
public class BucketSort {
    /**
     * 什么是桶排序，桶排序又叫箱排序，简单的理解就是将数组的值作为另外一个数组的下标去进行元素的存放
     * 但是在实际的使用中，一个桶内并不是只有一个元素，很有可能是一个链表或者是其他，这样的话就相当于一个散列表了
     */
    private int[]array;
    private int[]bucket;

    public BucketSort(int[] array, int range) {
        this.array = array;
        this.bucket = new int [range];
    }
    //桶排序就是循环遍历数组，将数组的值作为Bucket数组的下标
    public void sort(){

        //为了代码的健壮性需要排序的数组进行判断，一个是数组中不能为null，数组的长度必须大于1，等于1没法排序
        if(array !=null && array.length>1){
            for(int i=0;i<array.length;i++){
                bucket[array[i]]++;//即bucket的值是几，就代表这个桶内有多少各个元素
            }
        }
    }
    /**
    *
    *@description:升序排序
    *@author:wenjin
    *@Date:2019/7/4
    *@Param
    *@return
    **/
    public void printASC(){
        for(int i=0;i<bucket.length;i++){
            //bucket的值为几，就输出几遍
            for (int j=0;i<bucket[i];j++){
                System.out.print(i);
            }
        }
    }
    /**
    *
    *@description:降序排序DESC
    *@author:wenjin
    *@Date:2019/7/4
    *@Param
    *@return
    **/
    public void printDESC(){
        for(int i=bucket.length-1;i>=0;i--){
            for(int j=0;j<bucket[i];j++){
                System.out.print(i);
            }
        }
    }
}
