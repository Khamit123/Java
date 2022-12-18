package ru.mirea.kvbo1.khamit.practica30;

public class Node implements Comparable<Node> {
    private int data;
    private Node left;
    private Node parent;
    private Node right;

    public Node(int a, Node c) {
        data = a;
        parent = c;
        left = null;
        right = null;
    }

    public Node(int a, Node c, Node b, Node d) {
        data = a;
        parent = c;
        left = b;
        right = d;
    }

    public int size() {
        if (right == null && left == null) return (1);
        else if (left == null) return (1 + right.size());
        else if (right == null) return (left.size() + 1);
        else return (left.size() + 1 + right.size());
    }

    int search(int target) {
        if (this == null) {
            return 0;
        } else {
            if (target == data) return 1;
            else if (target < data) return left.search(target);
            else return right.search(target);
        }
    }

    void add(int a) {
        if (a > data) {
            if (right == null) {
                right = new Node(a, this);
            } else right.add(a);
        }
        if (a < data) {
            if (left == null) {
                left = new Node(a, this);
            } else left.add(a);
        }
    }

    void add(Node a) {
        if (a != null) {
            if (a.getData() > data) {
                if (right == null) {
                    right = a;
                    a.parent = this;
                } else right.add(a);
            }
            if (a.getData() < data) {
                if (left == null) {
                    left = a;
                    a.parent = this;
                } else left.add(a);
            }
        }
    }

    public int getData() {
        return data;
    }

    @Override
    public int compareTo(Node o) {
        if (data > o.getData()) return 1;
        else if (data == o.getData()) return 0;
        else if (data < o.getData()) return -1;
        return 0;
    }

    public void print() {
        if (left != null) {
            left.print();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.print();
        }
    }

    public void delete(int fdata) {
        if (parent != null) {
            if (parent.left != null) {
                if (parent.left.getData() == fdata) {
                    Node n1 = left;
                    Node n2 = right;
                    parent.left = null;
                    parent.add(n1);
                    parent.add(n2);
                }
            }
            if (parent.right != null) {
                if (parent.right.getData() == fdata) {
                    Node n1 = left;
                    Node n2 = right;
                    parent.right = null;
                    parent.add(n1);
                    parent.add(n2);
                }
            }
        }
        if (fdata > data && right != null) right.delete(fdata);
        else if (fdata < data && left != null) left.delete(fdata);
    }


    public void Hoffman(String b) {
        if (left == null & right == null) {
            System.out.println(data + " " + b);
        } else {
            left.Hoffman(b + "0");
            right.Hoffman(b + "1");
        }

    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

class Tree {
    Node root;
    int count;

    public void add(int a) {
        if (root == null) {
            root = new Node(a, null);
        } else root.add(a);
    }

    public void add(Node a) {
        if (a != null) {
            if (root == null) {
                root = a;
            } else root.add(a);
        }
    }

    public void delete(int fdata) {
        if (fdata == root.getData()) {
            root.getLeft().add(root.getRight());
            root = root.getLeft();
        } else root.delete(fdata);
    }

    public void Hoffman() {
        root.Hoffman("");

    }

    public void print() {
        root.print();
    }

    public Tree(Node a) {
        root = a;
    }

    public Tree() {
        root = null;
    }

    public int size() {
        return root.size();
    }

}