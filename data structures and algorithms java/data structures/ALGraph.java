// Adjacency Lists = An array or arraylist of linkedlists.

import java.util.ArrayList;
import java.util.LinkedList;

public class ALGraph {

    ArrayList<LinkedList<ALNode>> alist;

    ALGraph() {
        alist = new ArrayList<>();

    }

    public void addNode(ALNode node) {

        LinkedList<ALNode> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);

    }

    public void addEdge(int src, int dst) {
        LinkedList<ALNode> currentList = alist.get(src);
        ALNode dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {

        LinkedList<ALNode> currentList = alist.get(src);
        ALNode dstNode = alist.get(dst).get(0);

        for(ALNode node : currentList){
            if (node == dstNode) {
                return true;           
            }
        }
        return false;
    }

    public void print() {

        for(LinkedList<ALNode> currentList : alist){
            for(ALNode node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }

    }

}
