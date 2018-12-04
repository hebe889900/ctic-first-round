import java.util.LinkedList;

public class a_4_1_route_between_nodes {
	public enum State {Unvisited, Visited, Visiting;}
	
	boolean search(a_4_1_Graph g, a_4_1_Node start, a_4_1_Node end) {
		if (start == end) {
			return true;
		}
		
		LinkedList<a_4_1_Node> q = new LinkedList<a_4_1_Node>();
		
		for (a_4_1_Node u: g.getNodes()) {
			u.state = State.Unvisited;
		}
		
		start.state = State.Visited;
		q.add(start);
		a_4_1_Node u;
		while(!q.isEmpty()) {
			u = q.removeFirst();
			if (u != null) {
				for (a_4_1_Node v : u.getAdjacent()) {
					if (v.state == State.Unvisited) {
						if (v == end) {
							return true;
						} else {
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
			}
			u.state = State.Visited;
		}
		
		return false;
	}
}
