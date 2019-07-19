package cn.com.cupwenjin.matrixGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 图的邻接矩阵实现
 */
public class MatrixGraph {
    //邻接矩阵下标对应的值
    private int[] mapping;
    private int[][] matrix;
    //用来判断节点有没有被遍历过
    private boolean[] visited;
    private int vexnum;


    public MatrixGraph(int[] array) {
        //mapping = new int[array.length];
        matrix = new int[array.length][array.length];
        visited = new boolean[array.length];
        vexnum = array.length;
        this.mapping = array;

    }

    public void addEdge(int start, int end) {
        /**
         *@Description:添加节点的过程如下，先找到要添加节点的下标，利用下标对邻接矩阵进行赋值1.
         * 其中需要注意的点有两点：
         * 如果找到了，没有必要继续进行循环，所以在for循环中增加了一步，减少徒劳的for循环
         * 另外需要注意的是异常的处理。如果没有找到相应的节点，这时需要跑出异常或者进行其他报警
         *@Param: [start, end]
         *@return: void
         *@Author: wenjin
         *@date: 2019/7/18
         */
        int x = -1, y = -1;
        for (int i = 0; i < mapping.length; i++) {

            if (x != -1 && y != -1) {
                break;

            }
            if (mapping[i] == start) {
                x = i;


            }
            if (mapping[i] == end) {
               y = i;
            }
        }
        if (x == -1 || y == -1) {
            throw new RuntimeException("您输入的节点不存在");
        }
        matrix[x][y] = 1;
    }

    public void printGraph() {
        /**
         *@Description:
         *@Param: []
         *@return: void
         *@Author: wenjin
         *@date: 2019/7/18
         */
        for (int i = 0; i < mapping.length; i++) {
            for (int j = 0; j < mapping.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void deepFirstSearch() {
        /**
        *@Description:
         * 邻接矩阵深度优先遍历的递归实现：
         * 1.先定义一个数组用来记录哪些节点被访问过了
         * 2.访问初始点，并将其标记为已访问
         * 3.查找相邻的邻接点是否联通，同时是否被访问过
         * 4如果没有访问过，继续进行第2步
        *@Param: []
        *@return: void
        *@Author: wenjin
        *@date: 2019/7/18
        */

        //对所有节点进行遍历
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        //从没有开始遍历过的节点开始进行遍历操作
        for (int i = 0; i < vexnum; i++) {
                if(visited[i]==false){
                    traverse(i);
                }
        }
    }
    private void traverse(int i){
        //首先将遍历过的节点置为true
        visited[i] = true;
        System.out.println("目前已经经过点"+mapping[i]);
        for(int j=0;j<vexnum;j++){
            if(matrix[i][j]==1 && visited[i]==false){
                traverse(j);
            }
        }
    }
    public void breadthFirstSearch(){
        /**
        *@Description: 广度优先算法
         * /广度优算法与深度优先的区别在与：
         * 深度是在循环中进行递归，这样的话就是一层一层更加深入，广度优先算法与层序遍历类似，一层一层
         * 进行，在每一层中间增加一个队列，用队列存储并输出可以实现先进先出
         *
        *@Param: []
        *@return: void
        *@Author: wenjin
        *@date: 2019/7/18
        */
        //对所有节点进行遍历
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        for (int i=0;i<vexnum;i++){

            if(visited[i]==false){
                visited[i] =true;
                System.out.println("目前已经经过点"+mapping[i]);
                queue.add(i);
                while (!queue.isEmpty()){
                    queue.poll();
                    for(int j=0;j<vexnum;j++){
                        if(matrix[i][j]==1 && visited[j] ==false){
                            visited[j]=true;
                            System.out.println("目前已经经过点"+mapping[j]);
                            queue.add(j);
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}
