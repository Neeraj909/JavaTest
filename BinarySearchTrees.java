package java8features;

public class BinarySearchTrees {
     Node root;
    class Node{
        Node left;
        Node right;
        int value;
        Node(int value){
            this.value=value;
        }

    }
    public boolean insertNode(int value){
        Node newNode=new Node(value);
        Node temp=root;
        if(temp==null){
            root=newNode;
            return true;
        }
        while (true){
            if(root.value==newNode.value){
                return false;
            }
            if(newNode.value< temp.value){
                if(temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }
            else {
                if(temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp=temp.right;

            }
        }

    }
    public boolean containsTree(int value){
        Node temp=root;
        while (temp!=null){
            if(value<temp.value){
                temp=temp.left;
            } else if (value> temp.value) {
                temp=temp.right;
            }
            else{
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTrees binarySearchTrees=new BinarySearchTrees();
        System.out.println(binarySearchTrees.root);
        BinarySearchTrees.Node n=binarySearchTrees.new Node(2);
        System.out.println(n.left);
        binarySearchTrees.insertNode(47);
        binarySearchTrees.insertNode(21);
        binarySearchTrees.insertNode(76);
        binarySearchTrees.insertNode(18);
        binarySearchTrees.insertNode(52);
        binarySearchTrees.insertNode(82);
        binarySearchTrees.insertNode(27);
        binarySearchTrees.insertNode(15);
        binarySearchTrees.insertNode(15);
        System.out.println(binarySearchTrees.root.left.left.left.value);
        System.out.println(binarySearchTrees.containsTree(27));
    }
}
