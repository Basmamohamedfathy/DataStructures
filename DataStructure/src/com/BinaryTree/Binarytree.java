package com.BinaryTree;

public class Binarytree<T extends Comparable<T>> {
    BSTNode root;

    public Binarytree(T root) {

        BSTNode newNode = new BSTNode(root);
        this.root = newNode;
    }

    public void addNode(T value, BSTNode editroot) {
        BSTNode newNode = new BSTNode(value);

        if (((T) newNode.value).compareTo((T) editroot.value) >= 0) {
            if (editroot.right == null) {
                editroot.right = newNode;
            } else {
                addNode(value, editroot.right);
            }
        }
        if (((T) newNode.value).compareTo((T) editroot.value) < 0) {
            if (editroot.left == null) {
                editroot.left = newNode;
            } else {
                addNode(value, editroot.left);
            }

        }


    }

    public void preOrder(BSTNode editroot) {
        if (editroot == null) return;
        System.out.print(editroot.value + "  ");
        preOrder(editroot.left);
        preOrder(editroot.right);


    }

    public void inOrder(BSTNode editroot) {
        if (editroot == null) return;
        inOrder(editroot.left);
        System.out.print(editroot.value + "  ");
        inOrder(editroot.right);


    }

    public void postOrder(BSTNode editroot) {
        if (editroot == null) return;

        postOrder(editroot.left);
        postOrder(editroot.right);
        System.out.print(editroot.value + "  ");


    }

    public void search(T value, BSTNode editroot) {
        if (editroot == null) {
            System.out.println("The value is not exist");
          return ;
        } else {
            if (editroot.value == value) {
                System.out.println("The value is exist");
                return;

            }
            if ((value).compareTo((T) editroot.value) > 0) {
                search(value, editroot.right);
            }
            if ((value).compareTo((T) editroot.value) < 0) {
                search(value, editroot.left);
            }

        }
    }

    public void delete(T data){
         delete(root, data);
    }

    private BSTNode delete(BSTNode root, T data){
        if(root ==null){
            return root;
        }
        else if(((T)root.value).compareTo(data)>0){
            root.left = delete(root.left, data);
        }
        else if(((T)root.value).compareTo(data)<0){
            root.right = delete(root.right, data);
        }
        else{
            if(root.left ==null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.value = findMin(root.right);

            root.right= delete(root.right, (T)root.value);
        }
        return root;
    }

    private T findMin(BSTNode node){
        T min = (T)node.value;
        while(node.left!=null){
            min =(T) node.left.value;
            node = node.left;
        }
        return min;
    }
}
