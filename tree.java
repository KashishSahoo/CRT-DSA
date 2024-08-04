import java.util.*;

@SuppressWarnings("unused")
public class tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        static void inorder(Node temp) {
            if (temp == null) {
                return;
            }
            inorder(temp.left);
            System.out.println(temp.data + " ");
            inorder(temp.right);
        }

        static void preorder(Node temp) {
            if (temp == null) {
                return;
            }
            System.out.println(temp.data + " ");
            preorder(temp.left);
            preorder(temp.right);
        }

        static void postorder(Node temp) {
            if (temp == null) {
                return;
            }
            postorder(temp.left);
            postorder(temp.right);
            System.out.println(temp.data + " ");

        }

        public static void levelorder(Node root) {
            if (root == null) {
                System.out.println("NULL");
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node a = q.peek();
                q.remove();
                System.out.println(a.data + " ");
                if (a.left != null) {
                    q.add(a.left);
                }
                if (a.right != null) {
                    q.add(a.left);
                }
            }
        }

        static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

    static void insert(Node temp, int key){
        if (temp == null) {
            Node root = new Node(key); return;
            }
            Queue<Node> q = new LinkedList<Node>(); q.add(temp); I
            while (Iq.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left == null)
             { temp.left = new Node(key);
            break;
             }
             else{
                q.add(temp.left);
             }
             if (temp.right == null)
             { temp.right = new Node(key);
            break;
             }
             else{
                q.add(temp.right);
             }
             
    }


    static class binaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

        public static void main(String[] args) {
            int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
            binaryTree tree = new binaryTree();
            @SuppressWarnings("static-access")
            Node root = tree.buildTree(nodes);
            preorder(root);
        }
    }
}