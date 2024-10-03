# BinarySearchTree
This is a binary search tree made in java that does <br>
Pre-order, In-order, and Post-order traversal. Also displays it afterwards

<h1>Sample input</h1>

```
dbca
```

output:

```
Preorder: d b a c 
Inorder: a b c d 
Postorder: a c b d 

Enter a character to search for: 
b
The character 'b' was found.
```

Explanation:
Preorder Traversal (Root-Left-Right): Starts from the root d, visits the left child b, then visits a, and finally c. The output is: d b a c.
Inorder Traversal (Left-Root-Right): Visits the leftmost node a, then b, then c, and finally the root d, resulting in a sorted order: a b c d.
Postorder Traversal (Left-Right-Root): Visits a, then c, then b, and finally d. The output is: a c b d.
