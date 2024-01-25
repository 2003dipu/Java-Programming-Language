package BinarySearchTree;

public class Main {
    
    public static void main(String[] args) {

        System.out.println();
        
        BinaryST tree = new BinaryST();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        //tree.remove(1);
        //tree.remove(9);
        tree.remove(7);
        tree.display();

        //System.out.println(tree.search(0));
        //System.out.println(tree.search(5));
        //tree.remove(-5);

        System.out.println();
        
    }
}

/*
 **Here's a detailed explanation of the differences between binary trees and binary search trees, 
 incorporating examples:**

**Binary Tree (BT)**

* **Definition:** A tree data structure where each node can have at most two children, referred to as the left 
child and right child.
* **Order:** No specific order is required for the arrangement of nodes.
* **Duplicates:** Can contain duplicate values.
* **Common Operations:**
    - Insertion: Adding a new node to the tree.
    - Traversal: Visiting each node in a specific order (e.g., in-order, pre-order, post-order).
    - Deletion: Removing a node from the tree.

**Example:**

```
       10
      /  \
     5    15
    / \     \
   2   7     20
```

**Binary Search Tree (BST)**

* **Definition:** A special type of binary tree that follows a specific ordering property:
    - For any node, all values in its left subtree are less than its value.
    - All values in its right subtree are greater than its value.
* **Order:** Nodes are arranged in sorted order.
* **Duplicates:** Typically do not allow duplicate values (though some implementations might).
* **Common Operations:**
    - Search: Efficiently finding a value in the tree (logarithmic time complexity).
    - Insertion: Maintaining the BST property while adding a new node.
    - Deletion: Preserving the BST property while removing a node.

**Example:**

```
      10
     /  \
    5    15
   / \   / \
  2   7 12  20
```

**Key Differences:**

| Feature          | Binary Tree (BT) | Binary Search Tree (BST) |
|------------------|------------------|-------------------------|
| Order            | No specific order | Sorted order             |
| Duplicates       | Allowed           | Typically not allowed    |
| Search efficiency| O(n) worst-case   | O(log n) average case    |
| Common operations| Insertion, traversal, deletion | Search, insertion, deletion |

**In summary:**

- BTs are more general-purpose structures, while BSTs are specifically designed for efficient searching and 
maintaining sorted data.
- The BST's ordering property enables efficient search, insertion, and deletion operations in logarithmic time, 
making it a valuable data structure for various applications involving sorted data.

## Common Use Cases:

**Binary Trees:**

* **Expression trees:** Represent mathematical expressions for efficient evaluation and parsing.
* **File systems:** Organize files and directories in a hierarchical manner.
* **Game AI:** Implement decision trees for character behaviour and pathfinding.
* **Syntax trees:** Represent the structure of programming languages in compilers.
* **Heap data structures:** Used for implementing priority queues and efficient sorting algorithms like heapsort.
* **Binary space partitioning (BSP):** Used in 3D graphics to determine which objects are visible from a specific 
viewpoint.

**Binary Search Trees:**

* **Dictionaries and maps:** Implement key-value pairs for efficient lookup and retrieval.
* **Auto-completion in search engines:** Suggest search terms based on partially entered text.
* **Spelling correction:** Identify and suggest corrections for misspelled words.
* **Database indexing:** Improve searching speed in databases by indexing specific fields.
* **Priority queues with ordered priorities:** Used in scheduling tasks and managing resource allocation.
* **In-memory databases:** Maintain a sorted collection of data for fast access and manipulation.
* **Set data structures:** Efficiently store and check for the presence of unique values.

**Additional Notes:**

* While BSTs generally offer efficient searching and sorting features, unbalanced BSTs can lose these advantages. 
Techniques like self-balancing BSTs (e.g., AVL trees, Red-Black trees) help maintain performance.
* The choice between BTs and BSTs depends on the specific needs of the application. If efficient searching and 
sorted data are essential, BST is a strong contender. For more general-purpose hierarchical structures, BTs might 
be more suitable.

I hope this explanation clarifies the distinct roles and practical applications of both binary trees and binary 
search trees.


 */