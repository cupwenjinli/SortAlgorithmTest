package cn.com.wenjin.binaryTree;

import cn.com.wenjin.treebase.BinaryTreeNode;

/**
 * @program:AlgorithmByTest
 * @description:二叉树的建立
 * @author:wenjin
 * @create:2019-07-07
 **/
public class BinaryTree {

    //二叉树的创建就是简单地声明一个根节点,同时提供他的get和set方法
    private BinaryTreeNode root;

    public BinaryTree() {

    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    /**
     * @return
     * @description:二叉树子树的清空，将该节点置为null,并且递归调用
     * @author:wenjin
     * @Date:2019/7/7
     * @Param
     **/
    public void clear(BinaryTreeNode node) {
        if (node != null) {
            clear(node.getLeftChild());
            clear(node.getRightChild());
            node = null;
        }

    }

    /**
     * @return
     * @description:整个二叉树的清空
     * @author:wenjin
     * @Date:2019/7/7
     * @Param
     **/
    public void clear() {
        clear(root);
    }

    /**
     * @return
     * @description:获取整棵树的高度
     * @author:wenjin
     * @Date:2019/7/7
     * @Param
     **/
    public int height() {
        if (root == null) {
            return -1;
        }
        return height(root);
    }

    /**
     * @return
     * @description:获取子树的高度,采用递归的方式进行
     * @author:wenjin
     * @Date:2019/7/7
     * @Param
     **/
    public int height(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int l = height(node.getLeftChild());
            int r = height(node.getRightChild());
            return l < r ? r + 1 : l + 1;
        }
    }
    /**
    *
    *@description:获取二叉树某一个子树的节点数
    *@author:wenjin
    *@Date:2019/7/7
    *@Param
    *@return
    **/
    public int size(BinaryTreeNode node){
        if (node ==null){
            return 0;
        }else{
            int l=size(node.getLeftChild());
            int r=size(node.getRightChild());
            return l+r;
        }
    }
    /**
    *
    *@description:某一个节点的父节点
    *@author:wenjin
    *@Date:2019/7/7
    *@Param
    *@return
    **/
    public BinaryTreeNode getParentNode(BinaryTreeNode node){
        return (root==null||node==root)?null:getParentNode(root,node);

    }
    /**
    *
    *@description:在node节点之前进行查找
    *@author:wenjin
    *@Date:2019/7/7
    *@Param
    *@return
    **/
    private BinaryTreeNode getParentNode(BinaryTreeNode subTree,BinaryTreeNode node){
        if(subTree==null){
            return null;
        }
        if(subTree.getLeftChild()==node||subTree.getRightChild()==node){
            return subTree;
        }
        BinaryTreeNode parent;
        if((parent=getParentNode(subTree.getLeftChild(),node) )!=null){
            return parent;

        }else{
            return getParentNode(subTree.getRightChild(),node);
        }
    }
    /**
    *
    *@description:二叉树的左插入
    *@author:wenjin
    *@Date:2019/7/7
    *@Param
    *@return
    **/
    public void insertLeftTreeNode(BinaryTreeNode node,BinaryTreeNode parent){
        parent.setLeftChild(node);
    }
     /**
     *
     *@description:二叉树右插入
     *@author:wenjin
     *@Date:2019/7/7
     *@Param
     *@return
     **/
    public void insertRightTreeNode(BinaryTreeNode node,BinaryTreeNode parent){
        parent.setRightChild(node);
    }
    /**
    *
    *@description:先根遍历，先访问根节点，再访问左节点，再访问右节点
    *@author:wenjin
    *@Date:2019/7/7
    *@Param
    *@return
    **/
    public void preOrder(BinaryTreeNode node){
        if(node!=null){
            System.out.print(node.getData());
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());

        }
    }
}
