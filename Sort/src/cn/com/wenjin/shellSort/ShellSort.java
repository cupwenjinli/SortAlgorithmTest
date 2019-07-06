package cn.com.wenjin.shellSort;

/**
 * @program:AlgorithmByTest
 * @description:希尔排序
 * @author:wenjin
 * @create:2019-07-06
 **/
public class ShellSort {
    int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }

    public void sortASC() {
       for (int k=array.length/2;k>0;k/=2){
           //在进行这个思考的时候，不能割裂的去进行判断，需要联系起来思考，每一次的交换，是跨域了步数
           for(int i=k;i<array.length;i++){
               int temp =array[i];
               int j=k;
               for(;j>=k&&array[j-k]>temp;j-=k){
                   array[j]=array[j-k];

               }
               array[j]=temp;

           }
       }
    }
}
