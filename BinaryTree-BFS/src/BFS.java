import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */

/**
 * @author marcuscoates
 *
 */
public class BFS {
	Node root;
	public BFS(Node root) {
		System.out.println("Breadth First Search : ");
		this.root = root;
	}
	
	public void iterate() {
		// Create queue
		// Add root to queue
		
		Queue<Node> q = new LinkedList<Node>();
		if (root == null)
			return;
		q.add(root);
		
		while(!q.isEmpty()) {
			Node n = q.remove();
			System.out.print(" " + n.getData());
			if(n.getLeft() != null) {
				q.add(n.getLeft());
			}
			if(n.getRight() != null) {
				q.add(n.getRight());
			}
		}
	}
}
