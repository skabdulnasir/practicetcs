class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;
    BinaryTree(){
        root = null;
    }
    public void insert(int data){
        root = insertInRecursive(root, data);
        System.out.println("Inserted: "+data);
    }
    public Node insertInRecursive(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data > root.data){
            root.right = insertInRecursive(root.right, data);
        } else if(data < root.data){
            root.left = insertInRecursive(root.left, data);
        }
        return root;
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    
    public void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    void postorderTraversal(){
        postorder(root);
        System.out.println();
    }

    void preorderTraversal(){
        preorder(root);
        System.out.println();
    }

    void inorderTraversal(){
        inorder(root);
        System.out.println();
    }

    
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(5);
        bt.insert(1);
        bt.insert(3);
        bt.insert(2);
        bt.insert(4);
        bt.insert(7);

        bt.postorderTraversal();
        bt.inorderTraversal();
        bt.preorderTraversal();
        
        
    }
}
