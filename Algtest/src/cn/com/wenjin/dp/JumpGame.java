package cn.com.wenjin.dp;

/**
 * @program:AlgorithmByTest
 * @description:存在型动态规划问题
 * @author:wenjin
 * @create:2019-07-11
 **/
public class JumpGame {
/**
 * 存在性动态规划问题：
 * 第一步：确定状态：如果青蛙能跳到最后一块石头n-1，我们考虑它跳的最后一步
 * 这一步是从石头i调过来的，
 * 这时需要满足两个条件：
 * 1.青蛙可以跳到石头i
 * 2.最后一步的跳跃距离要小于ai
 *
 * 第二步：确定问题：
 * 青蛙能不能跳到石头i
 * 确定状态方程：f[j]表示能不能跳到石头j
 * f[j]= OR(枚举0-i之间的所有情况)（f[i]&&(i+a[i}>=j)
 *
 * 第三部：边界条件：
 * F[0]=0;
 *
 */


}
