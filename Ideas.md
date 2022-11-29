# Source code differencing

>  Detecting differences between two versions of source code

The problem of computing good AST edit scripts is hard, with two main challenges: handling **move actions**, and **scaling to fine-grained ASTs with thousands of nodes**.
  
### AST design

> Which information to keep or discard

Abstract Syntax Tree is a kind of tree representation of the abstract syntactic structure of source code written in a programming language. Each node of the tree denotes a construct occurring in the source code.

ASTs can be of **different granularity**. For instance, a node could be as coarse as a whole statement or as fine grained as a single literal. We think that a finer granularity is preferable, since it allows the extraction of a more **detailed edit script**. If the edit script ends up being too long, we can think about a way to apply filters that can help the user to better understand the edit script. It is better to get more information that can be sorted out, than not enough information that could make the changes difficult to understand.

On another hand, the longer the edit script is, the longer it is to nuild it. We also have to think about the speed efficiency of our algorithm.

For better results, we think that it's necessary that the AST constructor is language-aware.

### Method of Comparison

> The order of comparison for nodes

### Matching Criteria.

> Key ideas to improve performance (both correctness/runtime)
> Matching criteria: How can we decide, whether two nodes are matched?

#### Sources

- [AST](https://en.wikipedia.org/wiki/Abstract_syntax_tree)
- [Understanding Code Changes With AST Differencing](https://project.inria.fr/se-seminars/understanding-code-changes-with-ast-differencing/)
- [Abstract Syntax Tree (AST) in Java](https://www.geeksforgeeks.org/abstract-syntax-tree-ast-in-java/)
