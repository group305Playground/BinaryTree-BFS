/**
 * 
 */

/**
 * @author marcuscoates
 *
 */
public class Node {
	private Node left;
	private Node right;
	private int data;
	
	public Node(int data) {
		this.setData(data);
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	
}
