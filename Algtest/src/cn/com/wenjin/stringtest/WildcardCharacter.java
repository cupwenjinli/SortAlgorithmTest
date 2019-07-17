package cn.com.wenjin.stringtest;

import java.util.Scanner;

/**
 * @program:AlgorithmByTest
 * @description:在Linux Shell命令下通配符'*'表示0个或多个字符, 现编写一段代码实现通配符'*'的功能，注意只需要实现'*', 不用实现其他通配符。
 * @author:wenjin
 * @create:2019-07-15
 **/
public class WildcardCharacter {
    /**
     * 首先得到需要的字符串
     *
     * dp[i][j]表示s到i位置,p到j位置是否匹配!
     *
     * 初始化:
     *
     * dp[0][0]:什么都没有,所以为true
     * 第一行dp[0][j],换句话说,s为空,与p匹配,所以只要p开始为*才为true
     * 第一列dp[i][0],当然全部为False
     * 动态方程:
     *
     * 如果(s[i] == p[j] || p[j] == "?") && dp[i-1][j-1] ,有dp[i][j] = true
     *
     * 如果p[j] == "*" && (dp[i-1][j] = true || dp[i][j-1] = true)有dp[i][j] = true
     *
     * ​	note:
     *
     * ​	dp[i-1][j],表示*代表是空字符,例如ab,ab*
     *
     * ​	dp[i][j-1],表示*代表非空任何字符,例如abcd,ab*
     *
     * 作者：powcai
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/shuang-zhi-zhen-he-dong-tai-gui-hua-by-powcai/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patternStr = sc.nextLine();
        String str = sc.nextLine();

        int plength = patternStr.length();
        int length = str.length();


        int head,tail = 0;
        for(int i=0;i<plength;i++){

        }
    }
}

 interface Jielou{

}
