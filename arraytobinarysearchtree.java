public class arraytobinarysearchtree {
    private static TreeNode createnode(int nums[], int left, int right)
    {
        if(left > right)
        {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createnode(nums, left, mid - 1);
        node.right = createnode(nums, mid + 1, right);
        return node;
    }
    public static void main(String[] args) {
        int nums[] = {-10,-3,0,5,9};
        int n = nums.length;
        System.out.println(createnode(nums, 0, n - 1));
    }
}
