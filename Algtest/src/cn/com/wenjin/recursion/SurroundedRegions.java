package cn.com.wenjin.recursion;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: SortAlgorithmTest
 * @description:
 * @author: wenjin
 * @create: 2019-07-19 10:10
 */
public class SurroundedRegions {
    /**
     * 给出如下的图形：
     * * * * *
     * * o o *
     * * * o *
     * * o * *
     * 得到如下的图形
     * * * * *
     * * * * *
     * * * * *
     * * o * *
     * <p>
     * 该题的思路如下：
     * 需要从四条边的O元素开始进行BFS，凡是能够遍历到的就将o变为Y。
     * 扫描整个数组，将现存的O元素置为*，将Y元素置为0
     */
    public void solve(char[][] board) {
        //首先判断是否是空或者leng=0；
        if (board == null || board.length == 0 || board[0].length == 0) return;

        int rows = board.length;
        int columns = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == columns - 1) {
                    bfs(board, i, j);
                }
            }
        }
        //对数组进行遍历，将O都改为* 将y都改为o
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j]=(board[i][j]=='Y')?'o':'*';
            }}
    }

    private void bfs(char[][] board, int row, int column) {
        /**
         *@Description: 对边上的进行bfs
         *@Param: [board, rows, column]
         *@return: void
         *@Author: wen jin
         *@date: 2019/7/19
         */
        if (board[row][column] != 'o') return;
        //得到为o的边上的值，之后进行广度优先遍历
        int rows = board.length;
        int columns = board[0].length;
        Queue<Integer> queue = new LinkedList<>();
        //这里说明一下offer与add区别。超出界限后offer会返回false add会跑出异常
        queue.offer(row);
        queue.offer(column);
        while (!queue.isEmpty()) {
            int i = queue.poll();
            int j = queue.poll();
            //因为在下面添加了四周的元素，四周的元素有可能会超界限，所以需要在这里增加一个
            //判断，去实现超界限之后的操作
            if (i < 0 || i > rows - 1 || j < 0 || j > columns - 1) continue;
            if (board[i][j] != 'o') continue;
            //这时得到的是o所在坐标，首先将其变为y
            board[i][j] = 'Y';
            //这时需要将该坐标点四周的元素都加入其中
            queue.offer(i - 1);
            queue.offer(j);
            queue.offer(i);
            queue.offer(j + 1);
            queue.offer(i + 1);
            queue.offer(j);
            queue.offer(i);
            queue.offer(j - 1);

        }

    }
}