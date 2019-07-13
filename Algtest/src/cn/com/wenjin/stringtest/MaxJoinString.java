package cn.com.wenjin.stringtest;

import java.util.*;

/**
 * @program:AlgorithmByTest
 * @description:最大拼接长度 例子：2
 * 11
 * 2
 * result:
 * 211
 * @author:wenjin
 * @create:2019-07-10
 **/
public class MaxJoinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] asStrs = new String[length];
        for (int i = 0; i < length; i++) {
            asStrs[i] = sc.next();
        }
        Arrays.sort(asStrs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String ab = o1 + o2;
                String ba = o2 + o2;
                return ba.compareTo(ab);
            }
        });
        //之后还需要对0进行处理，如果最大值为0怎么办，比如n=2 连续两个0 输出会为00 这时不对
        if (asStrs[0].equals("0")) {
            System.out.print("0");
        } else {
//        List<String> list = new ArrayList<String>();
//       for (int i=0;i<length;i++){
//           list.add(sc.next());
//
//       }
//       //对拿到的list进行冒泡排序
//        for(int i=0;i<length;i++){
//            for(int j=0;j<length-i-1;j++){
//                String tempj=list.get(j);
//                String tempj2=list.get(j+1);
//                String temp ="";
//                int length2 = tempj.length()<tempj2.length()?tempj.length():tempj2.length();
//                for(int k=0;k<length2;k++ ){
//                    if(list.get(j).charAt(k)<list.get(j+1).charAt(k)){
//                    //交换
//                        temp=list.get(j);
//                        list.set(j,list.get(j+1));
//                        list.set(j+1,temp);
//                        break;
//                }else if(list.get(j).charAt(k)<list.get(j+1).charAt(k)){
//                        break;
//                    }
//                    if (k==(length2-1)){
//
//                    }
//                }
//            }
//        }
            //list已经按照最大到最小拍好位置了
            System.out.println("最大的数为：");
            for (int i = 0; i < length; i++) {
                System.out.print(asStrs[i]);
            }

        }

    }
}
