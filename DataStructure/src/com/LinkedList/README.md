# Node

A node which contains a single data item and pointers for the  next and previous node. 

## Node class attributes

* value {T} 
* next {Node}
* previous {Node}

# Doublylinkedlist

A linked list that provides forward iteration from the start to the end of the list, and reverse iteration, from end to start.

## Doublylinkedlist class attributes

* head {Node}
* tail {Node}

## Usage

### addHead():void

Adds a value to the beginning of the linked list.

### Params

* item {T}

### Example

```
 Doublylinkedlist<Integer> test = new Doublylinkedlist<>();
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

* store {Doublylinkedlist}

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

* store {Doublylinkedlist}

## Usage

### Enqueue():void

Adds a value to the top of the queue.

### Params

* item {T}

### Example

```
queue<Integer> testqueue=new queue<>();
 testqueue.Enqueue(5);
 testqueue.Enqueue(6);
 testqueue.Enqueue(7);
 testqueue.Enqueue(8);
``` 

### Dequeue():T

Returns the bottom value of the queue and removes it.

### Example

```
 System.out.println(testqueue.Dequeue());
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

* store {Doublylinkedlist}

## Usage

### EnqueueHead():void

Adds a value to the top of the dequeue.

### Params

* item {T}

### Example

```
dequeue<Integer> testqueue=new dequeue<>();
 testqueue.EnqueueHead(5);
 testqueue.EnqueueHead(6);
``` 

### Enqueuetail():void

Adds a value to the bottom of the dequeue.

### Params

* item {T}

### Example

```
 testqueue.Enqueuetail(7);
 testqueue.Enqueuetail(8);
``` 

### DequeueHead():T

Returns the top value of the queue and removes it.

### Example

```
 System.out.println(testqueue.DequeueHead());
 //=> 6
    
```  
### Dequeuetail():T

Returns the bottom value of the queue and removes it.

### Example

```
 System.out.println(testqueue.Dequeuetail());
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
