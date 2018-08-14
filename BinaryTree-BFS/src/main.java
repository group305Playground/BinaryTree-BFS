/**
 * 
 */

/**
 * @author marcuscoates
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		Node root = new Node(5);
		root.setLeft(new Node(10));
		root.setRight(new Node(15));
		root.getLeft().setLeft(new Node(20));
		root.getLeft().setRight(new Node(25));
		root.getRight().setLeft(new Node(30));
		root.getRight().setRight(new Node(35));

		BFS i = new BFS(root);
		i.iterate();
	}

}
