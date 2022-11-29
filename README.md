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

## Second progress report

### What we have done so far?

We have cloned the repository [JCodeLib](https://github.com/seoultech-selab/JCodeLib) into our own to be able to modify the code. We added all the dependencies with maven to run the code. 

We have read and tried to understand the logic of the code in the 'DiffPaser' and 'TreeNode' files, but it is difficult to grasp the nuances of the code without testing it.

We wasted a lot of time trying to get the code to work without success and felt like we were up against a wall because the starting point of the project doesn't work and doesn't help us develop our ideas. 

### Issues

We tried to run the code, especially the methods 'diffGumTree' and 'diffGumTreeWithGrouping' as you adviced us to do, but we have some dependencies issues that we have not been able to make work. 

### Plan

For a long time we were stuck with the code that didn't work, so we decided to focus our research on the theoretical part of the project. We are thinking about more ideas about how to improve the internal node matching.

As the code of the JCodeLib repository is not running, we want to implement our own parser based and inspired on the code of the repository. 

#### Authors

- Assel
- Charlotte
- Elvin
- Nurbek
