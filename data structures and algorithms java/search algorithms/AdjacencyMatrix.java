// Adjacency matrix = A 2D array to store 1(ones) and 0(zeros) to represent edges
/*

Depth First Search (DFS)

A search algorithm for traversing a tree or graph data structure

1. Pick a route
2. Keep going until you reach a dead end, or a previously visited node
3. Backtrack to last node that has unvisited adjacent neighbors

 */

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
        System.out.println();

        graph.depthFirstSearch(4);

        System.out.println();

    }
    
}
/*
I am just trying to do something useful. I recently heard that the two richest person's wealth just got doubled
 */