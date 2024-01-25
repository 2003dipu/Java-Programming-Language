// Adjacency Lists = An array or arraylist of linkedlists.

public class AdjacencyList {

    public static void main(String[] args) {

        System.out.println();
        
        ALGraph graph = new ALGraph();
        
        graph.addNode(new ALNode('A'));
        graph.addNode(new ALNode('B'));
        graph.addNode(new ALNode('C'));
        graph.addNode(new ALNode('D'));
        graph.addNode(new ALNode('E'));
        
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        System.out.println();
    }
    
}
