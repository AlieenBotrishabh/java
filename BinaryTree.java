import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        BinaryTree ss = new BinaryTree();
        
        // Test cases
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        System.out.println("Inorder traversal: " + ss.inorderTraversal(root1)); // Output: [1, 3, 2]
        
        TreeNode root2 = null;
        System.out.println("Inorder traversal: " + ss.inorderTraversal(root2)); // Output: []
        
        TreeNode root3 = new TreeNode(1);
        System.out.println("Inorder traversal: " + ss.inorderTraversal(root3)); // Output: [1]
    }
}
