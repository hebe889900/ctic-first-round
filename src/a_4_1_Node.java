public class a_4_1_Node {
    private a_4_1_Node adjacent[];
    public int adjacentCount;
    private String vertex;
    public a_4_1_route_between_nodes.State state;
    public a_4_1_Node(String vertex, int adjacentLength) {
        this.vertex = vertex;                
        adjacentCount = 0;        
        adjacent = new a_4_1_Node[adjacentLength];
    }
    
    public void addAdjacent(a_4_1_Node x) {
        if (adjacentCount < 30) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.print("No more adjacent can be added");
        }
    }
    public a_4_1_Node[] getAdjacent() {
        return adjacent;
    }
    public String getVertex() {
        return vertex;
    }
}