// Adjacency matrix = A 2D array to store 1(ones) and 0(zeros) to represent edges

public class AdjacencyMatrix {

    public static void main(String[] args) {

        System.out.println();

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));    
        
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        System.out.println(graph.checkEdge(0, 2));

        System.out.println();

    }
    
}
