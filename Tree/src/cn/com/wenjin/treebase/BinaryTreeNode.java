package cn.com.wenjin.treebase;

/**
 * @program:AlgorithmByTest
 * @description:二叉树的节点实现
 * @author:wenjin
 * @create:2019-07-07
 **/
public class BinaryTreeNode {

    private int data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
