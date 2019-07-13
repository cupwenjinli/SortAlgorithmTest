package cn.com.wenjin.sequentialSearch;

/**
 * @program:AlgorithmByTest
 * @description:顺序查找的实现
 * @author:wenjin
 * @create:2019-07-07
 **/
public class SequentialSearch implements Searchbase{
    private int[]array;
    public SequentialSearch(int[] array) {
        this.array=array;
    }

    @Override
    public int search(int key) {
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    /**
    *
    *@description:上面普通的查找方式，需要每一次都对n是否越界进行判断，这一步会极大的消耗时间，
     * 那么如何判断循环是否越界呢？将数组第一个元素设置为key ，然后在循环中i--，这样无论如何，a[0]==key会跳出循环
    *@author:
    *@Date:2019/7/7
    *@Param
    *@return
    **/
    public int sentinelSearch(int key){
        if(array[0]==key){
            return 0;
        }
        int temp=array[0];
        array[0]=key;
        int i=array.length-1;
        while(array[i]==key){
            i--;
        }
        //这种方式对array[0]的元素进行了改变
        array[0]=temp;
        if(i==0){
            return -1;
        }
        return i;

    }

    @Override
    public void print() {

    }
}
