package cn.com.wenjin.treebase;

import java.util.LinkedList;

/**
 * @program:AlgorithmByTest
 * @description:树节点的描述
 * @author:wenjin
 * @create:2019-07-07
 **/
public class Node {
    private int data;
    private int parent;
    private LinkedList<Integer> children;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public LinkedList<Integer> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<Integer> children) {
        this.children = children;
    }
}
