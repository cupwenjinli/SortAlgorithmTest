package cn.com.wenjin.biniarySearch;

/**
 * @program:AlgorithmByTest
 * @description:二分查找
 * @author:wenjin
 * @create:2019-07-07
 **/
public class BinarySearch  {
    private int[]array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int searchRecursion(int target){
        if(array ==null){
            return -1;
        }
        return searchRecursion(target,0,array.length-1);
    }
    /**
    *
    *@description:二分查找的递归调用
    *@author:wenjin
    *@Date:2019/7/7
    *@Param
    *@return
    **/
    private int searchRecursion(int target,int begin,int end){
        int mid =(end-begin+1)/2;
        if(target==array[mid]){
            return mid;
        }else if (target>array[mid]){
            return searchRecursion(target,mid+1,end);
        }else {
            return searchRecursion(target,begin,mid-1);
        }

    }
    /**
    *
    *@description:二分查找的非递归调用
    *@author:wenjin
    *@Date:2019/7/7
    *@Param
    *@return
    **/
    public int binarySearch(int target){

        if(array!=null && array.length>0){
            int start=0;
            int end=array.length-1;
            while(start<=end){
                int mid=(start+end+1)/2;
                if(target==array[mid]){
                    return mid;
                }else if(target<array[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            return -1;
        }
        else return -1;
    }
}
