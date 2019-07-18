package cn.com.wenjin.dp;

import java.util.Stack;

public class TowersOfHanoi  {
    //经典的汉诺塔问题，讲n个从小到大的串从第一个挪到最后一个
    private static Stack<Integer> start = new Stack<>();
    //stack是java中自带的LIFO的，即栈
    private static Stack<Integer> buff = new Stack<>();
    private static Stack<Integer> end =new Stack<>();

    public void hanoi(int n){
        //首先在start中存放数,需要注意的是大数在下，小数在上
        for (int i=n;i>0;i--){
            start.push(i);
        }

        move(n,start,buff,end);
    }
    private void move (int n,Stack<Integer> start,Stack<Integer> buff,Stack<Integer> end){
        /**
         * 汉诺塔的思路是：
         * 首先将上面的都放在中间轴，
         * 再将start中的n挪到end轴
         * 之后将buf上的n-1个诺到end轴
         * 当是最后一个的时候，只需要将i从左边移到右边就行
         */
        if(n==1){
            int temp1 = start.pop();
            end.push(temp1);
            System.out.println("Move"+temp1+"From ["+start+"] to ["+end+"]");
        }else {
            move(n-1,start,end,buff);
            int temp =start.pop();
            System.out.println("Move"+temp+"From ["+start+"] to ["+end+"]");
            end.push(temp);
            move(n-1,buff,start,end);
        }

    }

}
