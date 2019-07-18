package cn.com.cupwenjin.matrixGraph;

import static org.junit.Assert.*;

public class MatrixGraphTest {

    @org.junit.Test
    public void addEdge() {
        int[]array = {0,1,2,3};
        MatrixGraph mg = new MatrixGraph(array);
        mg.addEdge(0,1);
        mg.addEdge(0,2);
        mg.addEdge(0,3);
        mg.addEdge(1,2);
        mg.addEdge(3,2);
       /* mg.addEdge(1,8);
        mg.addEdge(2,1);
        mg.addEdge(2,3);
        mg.addEdge(2,8);
        mg.addEdge(3,2);
        mg.addEdge(3,4);
        mg.addEdge(3,6);
        mg.addEdge(3,7);
        mg.addEdge(3,8);
        mg.addEdge(4,3);
        mg.addEdge(4,5);
        mg.addEdge(4,7);
        mg.addEdge(5,0);
        mg.addEdge(5,4);
        mg.addEdge(5,6);
        mg.addEdge(6,1);
        mg.addEdge(6,3);
        mg.addEdge(6,5);
        mg.addEdge(6,7);
        mg.addEdge(7,3);
        mg.addEdge(7,4);
        mg.addEdge(7,6);
        mg.addEdge(8,1);
        mg.addEdge(8,2);
        mg.addEdge(8,3);*/
      mg.breadthFirstSearch();
       // mg.deepFirstSearch();

    }
}