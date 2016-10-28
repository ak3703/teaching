#Recitation: ArrayLists
By James Xue, 10-28-2016

![alt text](http://s14.postimg.org/us6is35ot/arraylistmeme1.jpg "ArrayList Meme 1")
![alt text](http://s14.postimg.org/8ua1yaqod/arraylistmeme2.jpg "ArrayList Meme 2")
![alt text](http://s14.postimg.org/cfaiv9klp/arraylistmeme3.jpg "ArrayList Meme 3")

Standard Java **arrays** are of a fixed length. After arrays are created, they cannot grow or shrink, which means that you must know in advance how many elements an array will hold.

**ArrayLists** are created with an initial size. When this size is exceeded, the collection is automatically enlarged. When objects are removed, the array may be shrunk.

Benefits of ArrayLists:
* An ArrayList automatically expands as data is added. Particularly useful when there's a large variation in amount of data you would put into an array. (good example: your email contact list. bad example: days of the week.)
* Access to any element of an ArrayList is fast! O(1). Insertions and deletions are O(N).
* An ArrayList has methods for inserting, deleting, and searching.
* An ArrayList can be traversed using a foreach loop, iterators, or indexes.

Disadvantages:
* Only holds object types and not primitive types (eg, int). To use a primitive type in an ArrayList, put it inside an object or use of the wrapper classes (eg, Integer, Double, Character, ...) but remember that wrapper classes are immutable. 

## Common Things to Do with ArrayLists

### Initialize an ArrayList
```
ArrayList<String> list = new ArrayList<String>();
```

### Adding
```
list.add("A");
list.add("B");
list.add("C");
```

### Accessing
```
String s = list.get(1);
```
What is s? 

### Printing out each element
```
for (int i = 0; i < a.size(); i++) {
    System.out.println(a.get(i));
}
```

### Removing
```
list.remove(2);
```

### Sorting
```
Collections.sort(list);
```

### Other useful ArrayList methods
| Method Name      | Return Type   | Description                                                 |
| ---------------- |:-------------:| -----------------------------------------------------------:|
| list.set(i,e)    |               | Sets the element at index i to e.                           |
| list.contains(e) | boolean       | Returns true if list contains e                             |
| list.indexOf(e)  | int           | Returns index of first occurrence of e, or -1 if not there. |
