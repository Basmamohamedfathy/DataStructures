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



       
       



