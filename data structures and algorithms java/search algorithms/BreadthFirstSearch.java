/*
breadth first search implementation in Java:
BFS = a search algorithm for traversing a tree or graph data structure. This is done one "Level" at a time,
        rather than one "branch" at a time.
 Runtime complexity = 

 */

public class BreadthFirstSearch {

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

        graph.breadthFirstSearch(1);

        System.out.println();

    }
    
}

/*
                        A ---> B
                            /   |
                        E <==>  C  --> D 

Here's the differences breadth and depth first search algorithms

Breadth FS = Traverses a graph level by level
             Utilizes a Queue
             It's better if the destination is on average close to start
             Siblings are visited before children

Depth  FS = Traverses a graph branch by branch
             Utilizes a Stack
             It's better if the destination is on average far from the start
             Children are visited before siblings
             More popular for games/ puzzles
 */