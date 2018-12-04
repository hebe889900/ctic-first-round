public class a_4_1_Graph {
	private a_4_1_Node vertices[];
	public int count;
	public a_4_1_Graph() {
		vertices = new a_4_1_Node[6];
		count = 0;
    }
	
    public void addNode(a_4_1_Node x) {
		if (count < 30) {
			vertices[count] = x;
			count++;
		} else {
			System.out.print("Graph full");
		}
    }
    
    public a_4_1_Node[] getNodes() {
        return vertices;
    }
}
