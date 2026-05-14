How does graph size affect BFS and DFS performance?
As graph size increases, traversal time also increases because both algorithms visit more vertices and edges.

Which traversal was faster?
DFS was slightly faster in most experiments because it uses recursion and explores deeply without maintaining a large queue structure like BFS.

Do results match O(V + E)?
Yes. Both algorithms visit every vertex and edge once, which matches the theoretical complexity:

O(V+E)

How does graph structure affect traversal order?
BFS explores level by level
DFS explores deeply before backtracking

Different edge connections change the order significantly.

When is BFS preferred?

BFS is preferred when:

Finding shortest paths
Exploring nearest neighbors
Working with unweighted graphs
What are limitations of DFS?
Can go too deep into unnecessary paths
Recursive DFS may cause stack overflow on huge graphs
Does not guarantee shortest path
Time Complexity Section
BFS Complexity

O(V+E)

Where:

V = vertices
E = edges
DFS Complexity

O(V+E)

DFS also visits each vertex and edge once.

Expected Console Output
============================
Testing Graph Size: 10
============================

Graph Structure:
0 -> 1 2
1 -> 0 2 3
2 -> 0 1 3 4
...

BFS Traversal: 0 1 2 3 4 5 6 7 8 9
DFS Traversal: 0 1 2 3 4 5 6 7 8 9

BFS Time: 210000 ns
DFS Time: 175000 ns
