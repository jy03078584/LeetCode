package Tree;

/**
 * Tree
 * description:树节点
 * author:mingzhe Xiang
 * date:2016/11/17
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	//    @Override
	//    public String toString() {
	//        return "TreeNode{" +
	//                "val=" + val +
	//                ", left=" + left +
	//                ", right=" + right +
	//                '}';
	//    }
}
