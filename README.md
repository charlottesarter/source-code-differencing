# Source Code Differencing

## First progress report

### What we have done so far?

We downloaded the [3-0-0 version of gumtree](https://github.com/GumTreeDiff/gumtree/releases), and we ran the algorithm on java files with minor differences to get a better understanding on how gumtree works, and of the different parameters we can play with.

### Issues

- We don't know how to handle the evaluation on the 500 changes
- We don't really understand how we are supposed to modify the gumtree algorithm

### Plan

We would like to discuss with you to clarify your expectations and to better understand what we need to do next.

We also would like to ask you if we are supposed to improve the gumtree algorithm, or if we can start from an easier SCD algorithm and try to improve this one so it has better results than gumtree.

For now we plan to look more into gumtree source code to try to understand which part of the code we can possibly improve.

### Answers

- We don't have to modify gumtree. We can start from scratch our own algorithm.
- Parser -> TreeNode
- **We have to match the nodes by visiting the two trees (new and old)**
- Focus on how we can match the two nodes
- Call the method diffGumTree
- Clone the repository and use the parser and gumtree
- Try diffGumTreeWithGrouping
- Focus on Java
- AST design -> by changing java visitor code

#### Authors

- Assel
- Charlotte
- Elvin
- Nurbek
