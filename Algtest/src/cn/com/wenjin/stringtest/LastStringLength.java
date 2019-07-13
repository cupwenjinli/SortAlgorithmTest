package cn.com.wenjin.stringtest;

import java.util.Scanner;

/**
 * @program:AlgorithmByTest
 * @description:获得输入的最后一个字符串长度
 * @author:wenjin
 * @create:2019-07-10
 **/
public class LastStringLength {

    public static void main(String[] args) {
        /**要获得输入的最后一个字符串长度，首先需要判断最后一个元素是不是空格
         * 如何不是空格，可以使用length-lastindexof(" ")来解决
         * 如果最后一个元素是空格，则不能这么做
         *
         *
         */
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        System.out.println(calLastStringLength(next));
    }

    private static int calLastStringLength(String s) {
        if (s.lastIndexOf(" ") == (s.length() - 1)) {
            char[] charsc = s.toCharArray();
            for (int i = charsc.length - 2; i >= 0; i--) {
                if (charsc[i] == ' ') {
                    return s.length() - 2 - i;
                }
            }
            return s.length() - 1;

        } else return s.length() - s.lastIndexOf(" ") - 1;
    }
}
