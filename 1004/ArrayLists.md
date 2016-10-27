#Recitation: ArrayLists
By James Xue, 10-28-2016

![alt text](http://s14.postimg.org/us6is35ot/arraylistmeme1.jpg "ArrayList Meme 1")
![alt text](http://s14.postimg.org/8ua1yaqod/arraylistmeme2.jpg "ArrayList Meme 2")
![alt text](http://s14.postimg.org/cfaiv9klp/arraylistmeme3.jpg "ArrayList Meme 3")

Standard Java **arrays** are of a fixed length. After arrays are created, they cannot grow or shrink, which means that you must know in advance how many elements an array will hold.

**ArrayLists** are created with an initial size. When this size is exceeded, the collection is automatically enlarged. When objects are removed, the array may be shrunk.

Benefits of ArrayLists:
An ArrayList automatically expands as data is added.
Access to any element of an ArrayList is O(1). Insertions and deletions are O(N).
An ArrayList has methods for inserting, deleting, and searching.
An ArrayList can be traversed using a foreach loop, iterators, or indexes.
Use ArrayList when there will be a large variation in the amount of data that you would put into an array. Arrays should be used only when there is a constant amount of data. For example, storing information about the days of the week should use an array because the number of days in a week is constant. Use an array list for your email contact list because there is no upper bound on the number of contacts.

A possible disadvantage of ArrayList is that it holds only object types and not primitive types (eg, int). To use a primitive type in an ArrayList, put it inside an object or use of the wrapper classes (eg, Integer, Double, Character, ...). The wrapper classes are immutable, so if you use, eg, Integer, you will not be able to change the integer value. In this case it may be more useful to define your own mutable class.

Initialize an ArrayList
ArrayList<String> list = new ArrayList<String>();

Common Things to Do with ArrayLists
Adding
list.add("A");
list.add("B");
list.add("C");

Getting
s = a.get(i); // Assigns ith element from a to s.

Deleting

Printing out each element
for (int i = 0; i < a.size(); i++) {
    System.out.println(a.get(i));
}


Sorting
Collections.sort(yourArrayList);


Other useful ArrayList methods
	a.set(i,e)	Sets the element at index i to e.
  	a.toArray()
    b = 	a.contains(e)	Returns true if ArrayList a contains e
    a.indexOf(e)	Returns index of first occurrence of e, or -1 if not there.
    a.remove(i)	Removes the element at position i.
