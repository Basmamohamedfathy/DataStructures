# Node

A node which contains a single data item and pointers for the  next and previous node. 

## Node class attributes

* value {T} 
* next {Node}
* previous {Node}

# Dlinkedlist

A linked list that provides forward iteration from the start to the end of the list, and reverse iteration, from end to start.

## Dlinkedlist class attributes

* head {Node}
* tail {Node}

## Usage

### addHead():void

Adds a value to the beginning of the linked list.

### Params

* item {T}

### Example

```
 Dlinkedlist<Integer> test = new Dlinkedlist<>();
 test.addHead(5);
```   
    
### addTail():void

Adds a value at the end of the linked list.

### Params

* item {T}

### Example

```
 test.addTail(3);
```        
    
### find():Node

Finds the first node whose value equals the provided argument and return this Node.

### Params

* element {T}
* returns {Node}

### Example

```
 Dlinkedlist<Integer> test = new Dlinkedlist<>();
 test.find(5);
``` 

### contains():Boolean

Returns true if the specified value exists in the list, false otherwise.

### Params

* element {T}
* returns {Boolean}

### Example

```
 test.contains(5);
 //=> true
 test.contains(5);
 //=> false
``` 
### enumeration():void

Enumerate from the head to the tail and Print out the list values.

### Example

```
 test.enumeration();
 //=> [5,3]
    
``` 
### reverseEnumeration():void

Enumerate from the tail to the head and Print out the list values.

### Example

```
 test.reverseEnumeration();
 //=> [3,5]
    
``` 
### removeHead():void

Removes the first value of the linked list.

### Example

```
 test.removeHead();
    
``` 
### removeTail():void

Removes the last value of the linked list.

### Example

```
 test.removeTail();
    
``` 
### remove():void

Removes the first node whose value is equal to the argument.

### Params

* element {T}

### Example

```
 test.remove(5);
``` 
    
### size():int

Returns the size of the linked list.

### Params

* returns {int}

### Example

```
 System.out.println(test.size());
 //=> 2
    
``` 
# stack

A Last-in, First-out (LIFO) data container

## stack class attributes

* store {Dlinkedlist}

## Usage

### push():void

Adds a value to the top of the stack.

### Params

* item {T}

### Example

```
stack<Integer> testStack=new stack<>();
 testStack.push(5);
 testStack.push(6);
 testStack.push(7);
 testStack.push(8);
 
```

### pop():T

Returns the top value of the stack and removes it.

### Example

```
 System.out.println(testStack.pop());
 //=> 8
    
```   
### peek():T

Returns the top value of the stack .

### Example

```
 System.out.println(testStack.peek());
 //=> 7
    
```   

### size():int

Returns the size of the stack.

### Example

```
 System.out.println(testStack.size());
 //=> 3
    
```
# queue

A First-in, First-out (FIFO) data container

## queue class attributes

* store {Dlinkedlist}

## Usage

### push():void

Adds a value to the top of the queue.

### Params

* item {T}

### Example

```
queue<Integer> testqueue=new queue<>();
 testqueue.push(5);
 testqueue.push(6);
 testqueue.push(7);
 testqueue.push(8);
``` 

### pop():T

Returns the bottom value of the queue and removes it.

### Example

```
 System.out.println(testqueue.pop());
 //=> 5
```   
### peek():T

Returns the bottom value of the queue .

### Example

```
 System.out.println(testqueue.peek());
 //=> 6
    
```   

### size():int

Returns the size of the queue.

### Example

```
 System.out.println(testqueue.size());
 //=> 3
    
``` 
# dequeue

A queue-like container which is both First-in, First-out and Last-in, Last-out.

## dequeue class attributes

* store {Dlinkedlist}

## Usage

### pushHead():void

Adds a value to the top of the dequeue.

### Params

* item {T}

### Example

```
dequeue<Integer> testqueue=new dequeue<>();
 testqueue.pushHead(5);
 testqueue.pushHead(6);
``` 

### pushtail():void

Adds a value to the bottom of the dequeue.

### Params

* item {T}

### Example

```
 testqueue.pushtail(7);
 testqueue.pushtail(8);
``` 

### popHead():T

Returns the top value of the queue and removes it.

### Example

```
 System.out.println(testqueue.popHead());
 //=> 6
    
```  
### poptail():T

Returns the bottom value of the queue and removes it.

### Example

```
 System.out.println(testqueue.poptail());
 //=> 8
    
```  
### peekHead():T

Returns the top value of the queue.

### Example

```
 System.out.println(testqueue.peekHead());
 //=> 5
    
```  
### poptail():T

Returns the bottom value of the queue.

### Example

```
 System.out.println(testqueue.peekHead());
 //=> 7
    
```  

### size():int

Returns the size of the queue.

### Example

```
 System.out.println(testqueue.size());
 //=> 2
    
```
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
# Entity

## Entity class attributes

* value {T} 
* key {K}
* next {Entity}

# HashTable

data structure that implements an associative array or dictionary, an abstract data type that maps keys to values.

## HashTable class attributes

* size {int}
* arrayHash {Entity}

## Usage

### put():void

Adds a value to the HashTable.

### Params

* value {T} 
* key {K}

### Example

```
 HashTable<Integer,String> table=new HashTable<>(8);
    table.put(5,"basma");
    table.put(10,"mohamed");
    table.put(7,"fathy");
    table.put(9,"no");
```
### getValue():T

Returns value based on the key.

### Params
 
* key {K}

### Example

```
System.out.println(table.getValue(9));
//=> no

```
### remove():void

Removes value based on the key.

### Params

* key {K}

### Example

```
table.remove(9);

```



       
       



