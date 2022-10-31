# BSTNode

A node which contains a single data item and pointers for the left and right child.

## BSTNode class attributes

* value {T} 
* left {BSTNode}
* right {BSTNode}

# Binarytree

A binary tree where nodes with lessor values are placed to the left of the root, and nodes with equal or greater values are placed to the right.

## Binarytree class attributes

* root {BSTNode}

## Usage

### addNode():void

Adds new node to the tree.

### Params

* value {T}
* root {BSTNode}

### Example

```
Binarytree<Integer> test = new Binarytree<>(12);
        test.addNode(14,test.root);
        test.addNode(7,test.root);
        test.addNode(18,test.root);
        test.addNode(3,test.root);
``` 

### search():void

search for node in the tree if the value is exist print out "The value is exist" otherwise print out "The value is not exist" .

### Params

* value {T}
* root {BSTNode}

### Example

```
 test.search(7,test.root);
 //=> The value is exist 
 test.search(200,test.root);
 //=> The value is not exist
``` 
### preOrder():void

The node is visited before it's children.

### Params

* root {editroot}

### Example

```
 test.preOrder(test.root);
 //=> 12  7  3  14  18   
```
### inOrder():void

The left child is visited before the node, then the right child.

### Params

* root {editroot}

### Example

```
 test.inOrder(test.root);
 //=> 3  7  12  14  18 
``` 
### postOrder():void

The left and right children are visited before the node.

### Params

* root {editroot}

### Example

```
 test.postOrder(test.root);
 //=> 3  7  18  14  12   
``` 
### delete():void

Removes the first node whose value is equal to the argument.

### Params

* data {T}

### Example

```
test.delete(7); 
```
