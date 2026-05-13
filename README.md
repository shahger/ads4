# Assignment 4: Graph Traversal and Representation System

## A. Project Overview
This project implements a directed graph data structure using an **Adjacency List**. The main goal is to demonstrate the practical application of two fundamental traversal algorithms: **Breadth-First Search (BFS)** and **Depth-First Search (DFS)**, and to analyze their performance across different graph sizes.

## B. Class Descriptions
* **Vertex.java**: Represents a node in the graph with a unique `id`.
* **Edge.java**: Represents a directed connection between a `source` and a `destination` vertex.
* **Graph.java**: The core class managing the graph. It uses a `Map<Integer, List<Integer>>` (Adjacency List) for efficient storage and neighbor lookups.
* **Experiment.java**: Contains the logic for running multiple tests and measuring execution time.
* **Main.java**: The entry point that initializes graphs of sizes 10, 30, and 100, and triggers the benchmarking process.

## C. Algorithm Descriptions

### 1. Breadth-First Search (BFS)
* **Logic**: Explores neighbors level-by-level using a **Queue**. It ensures that all nodes at distance *k* are visited before nodes at distance *k+1*.
* **Time Complexity**: $O(V + E)$, where V is the number of vertices and E is the number of edges.
* **Use Case**: Best for finding the shortest path in unweighted graphs.

### 2. Depth-First Search (DFS)
* **Logic**: Explores as far as possible along each branch before backtracking using **Recursion** (Implicit Stack).
* **Time Complexity**: $O(V + E)$.
* **Use Case**: Ideal for cycle detection and topological sorting.

## D. Experimental Results
*Based on performance tests conducted on an Intel/AMD CPU.*

| Graph Size (Vertices) | BFS Execution Time (ns) | DFS Execution Time (ns) |
|-----------------------|-------------------------|-------------------------|
| 10 Vertices           | 57,600 ns               | 44,100 ns               |
| 30 Vertices           | 162,300 ns              | 134,800 ns              |
| 100 Vertices          | 548,900 ns              | 489,200 ns              |

### Observations:
1.  **Scalability**: The execution time grows linearly as the number of vertices and edges increases, which aligns with the theoretical $O(V + E)$ complexity.
2.  **Efficiency**: In most runs, DFS appeared slightly faster than BFS. This is likely due to the lower overhead of recursive calls compared to the `LinkedList` queue management used in BFS.

## E. Screenshots
<img width="332" height="166" alt="image" src="https://github.com/user-attachments/assets/eed2c178-a2a9-4e0c-830c-b22e630854c7" />
<img width="344" height="154" alt="image" src="https://github.com/user-attachments/assets/b943a3c1-f92e-4306-965a-fed9ab703284" />
<img width="360" height="160" alt="image" src="https://github.com/user-attachments/assets/acb56721-71bd-4903-9727-6770529a04d6" />
<img width="338" height="149" alt="image" src="https://github.com/user-attachments/assets/ec53a4e4-d60c-484f-a4f0-dee4337235cb" />
<img width="311" height="146" alt="image" src="https://github.com/user-attachments/assets/c96d9fad-bbd3-44d5-8a8a-efdb37a2968e" />
<img width="1246" height="151" alt="image" src="https://github.com/user-attachments/assets/7560a479-8a46-4890-ab9d-dba8f34735cc" />
<img width="325" height="150" alt="image" src="https://github.com/user-attachments/assets/9719edba-3c1d-4c48-8e01-3edb9565133e" />
<img width="344" height="157" alt="image" src="https://github.com/user-attachments/assets/aab194a7-ef3a-438f-875b-b5b8b1d4673d" />
<img width="1268" height="156" alt="image" src="https://github.com/user-attachments/assets/bc8dec53-38b3-47d2-a698-7606b161b295" />
<img width="335" height="147" alt="image" src="https://github.com/user-attachments/assets/ff370442-db65-402a-ac94-7eae9b6e7825" />
<img width="558" height="163" alt="image" src="https://github.com/user-attachments/assets/f024274f-1da5-4007-b4f4-772e0ed0a866" />
<img width="365" height="158" alt="image" src="https://github.com/user-attachments/assets/4866dccc-b507-412c-84e5-2d798de7d82d" />
<img width="350" height="159" alt="image" src="https://github.com/user-attachments/assets/26bf2b85-8dc7-4973-b12f-82b212693ae8" />
<img width="352" height="162" alt="image" src="https://github.com/user-attachments/assets/ab73b589-546d-4be4-b625-b4db216bb320" />
<img width="1426" height="167" alt="image" src="https://github.com/user-attachments/assets/25c1721a-40d9-467c-a129-370b9f6a1e0b" />














## F. Reflection
Through this implementation, I learned how data structures directly influence algorithm behavior. Using a **Queue** for BFS naturally creates a "wide" search, while **Recursion** for DFS creates a "deep" search. 

The biggest challenge was setting up the correct project structure in IntelliJ IDEA and ensuring the Adjacency List correctly handles nodes that might not have any outgoing edges. I also gained experience in performance benchmarking using `System.nanoTime()`, which provides much higher precision than `currentTimeMillis()`.
