// Adjacency matrix = A 2D array to store 1(ones) and 0(zeros) to represent edges

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {

    ArrayList<Node> nodes;

    int[][] matrix;

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);

    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;

    }

    public boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return true;
        } else {
            return false;
        }

    }

    public void print() {

        System.out.print("   "); // space before the columns
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(nodes.get(i).data + "  "); // space after the rows
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    // -------------------------------------------------------------------------------
    // Depth First search
    public void depthFirstSearch(int src) {

        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {

        if (visited[src]) {
            return;
        } else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dFSHelper(i, visited);                
            }
        }
        return;
    }

    // -------------------------------------------------------------------------------
    // Breadth First search
    public void breadthFirstSearch(int src){

        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[matrix.length];
        queue.offer(src);
        visited[src] = true;

        while (queue.size() != 0) {

            src = queue.poll();
            System.out.println(nodes.get(src).data + " visited");

            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }                
            }
            
        }
    }


}
